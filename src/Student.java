public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int id, String name, int age, double score, int grade, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.grade = grade;
        this.address = address;
    }

    private double score;
    private int grade;
    private String address;



    public void showStudentInfo(){
        System.out.printf("ID: %s\nName: %s\nAge: %s\nScore: %s\nGrade: %s\nAddress: %s", id, name, age, score, grade, address);
    }
}
