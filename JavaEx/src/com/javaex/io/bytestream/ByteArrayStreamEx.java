package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// �Է� �ҽ�
		byte[] source = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// ��� Ÿ��
		byte[] target = null;
		
		System.out.println("�Է� : " + Arrays.toString(source));
		
		InputStream bis = null;
		OutputStream bos = null;
		try {
			// ��Ʈ�� ����
			bis = new ByteArrayInputStream(source);
			bos = new ByteArrayOutputStream();
		
		
			int data = 0; //  �Է� ��Ʈ�����κ��� �Ѿ���� ������ ����
		
			while((data = bis.read()) != -1) {
				System.out.println("Read Data : " + data);
				// ��� ��Ʈ������ ����
				bos.write(data);
				
			}
			
			target = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("��� : " + Arrays.toString(target));
		}catch (IOException e) {
				// IO ���� ó��
				e.printStackTrace();
				
		} catch (Exception e) {
				
		}finally {
			try {
			
			bos.close();
			bis.close();
		}catch (Exception e ) {
				
		}
		}
	}
}

		

