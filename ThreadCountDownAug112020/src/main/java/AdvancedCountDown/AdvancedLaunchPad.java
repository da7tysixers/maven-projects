package AdvancedCountDown;

public class AdvancedLaunchPad implements Runnable {
    private String message;
    private int start;
    private AdvancedInterface advancedInterface;

    public AdvancedLaunchPad(String message, int start, AdvancedInterface advancedInterface) {
        this.message = message;
        this.start = start;
        this.advancedInterface = advancedInterface;
    }



    @Override
    public void run() {
        boolean eventDone = false;
        while (!eventDone){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (advancedInterface.getTime() <= start){
                System.out.println(this.message);
                eventDone = true;
            }
        }//while

    }
}
