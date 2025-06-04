package com.mycompany.sistemagerenciamentocursos.modelos;

public class Curso {
  private int idCurso;
  private String nome;
  private String tipo;

  public Curso(int idCurso, String nome, String tipo) {
    this.idCurso = idCurso;
    this.nome = nome;
    this.tipo = tipo;
  }

  public int getIdCurso() {
    return idCurso;
  }

  public void setIdCurso(int idCurso) {
    this.idCurso = idCurso;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  @Override
  public String toString() {
    return this.nome;
  }
  
}
