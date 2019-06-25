package by.htp.task3.entity;

import java.util.Arrays;

public class Student {

	private String FIO;
	private int groupNumber;
	private int[] marks;

	
	public Student (String FIO, int groupNumber, int[] marks) {
		this.FIO = FIO;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}
	

	public int getAge() {
		return groupNumber;
	}

	public void setAge(int age) {
		this.groupNumber = age;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public String getName() {
		return FIO;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((FIO == null) ? 0 : FIO.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (FIO == null) {
			if (other.FIO != null)
				return false;
		} else if (!FIO.equals(other.FIO))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student name=" + FIO + "\n" + "group number=" + groupNumber + "\n" + "marks=" + Arrays.toString(marks)+"\n" + "---------------------------";
	}

	
	
	
}
