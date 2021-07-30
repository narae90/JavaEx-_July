package com.javaex.api.collection.hash;

public class ClassRoom {
	// ÇÊµå
	
	private String subject;
	private String roomName;
	
	
	// »ý¼ºÀÚ
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
		
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	
	// HashTable Å¬·¡½º 
	
	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			return obj.hashCode() == hashCode();
		}
		return super.equals(obj);
	}
	
	
	

	
	
	
	
}