/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula47_52.labs;

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

                        System.out.println("Escolha uma opção: ");
                        System.out.println("(1)- Consultar");
                        System.out.println("(2)- Cadastrar");

                        opcao = scan.nextInt();

                        if (opcao == 1)
                        {

                            if (!agenda.consultarContato().isEmpty())
                            {
                                for (Contato contato : agenda.consultarContato())
                                {

                                    System.out.println("Cod: " + contato.getCod().get(0));
                                    System.out.println("Nome: " + contato.getNome());
                                    System.out.println("Tel: " + contato.getTelefone());
                                    System.out.println("-------------------------------");

                                }

                            } else
                            {
                                System.out.println("Não há contato cadastrado.");
                            }

                        }
                        if (opcao == 2)
                        {

                            System.out.println("Informe o nome.");
                             nome = scan.next();
                            System.out.println("Informe o telefone.");
                             telefone = scan.next();

                            contatoAgenda = new Contato(nome, telefone);
                            agenda.adicionarContato(contatoAgenda);

                            System.out.println("Cadastro efetuado com sucesso.");

                        }

                    }
                    

                }
                
                flagOpcao = true;

            } else
            {
                System.out.println("saindo...");
                flag = true;
            }
        }

//        Contato cont1 = new Contato("Dayanne", "96885566");
//        Contato cont2 = new Contato("Joao", "115588744");
//        Contato cont3 = new Contato("Jhon", "6155663322");
//        Contato cont4 = new Contato("Tina", "65665522");
//
//        //System.out.println(cont1.getId());
//        //System.out.println(cont2.getId());
//        //System.out.println(cont3.getId());
//        Agenda ag = new Agenda();
//        ag.adicionarContato(cont1);
//        ag.adicionarContato(cont2);
//        ag.adicionarContato(cont3);
//        ag.adicionarContato(cont4);
//
//        for (Contato agenda : ag.consultarContato()) {
//            System.out.println("Cod: " + agenda.getCod().get(0));
//            System.out.println("Nome: " + agenda.getNome());
//            System.out.println("Tel: " + agenda.getTelefone());
//            System.out.println("-------------------------------");
//        }
//    }
    }
}
