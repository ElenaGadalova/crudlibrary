package com.sda.database;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import com.sda.database.connection.DatabaseConnection;
import com.sda.database.connection.H2DatabaseConnection;
import com.sda.database.connection.MysqlDatabaseConnection;
import com.sda.database.property.ConnectionProperty;
import com.sda.database.repository.EmployeeRepository;

public class CrudExample {

    public static void main(String[] args) {

        DatabaseConnection mysqlDatabaseConnection = new MysqlDatabaseConnection();
        ConnectionProperty connectionProperty = mysqlDatabaseConnection.getConnectionProperties
                ("src/main/resources/mysql.properties");

        System.out.println(
                String.format("Driver Name: %s, Database Name: %s, Username: %s, Password: %s",
                        connectionProperty.getDriverName(), connectionProperty.getDatabaseUrl(),
                connectionProperty.getUsername(), connectionProperty.getPassword()));

        ((MysqlDatabaseConnection) mysqlDatabaseConnection).open(connectionProperty);
       // EmployeeRepository employeeRepository = new EmployeeRepository(databaseConnection);

       /* DatabaseConnection h2DatabaseConnection = new H2DatabaseConnection();
        EmployeeRepository employeeRepository1 = new EmployeeRepository(h2DatabaseConnection);*/

    }
}
