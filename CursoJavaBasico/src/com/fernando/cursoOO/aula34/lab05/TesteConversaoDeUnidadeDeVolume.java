/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula34.lab05;

/**
 *
 * @author fernando
 */
public class TesteConversaoDeUnidadeDeVolume {
    
    public static void main(String[] args) {
        imprimir(ConversaoDeUnidadeDeVolume.convertGalaoToLitros(1));
        imprimir(ConversaoDeUnidadeDeVolume.convertGalaoToPolegadas(1));
        imprimir(ConversaoDeUnidadeDeVolume.convertLitroToCentimetro(1));
        imprimir(ConversaoDeUnidadeDeVolume.convertMetroToLitros(1));
        imprimir(ConversaoDeUnidadeDeVolume.convertMetroToPes(1));
        
    }
        public static void imprimir(double valor){
            System.out.println(valor);
        }
    
}
