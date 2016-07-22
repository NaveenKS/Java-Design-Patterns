package com.opensource.designPatterns.adapterPattern;

public class MainAdapter {
	public static void main(String[] args) {
		MediaPlayer auMediaPlayer = new AudioPlayer();
		auMediaPlayer.play("filename", "mp3");
		auMediaPlayer.play("filename", "vlc");
	}
}
