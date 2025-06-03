
package com.mycompany.sistemaacademico2;

public class Pessoa {
    
    private int idUsuario;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(int idUsuario, String nome, String fone, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
