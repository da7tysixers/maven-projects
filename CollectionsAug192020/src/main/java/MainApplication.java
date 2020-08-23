import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
       Theatre theatre = new Theatre("Olympian", 8, 12);
       List<Theatre.Seat> seatCopy = new ArrayList<Theatre.Seat>(theatre.seats);
       printList(seatCopy);
        Collections.shuffle(theatre.seats);
        printList(theatre.seats);
        Theatre.Seat max = Collections.max(theatre.seats);
        System.out.println(max.getSeatNumber());
        sortList(theatre.seats);
        printList(theatre.seats);


    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===============================================");
    }


    public static void sortList(List<? extends  Theatre.Seat> list){
        for (int i = 0; i < list.size() ; i++) {
            for (int j = i +1; j < list.size() ; j++) {
                Collections.swap(list, i, j);
            }

        }
    }
}
