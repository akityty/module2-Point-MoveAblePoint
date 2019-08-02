
import java.util.Arrays;

public class MoveAblePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveAblePoint(){
    }
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed  = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {this.getxSpeed(),this.getySpeed()};
    }
    @Override
    public String toString(){
        return "(x,y): "+ Arrays.toString(this.getXY())+"(xSpeed,ySpeed): "+ Arrays.toString(this.getSpeed());
    }
    public void move(){
        float tempX = this.getX();
        float tempY = this.getY();
        tempX += this.getxSpeed();
        tempY += this.getySpeed();
        super.setX(tempX);
        super.setY(tempY);
    }
}
