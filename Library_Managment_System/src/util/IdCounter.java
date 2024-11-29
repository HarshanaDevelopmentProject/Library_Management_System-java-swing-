package util;

import db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class IdCounter {

    public String getId(String firstLetter, String columnName, String tableName) {
        String idFormat = firstLetter + "-001"; //this is type of id

        String sql = "SELECT " + columnName + " FROM " + tableName + " ORDER BY " + columnName + " DESC LIMIT 1;"; //to get last id from column
        try {
            DbConnection db = new DbConnection();
            PreparedStatement statement = db.getDbConnection().prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            String lastId = null;
            if (result.next()) {
                lastId = result.getString(columnName); //to get result and store in variable
            } else {
                return idFormat;
            }

            String numberPart = lastId.substring(2);//to remove prefix charator

            int nextNumber = Integer.parseInt(numberPart) + 1;//increment bu one

            String nextId = String.format(firstLetter + "-%03d", nextNumber);//convert again string format

            return nextId;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Id Counter Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

}
