package FactoryPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void connectFetchDatabase(String database) throws SQLException {
        if (database.equalsIgnoreCase("mysql")) {
            DatabaseConfigurationImp mysqlConnection = new MySQLConfiguration(
                    "jdbc:mysql://localhost:3306/contact",
                    "root",
                    "");
            Connection connection = mysqlConnection.connectDatabase();
            mysqlConnection.fetchData(connection);
        } else if (database.equalsIgnoreCase("postgresql")) {
            DatabaseConfigurationImp postgresqlConnection = new PostgreSQLConfiguration(
                    "jdbc:postgresql://localhost:5432/sql-task",
                    "postgres",
                    "admin"
            );
            Connection connection = postgresqlConnection.connectDatabase();
            postgresqlConnection.fetchData(connection);
        } else {
            System.out.println("Enter valid database.");
        }
    }

    public static void main(String[] args) throws SQLException {
        String database;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select (postgresql/mysql) :");
        database = scanner.nextLine();
        connectFetchDatabase(database);
    }
}
