package AdvancedCountDown;

public class AdvancedCountDown extends Thread implements AdvancedInterface {
    private int countDown;

    public AdvancedCountDown(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        for (;countDown >= 0 ; countDown--) {
            System.out.println("Count down to lunch " + countDown );
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public int getTime() {
        return countDown;
    }
}
