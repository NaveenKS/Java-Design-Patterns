package com.opensource.designPatterns.adapterPattern;

public class AudioPlayer implements MediaPlayer{

	public void play(String filename, String mediaType) {
		if(mediaType.equals("mp3")){
			System.out.println("Playing mp3");
		}else {
			AdapterMediaPlayer adapterMediaPlayer = new AdapterMediaPlayer();
			adapterMediaPlayer.play(filename, mediaType);
		}
		
	}

}
