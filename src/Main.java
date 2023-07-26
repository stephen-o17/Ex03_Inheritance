import com.qa.Rectangle;
import com.qa.Circle;
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("Rectangle1","blue", 0, 0, 10, 10);
        Rectangle r2 = new Rectangle("Rectangle2", "green", 2, 2, 5, 2);
        System.out.println(r);
        System.out.println(r2);

        System.out.println(r + ", Centrepoint is: " + r.getCentrePoint() + ", Area is: " + r.getArea() + ". Is it square? " + r.isSquare());
        System.out.println(r2 + ", Centrepoint is: " + r2.getCentrePoint() + ", Area is: " + r2.getArea() + ". Is it square? " + r2.isSquare());

        // Creating circle objects
        Circle c = new Circle("Circle1", "red", 0, 0, 10);
        Circle c2 = new Circle("Circle2", "yellow", 10, 10, 5);

        // Print out circle objects
        System.out.println(c);
        System.out.println(c2);

        // Getting the Areas and Centre Points

        System.out.println(c + ", Centrepoint is: " + c.getCentrePoint() + ", Area is: " + c.getArea());
        System.out.println(c2 + ", Centrepoint is: " + c2.getCentrePoint() + ", Area is: " + c2.getArea());
    }
}