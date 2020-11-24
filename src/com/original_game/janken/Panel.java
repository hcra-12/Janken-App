package com.original_game.janken;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
	public static JLabel headerLabel;
	public static JLabel contentsLabel;
	public static JLabel westLabel;
	public static JLabel eastLabel;

	public static void createPanel(JFrame frame) {
		//ヘッダーパネル
		Dimension headerPanelDimension = new Dimension(960,70);
		JPanel headerPanel = setPanel(Color.BLACK,headerPanelDimension);
		headerLabel = new JLabel("Janken Tournament");
		headerLabel = setFont(Color.WHITE,headerLabel,24);
		headerPanel.add(headerLabel);
		frame.add(headerPanel,BorderLayout.NORTH);

		//コンテンツパネル
		Dimension contentsPanelDimension = new Dimension(960, 80);
		JPanel contentsPanel = setPanel(Color.WHITE,contentsPanelDimension);
		contentsLabel = new JLabel("Let's Battle");
		ImageIcon icon = new ImageIcon("././././IMG/wanezumi1.png");
		contentsLabel.setIcon(icon);
		contentsLabel = setFont(Color.BLACK,contentsLabel,50);
		contentsLabel.setVerticalTextPosition(JLabel.BOTTOM);
		contentsLabel.setHorizontalTextPosition(JLabel.CENTER);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel,BorderLayout.CENTER);



		//フッタパネル
		Dimension footerPanelDimension = new Dimension(960,50);
		JPanel footerPanel = setPanel(Color.BLACK,footerPanelDimension);
		frame.add(footerPanel,BorderLayout.SOUTH);
		Player.createButton(footerPanel);

		//ウェスト
		Dimension westPanelDimension = new Dimension(80, 50);
		JPanel westPanel = setPanel(Color.WHITE,westPanelDimension);
		westLabel = new JLabel();
		westPanel.add(westLabel);
		frame.add(westPanel,BorderLayout.WEST);

		//イースト
		Dimension eastPanelDimension = new Dimension(80, 50);
		JPanel eastPanel = setPanel(Color.WHITE,eastPanelDimension);
		eastLabel = new JLabel();
		eastPanel.add(eastLabel);
		frame.add(eastPanel,BorderLayout.EAST);
	}

	public static JPanel setPanel(Color color,Dimension PanelDimension) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(PanelDimension);
		panel.setLayout(new BorderLayout());
		panel.setBackground(color);
		return(panel);
	}

	public static JLabel setFont(Color clr,JLabel label,int strSize) {
		label.setForeground(clr);
		Font labelFont = new Font("Comic Sans MS",Font.PLAIN,strSize);
		label.setFont(labelFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		return(label);
	}
	/*public void paint(Graphics g) {
		//ImageIcon icon = new ImageIcon("././././IMG/wanezumi1.png");
		I = getImage(getCodeBase(),"././././IMG/wanezumi1.png");
		g.drawImage(I,0,0,this);
	}*/
}
