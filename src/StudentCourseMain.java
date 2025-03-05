public class StudentCourseMain {
    public static void main(String[] args) {
        Student student = new Student("Diaz" , 69 , 420);
        student.getAge();
        student.getStudentId();
        student.getName();
        System.out.println(student.toString());
    }
}
