/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula34.lab06;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TesteConversaoDeUnidadesDeTempo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int escolha;
        boolean flag;
        boolean sair = false;
//Laço de saída
        while (!sair) {
            System.out.println("Iniciar sistema e conversão(S/N) ?");
            String resp = scan.next();
            //Laço do loop de perguntas
            if (resp.equalsIgnoreCase("s")) {
                flag = false;
                System.out.println("Selecione: ");
                System.out.println("1- Converter minuto para segundos");
                System.out.println("2- Converter hora para minutos");
                System.out.println("3- Converter dia para horas");
                System.out.println("4- Converter semana para dias");
                System.out.println("5- Converter mês para dias");
                System.out.println("6- Converter ano para dias");

                escolha = scan.nextInt();
                int valor;

                while (!flag) {
                    if(escolha <= 0 || escolha > 6){
                        System.out.println("Valor inválido");
                        flag = true;
                    }
                    if (escolha == 1) {
                        System.out.println("Defina o valor:");
                        valor = scan.nextInt();
                        imprimir(ConversaoDeUnidadesDeTempo.conversaoMinutoToSegundos(valor));
                        flag = true;
                    }
                    if (escolha == 2) {
                        System.out.println("Defina o valor:");
                        valor = scan.nextInt();
                        imprimir(ConversaoDeUnidadesDeTempo.conversaoHoraToMinutos(valor));
                        flag = true;
                    }
                    if (escolha == 3) {
                        System.out.println("Defina o valor:");
                        valor = scan.nextInt();
                        imprimir(ConversaoDeUnidadesDeTempo.conversaoDiaToHoras(valor));
                        flag = true;
                    }

                    if (escolha == 4) {
                        System.out.println("Defina o valor:");
                        valor = scan.nextInt();
                        imprimir(ConversaoDeUnidadesDeTempo.conversaoSemanaToDias(valor));
                        flag = true;
                    }
                    if (escolha == 5) {
                        System.out.println("Defina o valor:");
                        valor = scan.nextInt();
                        imprimir(ConversaoDeUnidadesDeTempo.conversaoMesToDias(valor));
                        flag = true;
                    }
                    if (escolha == 6) {
                        System.out.println("Defina o valor:");
                        valor = scan.nextInt();
                        imprimir(ConversaoDeUnidadesDeTempo.conversaoAnoToDias(valor));
                        flag = true;
                    }

                }

            } else {
                System.out.println("Fim...");
                sair = true;
            }

        }

    }

    public static void imprimir(int valor) {
        System.out.println("Valor convertido: " + valor);
    }

}
