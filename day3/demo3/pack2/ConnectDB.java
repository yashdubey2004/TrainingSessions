package day3.demo3.pack2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection cc = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company",
                "root",
                "yash2004")) {
            System.out.println("Connection established");
        }
    }
}
