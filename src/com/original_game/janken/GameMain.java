package com.original_game.janken;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {

		//ウィンドウ設定
		JFrame frame = new JFrame();
		frame.setSize(960,720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		Panel.createPanel(frame);


		//ウィンドウ表示
		frame.setVisible(true);
	}



}
