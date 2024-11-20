import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while (true){
            System.out.println("1 - Add student");
            System.out.println("2 - showAllStudent");
            System.out.println("3 - searchStudentById");
            System.out.println("Enter command: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter score: ");
                    double score = scanner.nextDouble();
                    System.out.println("Enter grade: ");
                    int grade = scanner.nextInt();
                    Student student = new Student(id, name, age, score, grade);
                    studentManager.addStudent(student);
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    studentManager.showAllStudents();
                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    int studentId = scanner.nextInt();
                    studentManager.searchStudentById(studentId);
                    break;


            }
        }

    }
}