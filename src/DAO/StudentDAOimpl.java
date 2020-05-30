package DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOimpl implements StudentDAO{

	List<Student> stu = new ArrayList<>();
	StudentDAOimpl(){
		Student s1 = new Student(0,"Ankita");
		stu.add(s1);
	}
	@Override
	public List<Student> getALLstudent() {
		
		return stu;
	}

	@Override
	public Student getStudent(int rno) {
		
		return stu.get(rno);
	}

	@Override
	public void update(Student s) {
		Student temp = stu.get(s.getRollno());
		System.out.println("Updating the student "+temp.getRollno());
		temp.setName(s.getName());
		System.out.println("Upadated");
		
	}

	@Override
	public void delete(Student s) {
		Student temp = stu.get(s.getRollno());
		System.out.println("Deleting the student "+temp.getRollno());
		stu.remove(s.getRollno());
		System.out.println("Deleted");
	}

}
