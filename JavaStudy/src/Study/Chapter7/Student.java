package Study.Chapter7;

public class Student extends People {
	String studentNo;
	Student(String name, String ssn, String studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
}
