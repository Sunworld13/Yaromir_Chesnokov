package shape;
import java.awt.*;

public class Circle {
    private Point point;
    private double radius;

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }
    private void validate(double radius)
    {
        if(radius < 0)
        {
            System.out.println("Радиус не может быть меньше нуля");
        }
    }
    public Circle(){}
    public Circle(String name, Color color, double area, double perimeter, Point point, double radius){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
        this.point = point;
        this.radius = radius;
    }
}
