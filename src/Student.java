public class Student {
    private int id;
    private String name;
    private int age;
    private double score;
    private int grade;


    public Student(int id, String name, int age, double score, int grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
    public void showStudentInfo(){
        System.out.printf("ID: %s\nName: %s\nAge: %s\nScore: %s\nGrade: %s", id, name, age, score, grade);
    }
}
