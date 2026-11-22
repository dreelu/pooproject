/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uespi.pooproject.dados;

import java.util.ArrayList;
import com.uespi.pooproject.Bean.Aluno;
/**
 *
 * @author CTU
 */
public class AlunoDados {
    public ArrayList<Aluno> alunosLista = new ArrayList<Aluno>();
    
    void salvarAluno(Aluno a) {
        if (!alunosLista.contains(a)) {
            alunosLista.add(a);
        }
    }

    int excluirAluno(Aluno a) {
        if (alunosLista.contains(a)) {
            int matricula = a.getMatricula();
            alunosLista.remove(a);
            return matricula;
        }
        
        return 0;
    }

    Aluno pesquisarAluno(int matricula) {
        for (Aluno a : alunosLista) {
            if (a.getMatricula() == matricula)
                return a;
        }
        return null;
    }
    
    Aluno[] acharAlunosNovoVelho() {
        int idadeNovo = 100;
        int idadeVelho = 0;
        
        Aluno alunoNovo = null;
        Aluno alunoVelho = null;
        
        for (Aluno a: alunosLista) {
            if (a.getIdade() > idadeVelho) {
                idadeVelho = a.getIdade();
                alunoVelho = a;
            } else if (a.getIdade() < idadeNovo) {
                idadeNovo = a.getIdade();
                alunoNovo = a;
            }
        }
        
        Aluno[] alunos = {alunoNovo, alunoVelho};
        return alunos;
    }
    
    int tamanho() {
        return alunosLista.size();
    }
    
}
