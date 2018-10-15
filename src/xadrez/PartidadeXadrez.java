package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.peca.Rei;
import xadrez.peca.Torre;

public class PartidadeXadrez {

	private Tabuleiro tabuleiro;

	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicarjogo();
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
	
	public void inicarjogo () {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.Branco), new Posicao(0, 0));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.Branco), new Posicao(0, 4));
		
		
	}

}
