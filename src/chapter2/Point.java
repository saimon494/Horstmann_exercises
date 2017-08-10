package chapter2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Objects;



// task 8 - Documentation comments

/**
 * describe point with coordinates x, y.
 * @author saimon494
 * @version 1.0
 */
// task 5
public class Point {
    private double x;
    private double y;

    /**
     * constructor
     * @param x
     *          coordinate
     * @param y
     *          coordinate
     */
    // task 8 - Alt+Ins - Constructors, getters, setters, Override, etc
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Default constructor
     */
    public Point() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * move point
     * @param xM
     *          increment x
     * @param yM
     *          increment y
     * @return new point
     */
    public Point translate(int xM, int yM){
        this.x += xM;
        this.y += yM;
        Point p = new Point(x, y);
        return p;
    }

    /**
     * method scale point coordinates
     * @param s
     *          scale coefficient
     * @return new point
     */
    public Point scale(double s){

        this.x *= s;
        this.y *= s;

        Point p = new Point(x, y);
        return p;
    }
// task 6 - setters - translate and scale
    public void translate1(int xM, int yM) {
        this.x += xM;
        this.y += yM;
    }

    public void scale1(double s) {
        this.x *= s;
        this.y *= s;
    }

    /**
     * Override default method
     * @return (x, y)
     */
    @Override
    public String toString() {
        return "(" + this.x +","+ this.y + ")";
    }

    public static void main(String[] args) {

        Point p = new Point(3,4).translate(1,3).scale(0.5);
        System.out.print("Point(3,4).translate(1,3).scale(0.5) ");
        System.out.println(p);

        Point p1 = new Point(3,4);
        p1.translate1(1,3);
        p1.scale1(0.5);
        System.out.print("Point(3,4) translate1(1,3) scale1(0.5)");
        System.out.println(p1);
        String sun;


    }
}

