public class Main {

    public static void main(String[] args) {
        BuildFan fan1 = new BuildFan(3, true, 10, "yellow");
        BuildFan fan2 = new BuildFan(2, false, 5, "blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
