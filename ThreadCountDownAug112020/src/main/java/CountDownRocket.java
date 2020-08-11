

public class CountDownRocket extends Thread {
    private static final String ANSI_BLUE = "\u001B[34m";


    @Override
    public void run() {
        for (int i = 20; i >= 0 ; i--) {
            System.out.printf(ANSI_BLUE + "Countdown to rocket lunch %d\n", i);
            try {
                Thread.sleep(1000);
                if (i == 0){
                    System.out.println("Countdown complete...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
