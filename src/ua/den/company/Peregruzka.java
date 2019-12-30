package ua.den.company;

public class Peregruzka {
    public static int sum (int a, int b){
        return a + b;
    }
    public static int sum (int a, int b, int g){
        return a + b + g;
    }
    public static double sum (double a, double b, double g){
        return a + b + g;
    }

    public static void main(String[] args) {
        System.out.println(sum(23,12));
        System.out.println(sum(23.12,12.34, 34.14));
    }
}
