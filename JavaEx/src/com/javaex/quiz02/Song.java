package com.javaex.quiz02;

public class Song {
	// 필드 선언
	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	
	//  생성자 규칙
	public Song(String artist, String title, String album, String composer, int year) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		
	}

	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album=album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer=composer;
	}
	

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}

	


	// 메소드
	public void showInfo() {
		System.out.println( artist + title + "(" + album + composer+ year + ")" );
	}
	
}