package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			System.out.println("������ �����߽��ϴ�!");
		} catch(FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
				is.close();
			} catch (Exception e) {
				
			}
		}
		
		

	}

}
