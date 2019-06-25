package by.htp.task3.logic;

import by.htp.task3.entity.Student;

public class StudentLogic {

	public boolean isAlevelStudent(Student student) {
		
		int[] marks = student.getMarks();
		
		for (int i = 0; i < marks.length;i++){
			if (marks[i] < 9) {
				return false;
			}
	}
		return true;
	}

}
