package com.mycompany.sistemaacademico;

// Serve para realizar a conexão do JAVA

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

// com o MySQL Server
public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_sistemaacademico"; 
    private static String usuario = "root"; //usuario Alunos
    private static String senha = "root"; //senha alunos
    
    public static Connection obtemConexao(){
        try{
         Connection c =
          DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta +
             "/" + db + 
             "?useTimezone=true&serverTimezone=UTC",
             usuario, senha
          );
         return c;
        }catch(SQLException e){
            return null;
        }
    }
}
