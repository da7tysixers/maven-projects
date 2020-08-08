

public class MainApplication {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello World");

        final Thread myTread = new MyThread();
        myTread.setName("Emman");
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
                try {
                    myTread.join();
                    System.out.println("waiting for myTread() to join");
                }catch (InterruptedException e){
                    System.out.println("Thread got interrupted");
                }
            }
        });
        myRunnable.start();


        System.out.println(ThreadColor.ANSI_PURPLE +"The main thread started");

    }
}
