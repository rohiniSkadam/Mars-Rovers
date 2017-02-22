package controller;

import model.Plateau;
import model.Rover;
import org.apache.log4j.Logger;
import view.DisplayRover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by synerzip on 16/2/17.
 */
public class PlateauController {
    private Logger logger=Logger.getLogger(PlateauController.class);

    private ArrayList<Rover> roverList = new ArrayList<>();
    private int roverPosXco = 0, roverPosYco = 0,upperRightXco = 0, upperRightYco = 0;
    private String roverFace = null;
    private Scanner sc = new Scanner(System.in);
    private Plateau plateau = null;

    /**
     * Function to take Upper Right Coordinate & Rover Count
     */
    public void getInput() {
        System.out.print("Enter Upper Right Coordinates of the Plateau :  ");
        String upperRightCo = sc.nextLine();
        System.out.print("Enter Number Of Rovers : ");
        int numOfRovers = sc.nextInt();
        sc.nextLine();
        splitUpperRightCo(upperRightCo);
        getRoverDetails(numOfRovers);
    }

    /**
     * Function to take Rover Details i.e rover Position & commands for Rover
     * @param numOfRovers - Number of rovers on plateau
     */
    private void getRoverDetails(int numOfRovers) {
        String[] cmdArray;
        for (int i = 0; i < numOfRovers; i++) {
            System.out.print("Enter Rover Position : ");
            String roverPosition = sc.nextLine();
            System.out.print("Enter series of Commands for Rover :  ");
            String roverCommands = sc.nextLine();
            cmdArray = roverCommands.split("");
            splitRoverPositions(roverPosition);
            getRoverList(cmdArray);
            plateau = new Plateau(upperRightXco, upperRightYco, numOfRovers, roverList);
            logger.debug(plateau.toString());
        }
        roverPosition(plateau);
    }

    /**
     * Function to split the Upper Right coordinates Of Plateau
     * @param upperRightCo - Upper Right Coordinates of Plateau
     */
    private void splitUpperRightCo(String upperRightCo) {
        String[] upperCoArray = upperRightCo.split(" ");
        upperRightXco = Integer.parseInt(upperCoArray[0]);
        upperRightYco = Integer.parseInt(upperCoArray[1]);
        logger.debug(upperRightXco+""+upperRightYco);
    }

    /**
     * Function to split the Rover Positions in X,Y cordinate & its Face
     * @param roverPosition - Rover Coordinates & its Face
     */
    private void splitRoverPositions(String roverPosition) {
        String[] roverPositionArray = roverPosition.split(" ");
        roverPosXco = Integer.parseInt(roverPositionArray[0]);
        roverPosYco = Integer.parseInt(roverPositionArray[1]);
        roverFace = roverPositionArray[2];
        logger.debug(roverPosXco+""+roverPosYco+""+roverFace);
    }

    /**
     * Function to get the rover list which contain X,Y coordinate , rover face & Array of commands
     * @param cmdArray - Stores commands given to Rover
     */
    private void getRoverList(String[] cmdArray) {
        Rover rover = new Rover(roverPosXco, roverPosYco, roverFace, cmdArray);
        logger.debug("Rover Details : "+rover.toString());
        roverList.add(rover);
    }

    /**
     * Function to find the rover position & to fire the commands
     * @param plateau - Object of Plateau to get the rover list
     */
    private void roverPosition(Plateau plateau) {
        RoverController roverController = new RoverController();
        List<Rover> rList = plateau.getRoverList();
        for (Rover r : rList) {
            roverController.fireCommand(r);
            DisplayRover.showRover(r);
        }
    }

}
