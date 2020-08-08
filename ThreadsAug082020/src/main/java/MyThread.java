

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
            throw new RuntimeException(e + "Error at runtime" + ThreadColor.ANSI_BLUE);
        }

        System.out.println(ThreadColor.ANSI_BLUE + "three seconds have passed and i'm awake");
    }
}
