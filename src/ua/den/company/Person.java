package ua.den.company;

public class Person {
    public static void main(String[] args) {
        OOP vitya = new OOP(210,"Denis");
        //vitya.height = 210;
        vitya.say("George");
               System.out.println(vitya.name + "\'s height is " +  vitya.height);
        OOP vlad = new OOP();
        System.out.println(vlad.height);

        OOP dima = new OOP();
        System.out.println(dima.name);
        System.out.println("");

        Student freshman = new Student(76, "Viktor", 3);
        freshman.tell();
    }
}
