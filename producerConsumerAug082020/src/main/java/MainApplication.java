import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class MainApplication {
    public static  final String EOF = "EOF";
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();
        MyProducer myProducer = new MyProducer(buffer, ThreadColor.ANSI_BLUE, bufferLock);
        MyConsumer myConsumer = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
        MyConsumer myConsumer2 = new MyConsumer(buffer, ThreadColor.ANSI_RED, bufferLock);


        new Thread(myProducer).start();
        new Thread(myConsumer).start();
        new Thread(myConsumer2).start();


    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock){
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;

    }
    public void run() {
        Random random = new Random();
        String[] numbers = {"1", "2", "3", "4", "5"};
        for (String number : numbers) {
            try{
                System.out.println(color + "Adding... " + number);
                    bufferLock.lock();
                    try {
                        buffer.add(number);
                    }finally {
                        bufferLock.unlock();

                    }


                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                System.out.println("Producer was interrupted");
            }
        }// for loop.

        System.out.println(color + "Adding EOF and exiting... ");
            bufferLock.lock();
            try {
                buffer.add("EOF");
            }finally {
                bufferLock.unlock();
            }
    }
}


class MyConsumer implements Runnable {
    private List<String> buffer;
    private  String color;
    private ReentrantLock bufferLock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock){
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;

    }
    public void run() {
        while (true) {
            bufferLock.lock();
            try {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(MainApplication.EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            }finally {
                bufferLock.unlock();
            }
        }
    }
}
