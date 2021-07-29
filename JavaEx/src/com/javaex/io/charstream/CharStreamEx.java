package com.javaex.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "char.txt";
	public static void main(String[] args) {
//		writeTest();
		readTest();
		

	}
	
	private static void readTest() {
		Reader freader = null;
		
		try {
			freader = new FileReader(filename);
			int data = 0;
			while((data = freader.read()) != -1){
				System.out.print((char)data);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				freader.close();
			} catch (Exception e) {}
		}
	}




	
	
	private static void writeTest() {
		Writer fwriter = null; // ĳ���� ��� ��� ��Ʈ���� �ְ� ����
		
		try {
			// ��� ��Ʈ�� ����
			fwriter = new FileWriter(filename, true); // ���ϸ�  // true => �߰� (append)
			
			// ���
			fwriter.write("Bit Comuter\r\n");
			fwriter.write("Java Progeammin\r\n");
			fwriter.write("2021.07\r\n");
			fwriter.flush(); // ���� ����
			
			System.out.println("������ ����߽��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fwriter.close();
			} catch (Exception e) {
				
			}
		}
		
	} 

}
