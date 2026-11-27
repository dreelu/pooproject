/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uespi.pooproject.utils;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author andre
 */
public class Utils {
    public Date converterData(String data) {
        try {
            String[] partes = data.split("/"); // Divide a sting recebidad de data sempre que encontra uma barra

                    // Armazena cada parte da string dividida em uma posição do array pertes
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

                    //Cria um objeto da classe calendário
            Calendar calendario = Calendar.getInstance();

            calendario.setLenient(false); // Desativa a correção automática de datas
            calendario.set(ano, mes - 1, dia); // define da data baseada nas partes dividas que foram armazenadas

            return calendario.getTime(); // Retorna um objeto do tipo date

        } catch (Exception e) {
            throw new IllegalArgumentException("Data inválida!");
        }
    }
}
