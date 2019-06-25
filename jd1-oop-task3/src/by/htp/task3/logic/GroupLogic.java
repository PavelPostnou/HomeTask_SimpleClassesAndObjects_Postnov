package by.htp.task3.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task3.entity.Group;
import by.htp.task3.entity.Student;

public class GroupLogic {
	
	private StudentLogic studentLogic;
	
	public GroupLogic(StudentLogic studentLogic) {
		this.studentLogic = studentLogic;
	}

	public List<Student> aLevelStudents (Group group) {
		List<Student> students;
		List<Student> aStudentsList = new ArrayList<Student>();
		
		students = group.getStudents();
		
		for (Student st : students ) {
			if (studentLogic.isAlevelStudent(st)) {
				aStudentsList.add(st);
			}
		} return aStudentsList;
	}
}
