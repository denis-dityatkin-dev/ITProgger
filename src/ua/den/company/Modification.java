package ua.den.company;

public class Modification {
    public static void main(String[] args) {

        int x = Math.mult(23,35);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        Math.x = 24;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);
    }
}
