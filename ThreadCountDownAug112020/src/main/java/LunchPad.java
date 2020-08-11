

public class LunchPad implements Runnable {
    private String message;
    private int start;

    public LunchPad(String message, int start) {
        this.message = message;
        this.start = start;
    }

    @Override
    public void run() {
            try {
                Thread.sleep(20000 - (start * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(message);
    }
}
