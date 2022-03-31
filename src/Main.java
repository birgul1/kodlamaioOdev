public class Main {

    public static void main(String[] args) {
        User user=new User();
        user.setId(1);
        user.setFirstName("Ahmet");
        user.setLastName("Bilir");
        user.setMail("ahmet@gmail.com");
        user.setPassword("abc12345");


        Student student=new Student();
        student.setId(1);
        student.setFirstName("Alperen");
        student.setLastName("Öztürk");
        student.setStudentNumber(2016222019);

        Instructor instructor=new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setMail("engindemiroğ@gmail.com");

        UserManager userManager=new UserManager();
        userManager.Add(user);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.Add(instructor);

        StudentManager studentManager=new StudentManager();
        studentManager.Add(student);

        userManager.Remove(user);
        instructorManager.Update(user);


    }
}
