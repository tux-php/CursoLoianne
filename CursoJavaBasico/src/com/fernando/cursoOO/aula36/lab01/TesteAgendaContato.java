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
            System.out.println("Iniciar o cadastro da nova Agenda (S/N) ?");
            String resp = scan.next();
            if (resp.equalsIgnoreCase("s"))
            {
                while (!opcao)
                {
                    System.out.println("Digite o nome da agenda: ");
                    String nomeAgenda = scan.next();
                    agenda.setNome(nomeAgenda);
                    ArrayList<Contato> contatos = new ArrayList<Contato>();

                    if (agenda != null && agenda.getNome() != null)
                    {
                        String[] contatoNome = new String[5];
                        String[] contatoTelefone = new String[5];
                        String[] contatoEmail = new String[5];
                        Contato contato[] = new Contato[4];

                        for (int i = 1; i <= 3; i++)
                        {
                            contato[i] = new Contato();

                            System.out.println("Digite o nome " + i + " contato:");
                            contatoNome[i] = scan.next();
                            System.out.println("Digite o telefone " + i + " contato:");
                            contatoTelefone[i] = scan.next();

                            System.out.println("Digite o email " + i + " contato:");
                            contatoEmail[i] = scan.next();


                            contato[i].setNome(contatoNome[i]);
                            contato[i].setTelefone(contatoTelefone[i]);
                            contato[i].setEmail(contatoEmail[i]);

                            contatos.add(contato[i]);
                            

                            agenda.setContatos(contatos);

                        }

                        if (agenda != null && agenda.getContatos() != null)
                        {

                            for (Contato listaContato : agenda.getContatos())
                            {
                                System.out.println("Contato: " + listaContato.getNome());
                                System.out.println("E-mail: " + listaContato.getEmail());
                                System.out.println("Telefone: " + listaContato.getTelefone());
                            }

                        }
                        opcao = true;
                    }
                    System.out.println("Gostaria de refazer a operação ? (S/N)");
                    String reiniciar = scan.next();

                    opcao = reiniciar.equalsIgnoreCase("s") ? false : true;
                }

            }
            System.out.println("Gostaria de sair da aplicação ? (S/N)");
            String resp_sair = scan.next();

            sair = resp_sair.equalsIgnoreCase("s") ? true : false;
        }
        sair = true;
    }

}
