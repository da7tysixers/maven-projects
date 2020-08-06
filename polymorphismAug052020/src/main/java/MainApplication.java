

public class MainApplication {

    public static void main(String[] args) {

        for (int i = 0; i < 11 ; i++) {
            Movie movie = randomMovie();
            System.out.println("## " + movie.getMovieTitle() + " ##" + "\n" + movie.movieDescription());
            System.out.println("==================================");
        }

    }

    public static Movie randomMovie(){
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated is: " + random);
        switch (random){
            case 1:
                return new Club300();
            case 2:
                return new Troy();
            case 3:
                return new Rome();
            case 4:
                return new MenInBlack();
            case 5:
                return new Terminator();
        }
        return null;
    }
}
