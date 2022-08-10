package pointAndmoveablepoint;

public class Test {

    public static void main(String[] args) {
        Point point = new Point(20, 30);
        System.out.println(point);

        point.setXY(10,20);
        System.out.println(point.toString());

        point = new MoveAblePoint(point.getX(), point.getY(),40,50);
        System.out.println(point.toString());

        ((MoveAblePoint) point).move();
        System.out.println(point.toString());
        MoveAblePoint anotherPoint = new MoveAblePoint(60,70,20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }

}
