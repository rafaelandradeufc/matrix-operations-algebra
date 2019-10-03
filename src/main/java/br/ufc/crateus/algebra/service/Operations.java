package br.ufc.crateus.algebra.service;

import br.ufc.crateus.algebra.model.Matriz;

public class Operations {

	public double determinante(Matriz mat) {

		if (mat.getLinhas() != mat.getColunas()) {
			System.out.println("Matriz não é quadrada!");
			return 0;
		} else {
			return calcDet(mat.getMat(), mat.getLinhas(), 0);
		}	
	}

	// Método de Laplace
	private double calcDet(double matriz[][], int ordem, double det) {

		if (ordem == 1)
			return (matriz[0][0]);
		if (ordem == 2)
			return (matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1]);
		else {
			double[][] matrizAuxiliar = new double[ordem - 1][ordem - 1];
			int colunaAuxiliar = 0;
			for (int controle = 0; controle < ordem; controle++) {
				for (int linha = 1; linha < ordem; linha++) {
					for (int coluna = 0; coluna < ordem; coluna++)
						if (controle != coluna)
							matrizAuxiliar[linha - 1][colunaAuxiliar++] = (int) matriz[linha][coluna];
					colunaAuxiliar = 0;
				}
				if (matriz[0][controle] != 0)
					det += (int) Math.pow((-1), controle) * matriz[0][controle]
							* calcDet(matrizAuxiliar, ordem - 1, det);
			}
		}
		return det;
	}

	public void printMat(Matriz matriz) {

		for (int i = 0; i < matriz.getLinhas(); i++) {
			for (int j = 0; j < matriz.getColunas(); j++) {

				System.out.print(matriz.getMat()[i][j] + " ");

				if (j == matriz.getColunas() - 1)
					System.out.println();

			}
		}

	}

}
