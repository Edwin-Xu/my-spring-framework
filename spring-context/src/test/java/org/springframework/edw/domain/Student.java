package org.springframework.edw.domain;

/**
 * @author Edwin Xu
 * @date 4/24/2021 11:27 PM.
 */

public class Student {
	private String name;
	public Student(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}
}
