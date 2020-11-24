package com.original_game.janken;

import java.util.Random;

import javax.swing.ImageIcon;

public class Computer {

	static ImageIcon G,T,P;

	public static int computerHand() {
		Random random = new Random();
		int rnd = random.nextInt(3)+1;
		switch(rnd) {
			case 1 : G = new ImageIcon("././././IMG/17498.jpg");
					Panel.eastLabel.setIcon(G);
					break;
			case 2 : T = new ImageIcon("././././IMG/17499.jpg");
					Panel.eastLabel.setIcon(T);
					break;
			case 3 : P = new ImageIcon("././././IMG/17500.jpg");
					Panel.eastLabel.setIcon(P);
					break;
		}
		return(rnd);
	}

}
