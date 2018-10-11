package programa;

import tabuleiro.Tabuleiro;
import xadrez.PartidadeXadrez;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartidadeXadrez part1 = new PartidadeXadrez();
		UI.imprimirTabuleiro(part1.pegarpeca());
	}

}
