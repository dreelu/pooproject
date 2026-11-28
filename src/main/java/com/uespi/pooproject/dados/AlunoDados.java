/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uespi.pooproject.dados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import com.uespi.pooproject.Bean.Aluno;


/**
 *
 * @author CTU
 */
public class AlunoDados {

    public ArrayList<Aluno> alunosLista = new ArrayList();

    public void salvarAluno(Aluno a) {
        
        for (Aluno al : alunosLista) {
            if (al.getMatricula() == a.getMatricula()) {
                throw new InputMismatchException("Um aluno com essa matrícula já foi cadastrado.");
            }
        }
        
            alunosLista.add(a);

    }

    public boolean excluirAluno(int matricula) {
        for (int i = 0; i < alunosLista.size(); i++) {
            if (alunosLista.get(i).getMatricula() == matricula) {
                alunosLista.remove(i);
                return true;
            }
        }

        return false;
    }

    public Aluno pesquisarAluno(int matricula) {
        for (Aluno a : alunosLista) {
            if (a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }

    public Aluno[] acharAlunosNovoVelho() {
        int idadeNovo = alunosLista.getFirst().getIdade();
        int idadeVelho = alunosLista.getFirst().getIdade();
        
        System.out.println(alunosLista.getFirst().getIdade());

        Aluno alunoNovo = null;
        Aluno alunoVelho = null;

        for (Aluno a : alunosLista) {
            if (a.getIdade() <= idadeNovo) {
                idadeNovo = a.getIdade();
                alunoNovo = a;
                
            }
            
            if (a.getIdade() >= idadeVelho) {
                idadeVelho = a.getIdade();
                alunoVelho = a;
            }
            
            System.out.println(a.getIdade());
           
        }

        Aluno[] alunos = {alunoNovo, alunoVelho};
        return alunos;
    }

    public int tamanho() {
        return alunosLista.size();
    }
    

}
