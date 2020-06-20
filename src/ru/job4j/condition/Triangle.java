package ru.job4j.condition;

public class Triangle {
    /*public static String exist(double a, double b, double c) {
        String label = ((a + b) > c && (b + c) > a && (a + c) > b) ? "Triangle exist" : "Triangle does not exist";
        return label;
    }

    public static void main(String[] args) {
        String label = exist(2, 3, 3);
        System.out.println(label);
    }*/
    public static boolean exist(double a, double b, double c) {
        boolean triangle = ((a + b) > c && (b + c) > a && (a + c) > b) ? true : false;
         if (triangle == true) {
             System.out.println("Triangle exist");
         } else {
             System.out.println("Triangle does nor exist");
         }
        return triangle;
    }

    public static void main(String[] args) {
        boolean label = exist(2, 3, 3);
//        System.out.println(label);
    }
}
