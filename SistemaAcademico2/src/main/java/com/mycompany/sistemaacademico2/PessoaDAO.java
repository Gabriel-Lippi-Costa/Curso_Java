package com.mycompany.sistemaacademico2;

public class PessoaDAO {
    
    public void cadastrar(Pessoa pessoa) {
        String sql = "insert into tb_aluno(nome, fone, email) values (?, ?, ?)";
        var factory = new ConnectionFactory();
        try (var c = factory.obterConexao()) {
            var ps = c.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getFone());
            ps.setString(3, pessoa.getEmail());
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
