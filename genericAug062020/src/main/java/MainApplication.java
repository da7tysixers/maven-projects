

public class MainApplication {

    public static void main(String[] args) {
        Team<Basketball> nba = new Team<Basketball>("Celtics");
        nba.addTeam(new Basketball("Celti", "Nba"));

        System.out.println(nba.typeofSports.get(0).getTeamLeague());

    }
}
