

public class MainApplication {

    public static void main(String[] args) {
        Soccer playerRon = new Soccer("Ronaldo");
        Basketball playerJam = new Basketball("Lebron");
        Basketball playerLeon = new Basketball("Kawi");

        Team<Basketball> lakers = new Team<Basketball>("LA Lakers");
        Team<Soccer> madrid = new Team<Soccer>("Real Madrid FC");
        Team<Basketball> clippers = new Team<Basketball>("LA Clippers");
        lakers.addTeam(playerJam);
        madrid.addTeam(playerRon);

        System.out.println(lakers.getName());

        lakers.matchResult(clippers, 99, 85);
        clippers.matchResult(lakers, 103, 102);


    }
}
