package xadrez;

import tabuleiro.Tabuleiro;

public class PartidadeXadrez {
	
	private Tabuleiro tabuleiro;
	
	
	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}
	
	public XadrezPeca[][] pegarpeca(){
		
		XadrezPeca[][] xape = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
	
	}

}
