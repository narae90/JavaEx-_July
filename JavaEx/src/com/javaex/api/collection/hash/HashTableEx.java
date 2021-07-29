package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// Hashtable ����
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// �ʿ� ������ �ֱ� : put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("201", new ClassRoom("Linux", "R201")); // �������� ����
		
		System.out.println(map);
		
		// ������ �������� : Ű�� �̿��ؼ� ����
		System.out.println("301 : " + map.get("301"));
		
		// Ű�� �ִ��� Ȯ��
		System.out.println("301Ű ���� ? " + map.containsKey("301"));
		System.out.println("501Ű ���� ? " + map.containsKey("501"));
	
		// ���� �ִ��� ? 
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) { // �ڿ� ��� �����ִ°�?
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		// �� ����
		map.clear();
		System.out.println(map);
		
	}
	

}
