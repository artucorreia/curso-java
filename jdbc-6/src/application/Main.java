package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            connection.setAutoCommit(false);
            statement.executeUpdate("UPDATE SELLER SET BASESALARY = BASESALARY - 100 WHERE ID = 8");

            if (true) {
                throw new SQLException("fake error");
            }

            statement.executeUpdate("UPDATE SELLER SET BASESALARY = BASESALARY + 100 WHERE ID = 9");
            connection.commit();
        }
        catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException exception) {
                throw new DbException(exception.getMessage());
            }
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}