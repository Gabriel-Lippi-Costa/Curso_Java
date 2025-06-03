package com.mycompany.sistemaacademico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existe(Usuario usuario)
            throws Exception{ 
        String sql = "SELECT * FROM " +
            "tb_usuario WHERE " +
            "login = ? AND senha = ?";
        try(Connection conn = 
                ConexaoBD.obtemConexao();
            PreparedStatement ps =
                conn.prepareStatement(sql)
        ){
            ps.setString(1,usuario.getLogin());
            ps.setString(2,usuario.getSenha());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();   
            }
        }   
    }
    
    public void inserir(Curso curso) throws Exception{
        String sql = "INSERT INTO tb_curso(nome, tipo) "
                + "VALUES (?,?)";
        
        try(Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            ps.execute();
        }
    } 
    
    public void atualizar(Curso curso) throws Exception{
        String sql = "UPDATE tb_curso SET " +
        "nome = ?, tipo = ? WHERE id = ?";
        
        try(Connection conn = ConexaoBD.obtemConexao();
            PreparedStatement ps = 
            conn.prepareStatement(sql)){
            
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            ps.setInt(3, curso.getId());
            ps.execute();
        }
    }
    
public void excluir(Curso curso) throws Exception{
    
    String sql = "DELETE FROM tb_curso WHERE id = ?";
    
    try(Connection conn = ConexaoBD.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
        
        ps.setInt(1, curso.getId());
        ps.execute();
    }
}
}
