/*
 Esta classe é responsavel pela comunicação do Aplicativo com a base de dados MySQL;
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD{

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3307/mydb","root","emilson");
    }

}
