package pointAndmoveablepoint;

public class MoveAblePoint extends Point {

private float xSpeed = 0.0f;
private float ySpeed = 0.0f;

public MoveAblePoint () {

}
public MoveAblePoint (float xSpeed, float ySpeed) {
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
}

public MoveAblePoint (float xSpeed, float ySpeed, float x, float y) {
    super(x, y);
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
}
public void setSpeed(float xSpeed, float ySpeed) {
    super.setXY(xSpeed, ySpeed);
}
public float[] getSpeed(){
    float [] arr = {this.xSpeed, this.ySpeed};
    return arr;
}
public void move() {
    this.setX(this.getX()+this.xSpeed);
    this.setY(this.getY()+this.ySpeed);
}

    @Override
    public String toString() {
        return super.toString()
                + " speed: "
                +this.xSpeed
                + ", "
                + this.ySpeed
                +"\n";
    }
}
