

public class MainApplication {

    public static void main(String[] args) throws InterruptedException {
       Thread count = new CountDownRocket();
        //Thread count2 = new Thread(new LunchPad());
        //count.start();
        //count2.start();
        Runnable flood, ignite, liftoff;
        flood = new LunchPad("Flood the pad!", 16);
        ignite = new LunchPad("Start engine!", 6);
        liftoff = new LunchPad("Rocket lift-off!", -1);
        count.start();
        new Thread(flood).start();
        new Thread(ignite).start();
        new Thread(liftoff).start();

    }
}
