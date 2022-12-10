/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula34.lab04;


/**
 *
 * @author fernando
 */
public class TesteConversaoDeUnidadeDeArea {
    
    public static void main(String[] args) {
        imprimir(ConversaoDeUnidadeDeArea.conversaoMetroParaPes(100));
        imprimir(ConversaoDeUnidadeDeArea.conversaoAcresParaQuadrados(100));
        imprimir(ConversaoDeUnidadeDeArea.conversaoMilhasParaAcres(100));
        imprimir(ConversaoDeUnidadeDeArea.conversaoPesParaCentimetros(100));
    }
    
    public static void imprimir(double valor){
        System.out.println(valor);
    }
    
}
