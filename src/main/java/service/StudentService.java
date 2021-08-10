package service;

import entities.Student;

public class StudentService {
	public Student selectStuById(String id)
	{
		Student stu = new Student();
		//stu.selectById(id);
		return stu.selectById(id);
	}

}
