package com.original_game.janken;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;

public class VictoryOrDefeat extends Panel{

	private static int point;
	static ImageIcon VIC,DRA,DEF;
	static AudioInputStream sound;
	static Clip clip;
	static DataLine.Info info;

	public static final void VorF(int cpHand, int playerHand) {

		if(playerHand == cpHand) {//あいこ
			DRA = new ImageIcon("././././IMG/wanezumi_kiiro2.png");
			Panel.contentsLabel.setIcon(DRA);
			Panel.contentsLabel.setText("Draw");
			Panel.headerLabel.setText(String.valueOf(point));
		}else if((playerHand == 3 && cpHand == 1)||//勝ち
					(playerHand == 2 && cpHand == 3)||
					(playerHand == 1 && cpHand == 2)) {
			VIC = new ImageIcon("././././IMG/wanezumi_pink2.png");
			Panel.contentsLabel.setIcon(VIC);
			Panel.contentsLabel.setText("Victory");
			Panel.headerLabel.setText(String.valueOf(++point));
			sound();
		}else {//負け
			DEF = new ImageIcon("././././IMG/wanezumi_blue2.png");
			Panel.contentsLabel.setIcon(DEF);
			point = 0;
			Panel.contentsLabel.setText("Defeat");
			Panel.headerLabel.setText(String.valueOf(point));
		}
	}
	public static void sound() {
	    try {
	    	sound = AudioSystem.getAudioInputStream(new File("././././SOUND/coin03.wav"));
	        AudioFormat af = sound.getFormat();
	        info = new DataLine.Info(Clip.class, af);
	        clip = (Clip)AudioSystem.getLine(info);
	        clip.open(sound);
	        clip.loop(0);
	        clip.flush();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }finally {
	        try {
	        	sound.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
