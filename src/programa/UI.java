package programa;

import xadrez.XadrezPeca;

public class UI {

	public static void imprimirTabuleiro(XadrezPeca[][] xape) {

		for(int i = 0; i< xape.length;i++) {
			System.out.print((8-i)+" ");
			for(int j=0; j < xape.length;j++) {
				imprimirPeca(xape[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	public static void imprimirPeca(XadrezPeca xape) {

		if (xape == null) {
			System.out.print("-");
		}

		else {
			System.out.print(xape);
		}
		System.out.print(" ");
	}

}
