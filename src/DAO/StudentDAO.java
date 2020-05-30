package DAO;

import java.util.List;

public interface StudentDAO {

	public List<Student>getALLstudent();
	public Student getStudent(int rno);
	public void update(Student s);
	public void delete(Student s);
	
}
