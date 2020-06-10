package ru.job4j.condition;

public class Point {
    public static double distance( int x1, int x2, int y1, int y2){
        double res = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return res;
    }
    public static void main (String[] args) {
         int x1, x2, y1, y2;
        x1 = 0;
        y1 = 5;
        x2 = 0;
        y2 = 10;

        double result = Point.distance(x1, x2, y1, y2);
        System.out.println("distance (0, 0) to (2, 0) " + result);
    }


}
