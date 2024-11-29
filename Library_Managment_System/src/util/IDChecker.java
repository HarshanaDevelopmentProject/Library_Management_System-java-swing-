package util;

import db.DbConnection;
import exception.IDnotValidException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class IDChecker {

    public void checkID(String id, String columnName, String tableName) throws IDnotValidException {
        DbConnection db = new DbConnection();

        String sql = "SELECT " + columnName + " FROM " + tableName + " WHERE " + columnName + " =?;";

        try {
            PreparedStatement statement = db.getDbConnection().prepareStatement(sql);
            statement.setString(1, id);

            ResultSet result = statement.executeQuery();

            if (!result.next()) {
                throw new IDnotValidException(id + " not valid");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "TD checking error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
