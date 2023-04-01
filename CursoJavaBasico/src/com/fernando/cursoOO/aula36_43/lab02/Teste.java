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
        PessoaFisica fernando = new PessoaFisica("871.091.529-01","Fernando Ubiratan", 1000);
        PessoaFisica eliene = new PessoaFisica("544.225.906-34","Eliene Melo",2000);
        PessoaFisica tina = new PessoaFisica("421.451.372-03","Cristina",3700);
        PessoaFisica ale1 = new PessoaFisica("163.875.536-10","Antonio",2800.01);
        PessoaFisica ale2 = new PessoaFisica("678.883.166-11","Joao",3600.01);
        
        PessoaJuridica bm = new PessoaJuridica("49.315.293/0001-95","Baia Melo LTDA", 5000);
        PessoaJuridica sc = new PessoaJuridica("42.873.500/0001-88","SexyCupido LTDA", 3000);
        PessoaJuridica cl = new PessoaJuridica("71.337.344/0001-39","Cocadora Macapá LTDA", 4000);
        
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
