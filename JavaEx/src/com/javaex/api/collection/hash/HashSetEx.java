package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	
	public static void main(String[] args) {
//		basicHashSet();
		customHashSet();

	}
	
	
	
	private static void customHashSet() {
		// ����� ���� Ŭ���������� Hash
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("ȫ�浿", 10);
		Student s2 = new Student("ȫ�浿", 20);
		Student s3 = new Student("ȫ�浿", 10);
		
		
		hs.add(s1); hs.add(s2); hs.add(s3);
		
		System.out.println(hs);
		
		System.out.println(s1.hashCode() == s3.hashCode());
		System.out.println(s1.equals(s3));
		
		
		// ���� ������ Ȯ��
		System.out.println(hs.contains(new Student("ȫ�浿", 10)));
//		System.out.println(hs.contains(s1));
		
		
	}
	private static void basicHashSet() {
		// ����
		HashSet<String> hs = new HashSet<>();
		
		// ��ü �߰�
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); // �ߺ� ���� ��� ����
		
		System.out.println(hs);
		System.out.println("hs size = " + hs.size()); // ���� ��� ����
		
		// ���� ��ü ���� ���� : contains();
		System.out.println("Java ���� ? " + hs.contains("Java"));
		System.out.println("Linux ���� ? " + hs.contains("Linux"));
		
		
		// ��ü ���� : remove
		hs.remove("C++");  // C++ ����
		System.out.println(hs);
		
		
		hs.clear(); // �� ����
		System.out.println(hs);
	}

}
