/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.fernando.aula39_40.lab03_03;

/**
 *
 * @author 004349292569
 */
public abstract class Animal {

    protected String nome;
    protected double comprimento;
    protected int num_patas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;
    private String alimento;
    
    public Animal(String nome, double comprimento, int num_patas, String cor, String ambiente, String alimento, double velocidade){
        this.nome = nome;
        this.comprimento = comprimento;
        this.num_patas = num_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.alimento = alimento;
        this.velocidade = velocidade;        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the num_patas
     */
    public int getNum_patas() {
        return num_patas;
    }

    /**
     * @param num_patas the num_patas to set
     */
    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public String toString(){
        String dados = "Animal: " + getNome() + "\n";
        dados += "Comprimento: " + getComprimento() + " cm \n";
        dados += "Patas: " + getNum_patas() + "\n";
        dados += "Cor: " + getCor() + "\n";
        dados += "Ambiente: " + getAmbiente() + "\n";
        if (dados != null && getAlimento() != null) {
            dados += "Alimento: " + getAlimento() + "\n";
        }
        dados += "Velocidade: " + getVelocidade() + " m/s \n";
        dados += "] \n";
        dados += "------------------------------------------ \n";
        
        return dados;
    }
    
    

}
