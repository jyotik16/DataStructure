package DAO;

public class DAODemo {
public static void main(String[] args) {
	
	
	StudentDAO d = new StudentDAOimpl();
	
	for(Student ss:d.getALLstudent()) {
		System.out.println(ss.getRollno()+" "+ss.getName());
	}
	
	Student s1 = d.getALLstudent().get(0);
	s1.setName("Jyoti");
	d.update(s1);
	
	for(Student ss:d.getALLstudent()) {
		System.out.println(ss.getRollno()+" "+ss.getName());
	}
}
}
