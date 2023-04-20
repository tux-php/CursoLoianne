/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula39_40.lab03;

/**
 *
 * @author 004349292569
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, "rusto, gramas secas e cactos", 2.0);
        camelo.setCor("Amarelo");

        Peixe tubarao = new Peixe("Tubarão", 300, 1.5, "peixes e crustáceos");

        Mamifero urso = new Mamifero("Urso-do-canadá", 180, "mariposas, larvas e mel", 0.5);
        urso.setAlimento("Mel");

        System.out.println("Zoo:");
        System.out.println("------------------------------------------");
        System.out.println(camelo);
        System.out.println(tubarao);
        System.out.println(urso);

    }

}
