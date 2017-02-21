package view;

import model.Rover;

/**
 * Created by synerzip on 17/2/17.
 */
public class DisplayRover {
    /**
     * Function to display the Rover Position
     * @param r -Rover Object which contains current position of Rover
     */
    public static void showRover(Rover r) {
        System.out.println(r.getxCo() + " " + r.getyCo() + " " + r.getFace());
    }
}
