import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    List<T> typeofSports;

    public Team(String name) {
        this.name = name;
        this.typeofSports = new ArrayList<T>();
    }


    public String getName(){
        return this.name;
    }
    public boolean addTeam(T player){
        if (typeofSports.contains(player)){
            System.out.println("Team already in the league");
            return false;
        }
            typeofSports.add(player);
            return true;
    }


    public int numberPlayers(){
        return typeofSports.size();

    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message = "";
        if (ourScore > theirScore){
            won++;
            message = " beat ";
        }else if (ourScore == theirScore){
            tied++;
            message = " drew with";
        }else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
             opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int rankingTeam(){
        return (won * 2) + tied;

    }
    public int compareTo(Team<T> team ) {
        if (this.rankingTeam() > team.rankingTeam() )  {
            return -1;
        }else if (this.rankingTeam() < team.rankingTeam()){
            return 1;
        }
        return 0;
    }
}
