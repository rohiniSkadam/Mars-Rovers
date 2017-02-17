package controller;

import model.Rover;

/**
 * Created by synerzip on 16/2/17.
 */
public class RoverController {

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
    }

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
