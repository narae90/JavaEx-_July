package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {

	
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	public static void main(String[] args) {
		// ���� ��ü
		File root = new File(rootPath);
		// ������ ���� �����ϴ°�?
		System.out.println(rootPath + ":" + root.exists());
		
		printInfo(root);
		
		
		
		if(!root.exists()) { // ��ΰ� �������� ������
			// ���丮 ����
			root.mkdirs();			
		}
		
		// ���丮 ���ο� ������ ������ ���ô�.
		File newFile = new File(rootPath + "myFile.txt");
		if(!newFile.exists()) { // myfile.txt�� ������
			// ���ϻ���
			try {
				newFile.createNewFile();
			} catch(IOException e) {
				System.out.println("������ ������ ���߾��");
			}
			
		}
		printInfo(root);
		// ������ �����
		newFile.delete();
		printInfo(root);

	}

	
	 private static void printInfo(File f) {
		 System.out.println("-------------------");
		 
		 // ���� ���� ���� ��ü�� ���丮�ΰ�?
		 if(f.isDirectory()) { // ���丮
			 // ���丮 ������ ���� ����� �޾ƿͼ� ���
			 System.out.println("Directory : " + f.getName());
			 // ��� �ҷ�����
			 File[] files = f.listFiles();
			 
			 // ����Ʈ ���
			 for(File file: files) {
				 System.out.print(file.isDirectory() ? "d":"f");
				 System.out.printf("%s - %d%n", file.getName(), file.length());
				 
			 }
		 }else { // ����
			 //  ������ �̸� ���
			 System.out.println("File : " + f.getName()); // ������ �̸� ���
			 
		 }
		 
	 }
}
