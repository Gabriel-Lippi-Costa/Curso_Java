package com.mycompany.sistemagerenciamentocursos.persistencias;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "sistema_cursos";
    private static String user = "root";
    private static String password = "dbPessoal123";
    
    
    public static Connection obterConexao() {
        try {
          var c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + 
            db + "?userTimezone=true&serverTimezone=UTC", user,
            password
          );
          return c;
        } catch(Exception e) {
          e.printStackTrace();
          return null;
        }
    }
    
}
