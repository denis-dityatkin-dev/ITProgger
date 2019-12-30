package ua.den.company;

public class Computer {
    class Proccessor{
        private boolean isStart = false;

        public void start(){
            isStart = true;
        }
        public void shutDown(){
            isStart = false;
        }
    }

    class RAM{
        private boolean isStart = false;

        public void start(){
            isStart = true;
            System.out.println("isStart = " + isStart);
        }
        public void shutDown(){
            isStart = false;
            System.out.println("shutDown  = " + isStart);
        }
    }
    Proccessor i7 = new Proccessor();
    RAM trancfer = new RAM();
}
