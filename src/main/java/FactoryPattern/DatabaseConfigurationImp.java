package FactoryPattern;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConfigurationImp {
    Connection connectDatabase();
    void fetchData(Connection connection) throws SQLException;
}
