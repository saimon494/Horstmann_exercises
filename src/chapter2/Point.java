package chapter2;

import com.sun.org.apache.xpath.internal.SourceTree;

// task 5
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point translate(int xM, int yM){
        this.x += xM;
        this.y += yM;
        Point p1 = new Point(x, y);
        return p1;

    }
//
//    public int scale(){
//        return ;
//    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point p = new Point(3,4);

        System.out.println("This is new point on x = " + p.getX() + " and y = " + p.getY());
        System.out.println("Point p move to " + p.translate(1,3));
    }
}

