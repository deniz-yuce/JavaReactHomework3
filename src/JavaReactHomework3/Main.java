package JavaReactHomework3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student(1,"Deniz","Yüce","dnzyce@ex.com","abcd",
                "Student",54.6);
        Instructor instructor = new Instructor(2,"Engin", "Demiroğ", "engndmrg@ex.com",
                "efgh", "Instructor", 100);

        StudentManager studentManager = new StudentManager(new DatabaseLogger());
        studentManager.add(student);
        studentManager.remove(student);
        studentManager.update(student);

        InstructorManager instructorManager = new InstructorManager(new EmailLogger());
        instructorManager.add(instructor);
        instructorManager.remove(instructor);
        instructorManager.update(instructor);
    }
}
