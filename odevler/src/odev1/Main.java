package odev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Yaz�l�m Geli�trici Yeti�tirme Kamp� (C#+ANGULAR)","Engin Demirog","%89 tamamland�");
		Course course2=new Course(2,"Yaz�l�m Geli�trici Yeti�tirme Kamp� (JAVA+REACT)","Engin Demirog","%17 tamamland�");
		Course course3=new Course(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demirog","%100 tamamland�");
		
		Category category1=new Category(1,"Programlama");
		
		Category[] categories= {category1};
		
		for(Category category:categories) {
			System.out.println(category.categoryName);
		}
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName+" --> "+course.instructorName+" --> "+course.completionRate);
		}
		
		Course course4 = new Course(4,"Yaz�l�m Geli�trici Yeti�tirme Kamp� (JAVASCRIPT)","Engin Demirog","�cretsiz");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course4);
		courseManager.update(course3);

	}

}
