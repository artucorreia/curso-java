package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
            "DELETE FROM DEPARTMENT " +
                    "WHERE ID = ?"
            );
            preparedStatement.setInt(1, 2);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done! Row Affected: " + rowsAffected);
        }
        catch (SQLException e) {
            e.getStackTrace();
        }
    }
}