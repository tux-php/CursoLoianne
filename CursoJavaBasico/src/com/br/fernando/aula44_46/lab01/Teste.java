/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.br.fernando.aula44_46.lab01;

import java.util.ArrayList;

/**
 *
 * @author 004349292569
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo", "azul");
        circulo.setRaio(2);

        Quadrado quadrado = new Quadrado("quadrado", "vermelho");
        quadrado.setLado(2);
        
        Triangulo triangulo = new Triangulo("triangulo", "marrom");
        triangulo.setBase(3);
        triangulo.setAltura(2);
        
        Cilindro cilindro = new Cilindro("cilindro", "rosa");
        cilindro.setRaio(2);
        cilindro.setAltura(3);
        
        Cubo cubo = new Cubo("cubo", "preta");
        cubo.setLado(3);
        
        Piramide piramide = new Piramide("Pirâmide", "roxa");
        piramide.setLadoBase(2);
        piramide.setNumPoliBase(4);
        piramide.setBase(quadrado);
        piramide.setAltura(3);
        piramide.setApotema(4);

        
        ArrayList figuras = new ArrayList<FiguraGeometrica>();
        figuras.add(circulo);
        figuras.add(quadrado);
        figuras.add(triangulo);
        figuras.add(cubo);
        figuras.add(cilindro);
        figuras.add(piramide);
        
        for(Object figura : figuras){
            if(figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                f2d.calcularArea();
                System.out.println(figura);                
            }
            if(figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;                
                f3d.calcularArea();
                f3d.calcularVolume();
                System.out.println(figura);
            }
        }
    }

}
