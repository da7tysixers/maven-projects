

public class MyThread extends Thread {

    private String name;

    public MyThread() {
        super();
    }

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Thread " + currentThread().getName());
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE +"Another Thread woke me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "three seconds have passed and i'm awake");
    }
}
