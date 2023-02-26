/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36.lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                    List contatos = new ArrayList();

                    if (agenda != null && agenda.getNome() != null)
                    {
                        String[] contatoNome = new String[4];
                        String[] contatoTelefone = new String[4];
                        String[] contatoEmail = new String[4];
                        //Contato contato = new Contato();
                        Contato contato[] = new Contato[3];

                        for (int i = 1; i < contato.length; i++)
                        {

                            System.out.println("Digite o nome " + i + " contato:");
                            contatoNome[i] = scan.next();
                            System.out.println("Digite o telefone " + i + " contato:");
                            contatoTelefone[i] = scan.next();

                            System.out.println("Digite o email " + i + " contato:");
                            contatoEmail[i] = scan.next();

                            contato[i] = new Contato();

                            contato[i].setNome(contatoNome[i]);
                            contato[i].setTelefone(contatoTelefone[i]);
                            contato[i].setEmail(contatoEmail[i]);

                            contatos.add(contato[i].getNome());
                            contatos.add(contato[i].getTelefone());
                            contatos.add(contato[i].getEmail());

                            agenda.setContatos(contatos);

                        }

                        //System.out.println("Nome Agenda: " + agenda.getNome());
                        if (agenda != null && agenda.getContatos() != null)
                        {

                            for (Object listaContato : agenda.getContatos())
                            {
                                System.out.println("Contato: " + listaContato);
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
