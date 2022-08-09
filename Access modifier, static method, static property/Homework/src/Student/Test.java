package Student;

public class Test {

    public static void main(String[] args) {
        Student Phong = new Student();
        Phong.display();
        Student Huy = new Student("Huy","C06");
        Huy.display();
        Student Hang = new Student();
        Hang.setName("Hang");
        Hang.setClasses("C07");
        Hang.display();

        System.out.println(Student.numberOfStudent);
    }
}
