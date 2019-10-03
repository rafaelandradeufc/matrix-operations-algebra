package br.ufc.crateus.algebra.model;

public class Matriz {
	private double mat[][];
	private int linhas;
	private int colunas;

	public Matriz(int linhas, int colunas) {
		this.mat = new double[linhas][colunas];
		this.linhas = linhas;
		this.colunas = colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public double[][] getMat() {
		return mat;
	}

	public void setMat(double[][] mat) {
		this.mat = mat;
	}

}
