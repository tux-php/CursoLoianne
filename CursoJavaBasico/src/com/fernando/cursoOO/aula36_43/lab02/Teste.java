/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernando.cursoOO.aula36_43.lab02;

/**
 *
 * @author 004349292569
 */
public class Teste {
    public static void main(String[] args) {
        PessoaFisica fernando = new PessoaFisica("Fernando Ubiratan", 1352.65);
        PessoaFisica eliene = new PessoaFisica("Eliene Melo",1400.01);
        PessoaFisica tina = new PessoaFisica("Cristina",2100.01);
        PessoaFisica ale1 = new PessoaFisica("Antonio",2800.01);
        PessoaFisica ale2 = new PessoaFisica("Joao",3600.01);
        
        PessoaJuridica bm = new PessoaJuridica("Baia Melo LTDA", 22545.65);
        PessoaJuridica sc = new PessoaJuridica("SexyCupido LTDA", 30900.95);
        PessoaJuridica cl = new PessoaJuridica("Cocadora Macapá LTDA", 45580.05);
        
        
        System.out.println(fernando);
        System.out.println(eliene);
        System.out.println(tina);
        System.out.println(ale1);
        System.out.println(ale2);
        
        System.err.println(bm);
        System.err.println(sc);
        System.err.println(cl);
        
    }
    
}
