/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TesteAgendaContato {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        boolean opcao;

        while (!sair)
        {
            opcao = false;
            System.out.println("Iniciar o cadastro Agenda (S/N) ?");
            String resp = scan.next();
            if (resp.equalsIgnoreCase("s"))
            {
                while (!opcao)
                {
                    System.out.println("Digite o nome da agenda: ");
                    String nomeAgenda = scan.next();
                    agenda.setNome(nomeAgenda);
                    ArrayList contatos = new ArrayList();

                    if (agenda != null && agenda.getNome() != null)
                    {
                        String[] contatoNome = new String[2];
                        String[] contatoTelefone = new String[2];
                        String[] contatoEmail = new String[2];
                        Contato contato = new Contato();
                        
                        for (int i = 1; i < 3; i++)
                        {

                            System.out.println("Digite o nome " + i + " contato:");
                            contatoNome[i] = scan.next();
                            System.out.println("Digite o telefone " + i + " contato:");
                            contatoTelefone[i] = scan.next();
                            System.out.println("Digite o email " + i + " contato:");
                            contatoEmail[i] = scan.next();

                            contatos.add(contato.setNome(contatoNome[i]));
                            contatos.add(contato.setEmail(contatoEmail[i]));
                            contatos.add(contato.setNome(contatoNome[i]));
                            contato[i].setNome(contatoNome[i]);
                            contato[i].setTelefone(contatoTelefone[i]);
                            contato[i].setEmail(contatoEmail[i]);

                            contatos[i] = contato[i];

                            agenda.setContatos(contatos);

                        }
                        System.out.println("Nome Agenda: " + agenda.getNome());
                        if (agenda != null && agenda.getContatos() != null)
                        {
                            for (Contato c : agenda.getContatos())
                            {
                                System.out.println("Contato nome: " + c.getNome());
                                System.out.println("Contato telefone: " + c.getTelefone());
                                System.out.println("Contato email: " + c.getEmail());
                            }
                        }
                        opcao = true;
                    }
                    System.out.println("Gostaria de refazer a operação ? (S/N)");
                    String reiniciar = scan.next();

                    opcao = reiniciar.equalsIgnoreCase("s") ? false : true;
                }
//                            System.out.println("Digite o nome 1º contato:");
//                            String contatoNome1 = scan.next();
//                            System.out.println("Digite o telefone 1º contato:");
//                            String contatoTelefone1 = scan.next();
//                            System.out.println("Digite o email 1º contato:");
//                            String contatoEmail1 = scan.next();
//
//                            Contato contato1 = new Contato();
//
//                            contato1.setNome(contatoNome1);
//                            contato1.setTelefone(contatoTelefone1);
//                            contato1.setEmail(contatoEmail1);
//
//                            System.out.println("Digite o nome 2º contato:");
//                            String contatoNome2 = scan.next();
//                            System.out.println("Digite o telefone 2º contato:");
//                            String contatoTelefone2 = scan.next();
//                            System.out.println("Digite o email 2º contato:");
//                            String contatoEmail2 = scan.next();
//
//                            Contato contato2 = new Contato();
//                            contato2.setNome(contatoNome2);
//                            contato2.setTelefone(contatoTelefone2);
//                            contato2.setEmail(contatoEmail2);
//
//                            //Contato[] contatos = new Contato[2];
//                            contatos[0] = contato1;
//                            contatos[1] = contato2;
//                            agenda.setContatos(contatos);
//
//                            System.out.println("Nome Agenda: " + agenda.getNome());
//
//                            if (agenda != null && agenda.getContatos() != null)
//                            {
//                                for (Contato c : agenda.getContatos())
//                                {
//                                    System.out.println("Contato nome: " + c.getNome());
//                                    System.out.println("Contato telefone: " + c.getTelefone());
//                                    System.out.println("Contato email: " + c.getEmail());
//                                }
//                            }
//                            opcao = true;
//                        }
//                        System.out.println("Gostaria de refazer a operação ? (S/N)");
//                        String reiniciar = scan.next();
//
//                        opcao = reiniciar.equalsIgnoreCase("s") ? false : true;
                    }
                }
                sair = true;
            }

        }

    
