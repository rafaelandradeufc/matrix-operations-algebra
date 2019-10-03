package br.ufc.crateus.algebra;

import br.ufc.crateus.algebra.model.Matriz;
import br.ufc.crateus.algebra.service.Operations;

public class App {

	public static void main(String[] args) {

		Operations operations = new Operations();

		Matriz mat = new Matriz(3, 3);

		for (int i = 0; i < mat.getLinhas(); i++) {
			for (int j = 0; j < mat.getColunas(); j++) {

				mat.getMat()[i][j] = (int) (1 + Math.random() * 10);

			}
		}
		System.out.println(operations.determinante(mat));
		operations.printMat(mat);

	}

}
