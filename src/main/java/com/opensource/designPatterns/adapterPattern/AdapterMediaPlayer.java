package com.opensource.designPatterns.adapterPattern;

public class AdapterMediaPlayer implements MediaPlayer{
	AdvancedMediaPlayer advancedMediaPlayer;
	public void play(String filename, String mediaType) {
		if(mediaType.equals("vlc")){
			advancedMediaPlayer = new VlcPlayer();
			advancedMediaPlayer.playVlc();
		}else if(mediaType.equals("mp4")){
			//create mp4 player
		}
	}
}
