package JavaAbstractClasses.Level6;

import java.util.Random;

public class Area extends Shape{

    @Override
    void RectangleArea(double length, double breadth) {
        System.out.println(length*breadth);
    }

    @Override
    void SquareArea(double side) {
        System.out.println(Math.pow(side,2));

    }

    @Override
    void CircleArea(double radius) {
        System.out.println(Math.pow(radius,2)*Math.PI);

    }

    public static void main(String[] args) {
        Random rand = new Random();
        Area[] area = new Area[11];
        for (int i=0;i<area.length;i++){
            area[i] = new Area();
        }
        System.out.println("Square Area:");
        for (Area ar: area) {
            ar.SquareArea(rand.nextDouble(1.0,10.0));
        }
        System.out.println("Rectangle Area:");
        for (Area ar: area) {
            ar.RectangleArea(rand.nextDouble(1.0,10.0),rand.nextDouble(1.0,10.0));
        }
        System.out.println("Circle Area:");
        for (Area ar: area) {
            ar.CircleArea(rand.nextDouble(1.0,10.0));
        }



    }
}
