package workingOOP;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin Demirog","engindemirog@gmail.com","MCT,PMP ve ITIL sertifikalar�na sahibim. :)","engin123");
		Student student = new Student(1, "Emre Alt�nay", "emre_altinay@hotmail.com", "T�rkiye", "Antalya", "emre123");
		Course course = new Course(1,"JAVA+REACT",instructor.getFullName(),"%25");
		
		UserManager userManager = new UserManager();
		userManager.login(instructor);
		userManager.login(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseAdd(instructor,course);
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseRegister(student,course);
		studentManager.courseEvaluation(student, "�ok ba�ar�l� ve verimli bir dersti.");
		
		userManager.logout(student);
		userManager.logout(instructor);

	}

}
