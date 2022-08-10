package point2dAnd3d;

public class Test {
    public static void main(String[] args) {
//        Point2D point2D = new Point2D(2.2f, 4.4f);
//        point2D.setXY(3.3f, 5.5f);
//        for (float e : point2D.getXY()) {
//            System.out.println(e);
//        }
//        System.out.println(point2D.getXY());
        Point3D point3D = new Point3D(2.2f, 4.4f, 6.6f);
        point3D.setXYZ(3.3f, 5.5f, 7.7f);
        for (float e : point3D.getXYZ()) {
            System.out.println(e);
        }
        System.out.println(point3D.toString());


    }
}
