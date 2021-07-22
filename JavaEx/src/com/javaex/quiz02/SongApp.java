package com.javaex.quiz02;

public class SongApp {

	public static void main(String[] args) {
		

		Song iu = new Song("아이유, ", "좋은날 ","Real,","이민수 작곡,", 2010);
		Song bigbang = new Song("bigbang, ", "거짓말 ","Always,","GD 작곡,",2007);

		
		
//		System.out.printf("%s %s %s %s %d %n",
//				iu.getArtist(),
//				iu.getTitle(),
//				iu.getAlbum(),
//				iu.getComposer(),
//				iu.getYear());
//		
//		System.out.printf("%s %s %s %s %d %n",
//				bigbang.getArtist(),
//				bigbang.getTitle(),
//				bigbang.getAlbum(),
//				bigbang.getComposer(),
//				bigbang.getYear());
//		


		iu.showInfo();
		bigbang.showInfo();


		
	}

}
