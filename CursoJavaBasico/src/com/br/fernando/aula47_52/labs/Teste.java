/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula47_52.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 004349292569
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        String resp;
        String respOpcao;
        int tamanhoAgenda = 0;

        Agenda agenda = new Agenda();
        Contato contatoAgenda;
        String nome;
        String telefone;
        while (flag == false)
        {
            System.out.println("Gostaria de iniciar ? (s/n)");
            resp = scan.next();
            if (resp.equalsIgnoreCase("s"))
            {
                boolean flagOpcao = false;

                while (flagOpcao == false)
                {
                    System.out.println("Listar opções ? (s/n)");
                    respOpcao = scan.next();

                    if (respOpcao.equalsIgnoreCase("s"))
                    {

                        int opcao;

                        try
                        {
                            System.out.println("Escolha uma opção: ");
                            System.out.println("(1)- Consultar");
                            System.out.println("(2)- Cadastrar");

                            opcao = scan.nextInt();

                            if (opcao == 1)
                            {

                                if (!agenda.listarContato().isEmpty())
                                {
                                    System.out.println("Informe o código: ");
                                    int codigo = scan.nextInt();
                                    System.out.println(agenda.consultarContato(codigo));

                                } else
                                {
                                    System.out.println("Agenda encontra-se vazia.");
                                }

                            }
                            if (opcao == 2)
                            {

                                if (tamanhoAgenda <= 2)
                                {
                                    System.out.println("Informe o nome.");
                                    nome = scan.next();
                                    System.out.println("Informe o telefone.");
                                    telefone = scan.next();

                                    contatoAgenda = new Contato(nome, telefone);
                                    agenda.adicionarContato(contatoAgenda);

                                    System.out.println("Cadastro efetuado com sucesso.");
                                } else
                                {
                                    System.out.println("Agenda encontra-se cheia.");
                                    //throw new AgendaCheiaException();
                                }
                                tamanhoAgenda++;

                            }

                        } catch (InputMismatchException e)
                        {
                            System.out.println("Houve uma falha na entrada de dados.");
                            e.getMessage();
                        }

                    } else
                    {

                        flagOpcao = true;
                    }

                }

            } else
            {
                System.out.println("saindo...");
                flag = true;
            }
        }

    }
}
