package Concurrency_7.Challenge1;

public class RabbitRace extends Thread {
    private Integer nr;

    public RabbitRace(int nr) {
        this.nr = nr;
    }
    public RabbitRace(Runnable r) {
        super(r);
    }

    public void run() {
        for (int i = 0; i < nr; i++)
            System.out.println("Rabbit " + i + " is running");
    }
}
