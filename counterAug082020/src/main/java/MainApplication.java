

public class MainApplication {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountDownThread count1 = new CountDownThread(countDown);
        count1.setName("Thread 1");
        CountDownThread count2 = new CountDownThread(countDown);
        count2.setName("Thread 2");

        count1.start();
        count2.start();
    }
}


class CountDown{
    private int index; // using private variable changes the way each thread prints
                       // each thread avoid duplication each others.

    public void doCountDown(){
        String color;

        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;


        }
        synchronized (this) {
            for (index = 10; index > 0; index--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + index);
            }
        }
    }
}

class CountDownThread extends Thread {
    private  CountDown countThread;
    public CountDownThread(CountDown countThread) {
        this.countThread = countThread;
    }

    public void run(){
        countThread.doCountDown();
    }
}