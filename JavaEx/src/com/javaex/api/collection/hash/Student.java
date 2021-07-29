package com.javaex.api.collection.hash;

public class Student {
	// �ʵ�
	String name;
	int id;
	
	// ������
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	
	
	// hashCode(), equals() �޼ҵ� �������̵�
	@Override
	public int hashCode() {
		return id; // �й���  hashCode�� �̿�
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			// ĳ����
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}
	
	
	
	
	
	
	
	
	
}
