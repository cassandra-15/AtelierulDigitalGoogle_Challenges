package Concurrency_7.Challenge1;

public class RabbitRunnable implements Runnable{
    private Integer nr;
    public RabbitRunnable(Integer nr)
    {
        this.nr=nr;
    }
    @Override
    public void run() {
        for (int i = 0; i < nr; i++)
            System.out.println("Rabbit " + i + " is running");
    }
}
