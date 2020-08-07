
import java.util.ArrayList;
import java.util.Collections;


public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();


    public  League(String name){
        this.name = name;
    }
    public boolean add(T value) {
        if (league.contains(value)) {
            return true;
        } else {
            league.add(value);
            return false;
        }
    }
        public void showleague() {
        Collections.sort(league);
            for (T t : league) {
                System.out.println(t.getName());
            }
        }

}
