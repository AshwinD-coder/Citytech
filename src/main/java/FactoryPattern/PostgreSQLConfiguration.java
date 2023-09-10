package FactoryPattern;

import java.sql.*;

public class PostgreSQLConfiguration implements DatabaseConfigurationImp {
    String postgresqlUrl;
    String postgresqlUsername;
    String postgresqlPassword;


    public PostgreSQLConfiguration(String postgresqlUrl, String postgresqlUsername, String postgresqlPassword) {
        this.postgresqlUrl = postgresqlUrl;
        this.postgresqlUsername = postgresqlUsername;
        this.postgresqlPassword = postgresqlPassword;
    }

    @Override
    public Connection connectDatabase() {
        try {
            Connection connection = DriverManager.getConnection(postgresqlUrl, postgresqlUsername, postgresqlPassword);
            System.out.println("Connection Established in PostgreSQL");
            return connection;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void fetchData(Connection connection) throws SQLException {
        try {
            String sql = """
                    SELECT * FROM worker
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet;
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String department = resultSet.getString(4);
                int salary = resultSet.getInt(5);
                System.out.println(
                        "Id:" + id + "\t|| " +
                                "First Name:" + firstName + "\t|| " +
                                "Last Name:" + lastName + "\t|| "
                                + "Department:" + department + "\t|| " +
                                "Salary:" + salary
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
            System.out.println("Connection closed!");
        }
    }
}
