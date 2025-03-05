public class Student {
    private String name;
    private int studentId;
    private int age;


    //gettere

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }


    public Student(String name , int age , int studentId) {
        this.age=age;
        this.name=name;
        this.studentId=studentId;

    }
//setter

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

   public String toString() {
        return("Student name is: " + getName() + " Student id: " + getStudentId() + " Student age is : " + getAge());
   }
}
