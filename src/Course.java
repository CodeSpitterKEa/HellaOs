public class Course {
    private String courseName;
    private int maxParticipants;
    private int courseYear;
    private Student[] array;
    private int count;


    public void addStudent(Student v) {
        if (count < array.length) {
            array[count] = v;
            count += +1;
        }


    }
}