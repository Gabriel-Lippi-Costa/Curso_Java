
package com.mycompany.sistemaacademico2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_alunos";
    private static String usuario = "root";
    private static String senha = "dbPessoal123";
    
    public Connection obterConexao() {
        try {
            var c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + db +
                "?useTimezone=true&serverTimezone=UTC",
                usuario,
                senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
