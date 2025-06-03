
package com.mycompany.sistemaacademico2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    
    private int idUsuario;
    private String nome;
    private String fone;
    private String email;
    
    
    public void cadastrar() {
        String sql = "insert into tb_pessoa(nome, fone, email) values (?, ?, ?)";
        
    }
}
