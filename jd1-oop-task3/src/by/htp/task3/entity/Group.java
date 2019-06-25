package by.htp.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> students;
	private int groupSize;

	public Group (int groupSize) {
		this.groupSize = groupSize;
		students = new ArrayList<Student>(groupSize);
	}
	
	public void add (Student st) {
		if (students.size() >= groupSize ) {
			return;
		}
		students.add(st);
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getGroupSize() {
		return groupSize;
	}
	
	
}
