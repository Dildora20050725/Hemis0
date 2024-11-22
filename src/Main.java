import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        boolean exit = false;
        while (!exit){
            System.out.println();
            System.out.println("1 - Add student");
            System.out.println("2 - showAllStudent");
            System.out.println("3 - searchStudentById");
            System.out.println("4 - removeStudentById");
            System.out.println("5 - exit");
            System.out.println("Enter command: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter score: ");
                    double score = scanner.nextDouble();
                    System.out.println("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter address:");
                    String address = scanner.nextLine();
                    Student student = new Student(id, name, age, score, grade, address);
                    studentManager.addStudent(student);
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    studentManager.showAllStudents();
                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    int searchId = scanner.nextInt();
                    studentManager.searchStudentById(searchId);
                    break;
                case 4:
                    System.out.println("Enter ID: ");
                    int removeId = scanner.nextInt();
                    studentManager.removeStudentById(removeId);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exited program!");
                    break;
            }
        }

    }
}