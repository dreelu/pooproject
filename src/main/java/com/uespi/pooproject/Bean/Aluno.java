/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uespi.pooproject.Bean;

import java.util.Date;
/**
 *
 * @author CTU
 */
public class Aluno {
    public Aluno(){};
    
    // Atributos
    private int matricula;
    private String nome;
    private int idade;
    private Date dataNascimento; 
    private String telefone;
    private String cpf; 
    
    // Getters
    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public Date getDataNasc() { return dataNascimento; }
    public String getTelefone() { return telefone; }
    public String getCPF() { return cpf; }
    
    // Setters
    public void setMatricula(int matricula) { this.matricula = matricula; }
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setDataNasc(Date dataNascimento) {this.dataNascimento = dataNascimento; }
    public void setTelefone(String telefone) { this.telefone = telefone; } 
    public void setCPF(String CPF) { this.cpf = CPF; }
    
    
    
}
