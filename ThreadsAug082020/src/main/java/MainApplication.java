

public class MainApplication {
    public static void main(String[] args) {
        Thread myTread = new MyThread();
        myTread.setName("Emman");
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello World");

        myTread.start();
        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_GREEN + "anonymous thread");
            }

        }.start();
        Thread myRunnable = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from anonymous class red");
            }
        });
        myRunnable.start();

        System.out.println(ThreadColor.ANSI_PURPLE +"The main thread started");

    }
}
