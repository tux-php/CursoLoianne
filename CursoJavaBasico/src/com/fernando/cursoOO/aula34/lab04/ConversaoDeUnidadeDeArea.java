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
public class ConversaoDeUnidadeDeArea {
    public ConversaoDeUnidadeDeArea(){}
    
    public static double conversaoMetroParaPes(double metros){
        return metros * 10.76 ;
    }
    
    public static double conversaoPesParaCentimetros(double pes){
        return pes * 929;
    }
    
    public static double conversaoMilhasParaAcres(double milhas){
        return milhas * 640 ;
    }
    
    public static double conversaoAcresParaQuadrados(double acres){
        return acres * 43560;
    }
    
}
