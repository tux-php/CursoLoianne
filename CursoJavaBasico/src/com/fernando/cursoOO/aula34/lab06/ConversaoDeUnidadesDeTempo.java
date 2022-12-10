/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula34.lab06;

/**
 *
 * @author fernando
 */
public class ConversaoDeUnidadesDeTempo {
    
    public ConversaoDeUnidadesDeTempo(){}
    
    public static int conversaoMinutoToSegundos(int valor){
        return valor * 60;
    }
    
    public static int conversaoHoraToMinutos(int valor){
        return valor * 60;
    }
    
    public static int conversaoDiaToHoras(int valor){
        return valor * 24;
    }
    
    public static int conversaoSemanaToDias(int valor){
        return valor * 7;
    }
    
    public static int conversaoMesToDias(int valor){
        return valor * 30;
    }
    
    public static int conversaoAnoToDias(int valor){
        return valor * 365;
    }
}
