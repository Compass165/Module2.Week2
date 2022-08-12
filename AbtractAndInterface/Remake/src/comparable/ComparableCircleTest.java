package comparable;
import java.util.Arrays;
public class ComparableCircleTest {

    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(3.6);
        ComparableCircle circle2 = new ComparableCircle();
        ComparableCircle circle3 = new ComparableCircle(3.5, "indigo", false);
        ComparableCircle[] circles = {circle1, circle2, circle3};

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
    }

