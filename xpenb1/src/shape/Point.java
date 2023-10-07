package shape;
import java.awt.*;

public class Point extends Shape
{
    private double x = 0.0, y=0.0;
    private double area = 0.0, perimeter=0.0;
    private String name;
    public double getArea() {return 0;};
    public double getPerimeter() {return 0;};
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public Point(){}
    public Point(String name, Color color, double area, double perimeter, double x, double y){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
        this.x = x;
        this.y = y;

    }
    public void draw() {
        System.out.println("Фигура: " + getShapeName());
        System.out.println("Цвет: " + getColor());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Координаты точек: " + getCoordinates());
    }

    @Override
    protected String getShapeName() {
        return null;
    }

    @Override
    protected double getCoordinates() {
        return 0;
    }
}

