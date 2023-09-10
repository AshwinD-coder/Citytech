package FactoryPattern;

import com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;

import java.sql.*;

public class MySQLConfiguration implements DatabaseConfigurationImp {
    String mysqlUrl;
    String mysqlUsername;
    String mysqlPassword;

    public MySQLConfiguration(String mysqlUrl, String mysqlUsername, String mysqlPassword) {
        this.mysqlUrl = mysqlUrl;
        this.mysqlUsername = mysqlUsername;
        this.mysqlPassword = mysqlPassword;
    }

    @Override
    public void fetchData(Connection connection) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String sql = """
                    SELECT * FROM details
                    """;
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phoneNumber = resultSet.getString(3);
                System.out.println(
                        "Id:" + id + "\t|| " + "Name:" + name + "\t|| " + "Phone Number:" + phoneNumber
                );

            }
        } catch (SQLException e) {
            throw new MySQLQueryInterruptedException("Could not fetch data");
        } finally {
            connection.close();
            System.out.println("Connection closed!");
        }

    }

    @Override
    public Connection connectDatabase()  {
        try {
            Connection connection = DriverManager.getConnection(mysqlUrl, mysqlUsername, mysqlPassword);
            System.out.println("Connection established in MySQL");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}
