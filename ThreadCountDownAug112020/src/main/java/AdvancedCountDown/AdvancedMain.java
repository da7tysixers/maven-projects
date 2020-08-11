package AdvancedCountDown;

import java.util.ArrayList;

public class AdvancedMain {
    public static void main(String[] args) {
        ArrayList<Runnable> luncher = new ArrayList<Runnable>();
        AdvancedCountDown clock = new AdvancedCountDown(20);
        luncher.add(new AdvancedLaunchPad("Flood the pad!", 16,clock ));
        luncher.add(new AdvancedLaunchPad("Start the engine!",6 , clock));
        luncher.add(new AdvancedLaunchPad("Rocket lunch!",-1 , clock));

        clock.start();
        for (Runnable runnable : luncher) {
            new Thread(runnable).start();
        }
    }
}
