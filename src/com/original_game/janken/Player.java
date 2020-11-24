package com.original_game.janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Player implements ActionListener{
	static ImageIcon G,T,P;
	public static void createButton(JPanel footerPanel) {
		//ボタンを表示
		JButton btnGu = new JButton("グー");
		btnGu = setButton(btnGu);
		footerPanel.add(btnGu, BorderLayout.WEST);

		JButton btnChoki = new JButton("チョキ");
		btnChoki = setButton(btnChoki);
		footerPanel.add(btnChoki, BorderLayout.CENTER);

		JButton btnPaa = new JButton("パー");
		btnPaa = setButton(btnPaa);
		footerPanel.add(btnPaa, BorderLayout.EAST);

	}

	public static JButton setButton(JButton button) {
		int buttonSizeX = (960 - 20)/3;
		Dimension buttonDimension = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimension);
		Font buttonFont = new Font("MS ゴシック",Font.PLAIN,24);
		button.setFont(buttonFont);
		button.setBackground(Color.WHITE);
		LineBorder border = new LineBorder(Color.BLACK, 2, false);
		button.setBorder(border);

		Player player = new Player();
		button.addActionListener(player);

		return(button);
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		int playerHand = 0;

		switch(command) {
			case "グー" : playerHand = 1;
					G = new ImageIcon("././././IMG/17498.jpg");
					Panel.westLabel.setIcon(G);
					break;
			case "チョキ" : playerHand = 2;
					T = new ImageIcon("././././IMG/17499.jpg");
					Panel.westLabel.setIcon(T);
					break;
			case "パー" : playerHand = 3;
					P = new ImageIcon("././././IMG/17500.jpg");
					Panel.westLabel.setIcon(P);
					break;
		}

		int cpHand = Computer.computerHand();
		VictoryOrDefeat.VorF(cpHand,playerHand);

	}
}
