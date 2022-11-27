package com.fernando.cursoOO.exercicio28_33.lampada;

public class Lampada {
	private String nome;
	private String tipo;
	private String cor;
	private String marca;
	private boolean bivolt;
	private boolean flagLigada;

	public Lampada(String nome, String tipo, String cor, String marca, boolean bivolt) {
		this.nome = nome;
		this.tipo = tipo;
		this.cor = cor;
		this.marca = marca;
		this.bivolt = bivolt;
	}

	public Lampada() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isBivolt() {
		return bivolt;
	}

	public void setBivolt(boolean bivolt) {
		this.bivolt = bivolt;
	}

	public boolean isFlagLigada() {
		return flagLigada;
	}

	public void setFlagLigada(boolean flagLigada) {
		this.flagLigada = flagLigada;
	}

	public boolean ligar() {
		setFlagLigada(true);
		return isFlagLigada();
	}

	public boolean desligar() {
		setFlagLigada(false);
		return isFlagLigada();
	}

	public boolean tomadaLigarDesligar() {
		return flagLigada == true ? desligar() : ligar();
	}

	public void printDescricao() {
		System.out.println("Nome: " + getNome());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Cor: " + getCor());
		System.out.println("Marca: " + getMarca());
		System.out.println("Bivolt: " + isBivolt());
		System.out.println(statusLampada());		
	}

	private String statusLampada() {
		String msg = "Lâmpada encontra-se";
		return isFlagLigada() == true ? msg + " ligada" : msg + " desligada";		
	}

}
