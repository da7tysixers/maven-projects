

public class MainApplication {

    public static void main(String[] args) {
        Thread count = new CountDownRocket(20);
        count.start();
    }
}
