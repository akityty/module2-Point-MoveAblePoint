import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.2f,4.4f);
        System.out.println(point);

        MoveAblePoint moveAblePoint = new MoveAblePoint(2.2f,1.1f);
        System.out.println(Arrays.toString(moveAblePoint.getXY()));
        moveAblePoint.move();
        System.out.println(moveAblePoint);

        moveAblePoint.setSpeed(2.2f,1.1f);
        moveAblePoint.move();
        System.out.println(moveAblePoint);



    }
}
