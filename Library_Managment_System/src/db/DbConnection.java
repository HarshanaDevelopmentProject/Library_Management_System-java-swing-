package db;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbConnection {

    public Connection getDbConnection() {

        String port = "3306"; //port number of database
        String user = "root"; //database user name
        String password = ""; //database password

        Connection conn = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/library_management_system", user, password);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Connection Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return conn;

    }

}
