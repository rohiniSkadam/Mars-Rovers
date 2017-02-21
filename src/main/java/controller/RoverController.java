package controller;

import model.Rover;
import org.apache.log4j.Logger;

/**
 * Created by synerzip on 16/2/17.
 */
public class RoverController {
    Logger logger=Logger.getLogger(RoverController.class);

    /**
     * Function to fire commands for Rover r
     * @param r - Rover Object which contains current position of Rover
     */
    public void fireCommand(Rover r) {
        String[] rcmd = r.getRoverCommands();
        for (int i = 0; i < rcmd.length; i++) {
            switch (rcmd[i]) {
                case "L":
                    moveLeft(r);
                    break;
                case "R":
                    moveRight(r);
                    break;
                case "M":
                    move(r);
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
        logger.debug("Rover Face : "+r.getFace());
    }

    /**
     * Function to move left When Rover having left command & also to change its face
     * @param rover -Rover Object which contains current position of Rover
     */
    public void moveLeft(Rover rover) {
        String currentFace = rover.getFace();
        switch (currentFace) {
            case "E":
                rover.setFace("N");
                break;
            case "N":
                rover.setFace("W");
                break;
            case "W":
                rover.setFace("S");
                break;
            case "S":
                rover.setFace("E");
                break;
            default:
                System.out.println("Invalid Direction");
        }
    }

    /**
     * Function to move & change its face When Rover having move Right command
     * @param rover - Rover Object which contains current position of Rover
     */
    public void moveRight(Rover rover) {
        String currentFace = rover.getFace();
        switch (currentFace) {
            case "E":
                rover.setFace("S");
                break;
            case "S":
                rover.setFace("W");
                break;
            case "W":
                rover.setFace("N");
                break;
            case "N":
                rover.setFace("E");
                break;
            default:
                System.out.println("Invalid Direction");
        }
    }

    /**
     * Function to move When Rover having move command & to change its position
     * @param rover - Rover Object which contains current position of Rover
     */
    public void move(Rover rover) {
        String currentFace = rover.getFace();
        int rXco = rover.getxCo();
        int rYco = rover.getyCo();
        switch (currentFace) {
            case "E":
                rover.setxCo(rXco + 1);
                break;
            case "S":
                rover.setyCo(rYco - 1);
                break;
            case "W":
                rover.setxCo(rXco - 1);
                break;
            case "N":
                rover.setyCo(rYco + 1);
                break;
            default:
                System.out.println("Invalid Direction");
        }
    }
}
