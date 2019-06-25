package by.htp.task3.main;

import java.util.List;

import by.htp.task3.entity.Group;
import by.htp.task3.entity.Student;
import by.htp.task3.logic.GroupLogic;
import by.htp.task3.logic.StudentLogic;

public class Main {

	public static void main(String[] args) {
		
	Student[] stMas = new Student [10];
	stMas [0] = new Student("Vasya", 1, new int [] {7,9,4,8,6});
	stMas [1] = new Student("Petya", 1, new int [] {10,9,9,10,9});
	stMas [2] = new Student("Sasha", 2, new int [] {10,10,10,10,10});
	stMas [3] = new Student("Masha", 2, new int [] {9,9,9,9,9});
	stMas [4] = new Student("Pasha", 2, new int [] {9,10,10,10,9});
	stMas [5] = new Student("Dasha", 3, new int [] {8,10,10,10,7});
	stMas [6] = new Student("Ivan", 3, new int [] {10,6,7,5,8});
	stMas [7] = new Student("Yulia", 3, new int [] {8,9,9,9,7});
	stMas [8] = new Student("Sveta", 3, new int [] {9,9,9,9,9});
	stMas [9] = new Student("Sergei", 3, new int [] {10,9,10,10,10});
	
	
	
	
	StudentLogic stLogic = new StudentLogic();
	GroupLogic grLogic = new GroupLogic (stLogic);
	
	Group gr1 = new Group (10);
	
	for (Student st : stMas) {
		gr1.add(st);
	}
			
	List<Student> aStList = grLogic.aLevelStudents(gr1);
	print(aStList);
	
	}
	
	public static void print (List<Student> aStList) {
		
		for (int i = 0; i < aStList.size(); i++) {
			
			System.out.println(aStList.get(i));
		}
	}

}
