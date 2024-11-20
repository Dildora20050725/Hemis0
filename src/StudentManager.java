import java.util.*;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void showAllStudents(){
        if (students.isEmpty()){
            System.out.println("Not found student!");
        }else {
            System.out.println("Student list: ");
            for (Student student: students){
                student.showStudentInfo();
            }
        }
    }
    public void searchStudentById(int id){
        boolean found = false;
        for (Student student: students){
            if (student.getId() == id){
                System.out.println("Found student: ");
                student.showStudentInfo();
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("The student with this "+id+" doesn't exist");
        }

    }
}
