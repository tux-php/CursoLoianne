/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.cursoOO.aula36_43.labs;

/**
 *
 * @author fernando
 */
public class ContaEspecial extends ContaBancaria {

    private double limite;
    private double vl_limite;

    public ContaEspecial() {
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double sacar(double valor) {
        double saldoLimite = getSaldo() + getLimite();
        double retirada = 0;

        if (saldoLimite > 0)
        {
            if (getSaldo() >= 0)
            {
                
                double valorMinimo = getSaldo() - valor;
                
                if(valorMinimo >= 0){
                    setSaldo(valorMinimo);                    
                }else{
                    valorMinimo = getLimite() + getSaldo() - valor;
                    setSaldo(0);
                    setLimite(valorMinimo);
                }
                
                return getSaldo();
            } 
        }
        return 0;
    }
    
    
    public double depositar(double valor){
        //TODO Ajustar Essa Lógica
        double limiteFaltante = getVl_limite() - getLimite();
        if(valor >= limiteFaltante){
            
            setLimite(valor - limiteFaltante);
            setSaldo(valor);
            return getLimite();
        }
        if(getVl_limite() == getLimite()){
            setSaldo(getSaldo() + valor);
            return getSaldo();
        }else{
            return 0;
        }
    }

    /**
     * @return the vl_limite
     */
    public double getVl_limite() {
        return vl_limite;
    }

    /**
     * @param vl_limite the vl_limite to set
     */
    public void setVl_limite(double vl_limite) {
        this.vl_limite = vl_limite;
    }
}
