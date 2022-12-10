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
public class ConversaoDeUnidadeDeVolume {
    
    public ConversaoDeUnidadeDeVolume(){}
    
    public static double convertLitroToCentimetro(double litro){
        return litro * 1000;
    }
    
    public static double convertMetroToLitros(double metro){
        return metro * 1000;
    }
    
    public static double convertMetroToPes(double metro){
        return metro * 35.32;
    }
    
    public static double convertGalaoToPolegadas(double galao){
        return galao * 231;
    }
    
    public static double convertGalaoToLitros(double galao){
        return galao * 3785;
    }
    
}
