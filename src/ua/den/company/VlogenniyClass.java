package ua.den.company;

public class VlogenniyClass {
    public static void main(String[] args) {
        /*
        Computer comp = new Computer();
        comp.i7.start();
        comp.trancfer.start();
        comp.trancfer.shutDown();
        */

        new Computer(){
            void superComp(){
                this.i7.start();
                this.trancfer.start();
            }
        };
    }
}
