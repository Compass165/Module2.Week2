package Student;

public class Student {

    private String name="Phong";
    private String classes="C06";
    public static int numberOfStudent;
    public Student (String name, String classes) {
        this.name=name;
        this.classes=classes;
        numberOfStudent++;
    }
    public Student () {
        numberOfStudent++;
    }

    public String getName() {
        return name;
    }
    public String getClasses (){
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        System.out.println("name: "+this.name+" class "+this.classes);
    }
}
