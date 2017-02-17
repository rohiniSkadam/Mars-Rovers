package view;

import model.Rover;

/**
 * Created by synerzip on 17/2/17.
 */
public class DisplayRover {
    public static void showRover(Rover r) {
        System.out.println(r.getxCo() + " " + r.getyCo() + " " + r.getFace());
    }
}
