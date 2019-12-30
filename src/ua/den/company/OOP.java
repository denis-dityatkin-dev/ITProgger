package ua.den.company;

public class OOP {

        public int height = 180;
        public String name = "Defsult";

    public OOP(int h, String n) {
        height = h;
        name = n;
    }
    public OOP(){

    }
    public OOP(String n){
name = n;
    }


    public void say (String name){
            System.out.println("Hello, " + name);
        }


    }

