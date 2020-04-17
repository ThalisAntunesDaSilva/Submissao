/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Girardon
 */
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        try {
         Connection connection = new ConnectionFactory().getConnection();
         System.out.println("Sucesso Conexão Aberta!");
         connection.close();
        } catch (SQLException e) {
            throw new SQLException("Problemas nos parâmetros de conexão.\n" + e.getMessage());
        }
     }
}
