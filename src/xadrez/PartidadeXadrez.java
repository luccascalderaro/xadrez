package xadrez;

import tabuleiro.Tabuleiro;

public class PartidadeXadrez {

	private Tabuleiro tabuleiro;

	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}

	public XadrezPeca[][] pegarpeca() {

		XadrezPeca[][] xape = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				xape[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
			}
		}
		return xape;
	}

}
