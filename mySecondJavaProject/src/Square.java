import java.util.concurrent.Callable;

/**
 * Created by nobyeong-gug on 03/07/2017.
 */

class Circle {
    public double radius ;
    public double area;


    Circle (int radius)
    {
        this.radius = radius;
    }

    public void displayArea(){
        area = radius*radius * Math.PI;
        System.out.println(area);
    }

    protected void displayArea2(){
        area = 10*radius*radius * Math.PI;
        System.out.println(area);
    }
}
public class Square {
    public static void main(String[] args)
    {
        Circle myCircle1 = new Circle(10);
        System.out.println("hello world");
        myCircle1.displayArea();
        myCircle1.displayArea2();
    }
}
