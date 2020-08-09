import java.util.Random;

public class MainApplication {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}


class Message {
    private String message;
    private boolean empty = true;


    public synchronized String read() {
        while (empty){
            try{
                wait();
            }catch (InterruptedException e){

            }
        }

        empty = true;
        notifyAll();
        return message;

    }

    public synchronized void write(String message){
        while (!empty){
                try {
                    wait();
                }catch (InterruptedException e){

                }
        }

        empty = false;
        this.message = message;
        notifyAll();
    }
}

class  Writer implements  Runnable{
    private  Message message;

    public Writer(Message message){
        this.message = message;
    }

    public void run() {
        String[] messages = {"Malachi sat on the wall", "Kyah sat on the table",
        "Shamia is a tall girl", "Humpty Dumpty is too hungry"};

        Random random = new Random();

        for (int i = 0; i < messages.length ; i++) {
            message.write(messages[i]);
            try{
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){

            }
        }

        message.write("finished");

    }
}


class Reader implements  Runnable{
    private Message message;

    public Reader(Message message){
        this.message = message;
    }


    public void run() {
        Random random = new Random();

        for (String newMessage = message.read(); !newMessage.equals("finished");
             newMessage = message.read()) {
            System.out.println(newMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){

            }
        }
    }
}
