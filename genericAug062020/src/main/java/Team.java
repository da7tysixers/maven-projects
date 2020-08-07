import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable {
    private String name;
    List<Player> typeofSports;

    public Team(String name) {
        this.name = name;
        this.typeofSports = new ArrayList<Player>();
    }




    public String getName(){
        return this.name;
    }
    public boolean addTeam(T sportTeam){
        if (typeofSports.contains(sportTeam)){
            System.out.println("Team already in the league");
            return true;
        }else {
            typeofSports.add(sportTeam);
            return false;
        }


    }


    public int compareTo(Object o) {
        return 0;
    }
}
