import java.util.Arrays;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50",
                "I26", "I17", "I29",
                ")71");

        bingoNumbers.forEach(number -> {
            if (number.startsWith("G")){
                System.out.println(number);
            }
        });
    }

}
