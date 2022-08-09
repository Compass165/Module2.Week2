package QuadraticEquation;

public class QuadraticEquation {

    public double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//   public QuadraticEquation(double a, double b, double c) {
//  }
//
//    public double getA() {
//        return a;
//    }
//    public double getB() {
//        return b;
//    }
//    public double getC() {
//        return c;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//    public void setB(double b) {
//        this.b = b;
//    }
//    public void setC(double c) {
//        this.c = c;
//   }

    public double getDiscriminant() {
        double Delta;
        return Delta = b*b - (4*a*c);
    }
    public double getRoot1(){
        double r1;
        return r1 = ((-b) + Math.sqrt(b*b - (4*a*c))) / a* 2;
    }
    public double getRoot2() {
        double r2;
        return r2 = ((-b) - Math.sqrt(b*b - (4*a*c))) / a* 2;
    }
    public double getDoubleSolution () {
        double r0;
        return r0 = (-b) / (2*a);
    }

//    public void checkDelta() {
//        if (getDiscriminant()>0) {
//            System.out.println("Phuong trinh co 2 nghiem la: "+getRoot1()+" va "+getRoot2());
//        } else if (getDiscriminant() == 0) {
//            System.out.println("Phuong trinh co nghiem kep la: "+getDoubleSolution());
//        } else {
//            System.out.println("Phuong trinh vo nghiem!");
//        }
//    }
}
