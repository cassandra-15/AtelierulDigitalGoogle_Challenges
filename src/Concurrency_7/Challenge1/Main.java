package Concurrency_7.Challenge1;

public class Main {
    public static void main(String[] args) {
        Thread r1=new RabbitRace(5);
        Runnable r2=new RabbitRunnable(5);
        Thread r3=new RabbitRace(r2);
        r1.start();
        r2.run();
//        r3.start();
    }
}
