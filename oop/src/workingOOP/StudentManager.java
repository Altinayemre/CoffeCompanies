package workingOOP;

public class StudentManager extends UserManager{
	public void courseRegister(Student student, Course course) {
		System.out.println(student.getFullName()+": "+course.courseName+" kursuna kay�t oldu.");
	}
	
	public void courseEvaluation(Student student,String message) {
		System.out.println(student.getFullName()+": "+message);
	}
}
