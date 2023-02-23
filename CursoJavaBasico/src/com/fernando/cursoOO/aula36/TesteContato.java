/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36;

/**
 *
 * @author fernando
 */
public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Fernando");
        //contato.setEndereco("Guará");
        //contato.setTelefone("96981370406");
        //Endereco
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Av. Italia");
        endereco.setNumero("n/a");
        endereco.setComplemento("Condomínio Jardim Europa");
        endereco.setEstado("Ap");
        endereco.setCidade("Macapá");
        endereco.setCep("68906174");

        contato.setEndereco(endereco);

        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setDdd("(96)");
        tel.setNumero("981370406");

        Telefone tel2 = new Telefone();
        tel2.setTipo("casa");
        tel2.setDdd("(96)");
        tel2.setNumero("32413418");

        Telefone[] telelefones = new Telefone[2];
        telelefones[0] = tel;
        telelefones[1] = tel2;
        //contato.setTelefone(tel);
        contato.setTelefones(telelefones);
        System.out.println(contato.getNome());
        if (contato != null && contato.getEndereco() != null)
        {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null)
        {
            System.out.println(contato.getTelefone().getDdd() + "" + contato.getTelefone().getNumero());
        }
         */
        
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.err.println(t.getDdd() + "" + t.getNumero());
            }
            
        }
    }
}
