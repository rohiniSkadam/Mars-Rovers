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
    //Logger logger=Logger.getLogger(PlateauController.class);

    ArrayList<Rover> roverList = new ArrayList<>();
    int roverPosXco = 0, roverPosYco = 0;
    String roverFace = null;
    int upperRightXco = 0, upperRightYco = 0;
    private Scanner sc = new Scanner(System.in);
    private Plateau plateau = null;

    public void getInput() {
        System.out.print("Enter Upper Right Coordinates of the Plateau :  ");
        String upperRightCo = sc.nextLine();
        System.out.print("Enter Number Of Rovers : ");
        int numOfRovers = sc.nextInt();
        sc.nextLine();
        splitUpperRightCo(upperRightCo);
        getRoverDetails(numOfRovers);
    }

    public void getRoverDetails(int numOfRovers) {
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

        }
        roverPosition(plateau);
    }

    public void splitUpperRightCo(String upperRightCo) {
        String[] upperCoArray = upperRightCo.split(" ");
        upperRightXco = Integer.parseInt(upperCoArray[0]);
        upperRightYco = Integer.parseInt(upperCoArray[1]);
    }

    public void splitRoverPositions(String roverPosition) {
        String[] roverPositionArray = roverPosition.split(" ");
        roverPosXco = Integer.parseInt(roverPositionArray[0]);
        roverPosYco = Integer.parseInt(roverPositionArray[1]);
        roverFace = roverPositionArray[2];
    }

    public void getRoverList(String[] cmdArray) {
        Rover rover = new Rover(roverPosXco, roverPosYco, roverFace, cmdArray);
        roverList.add(rover);
    }

    public void roverPosition(Plateau plateau) {
        RoverController roverController = new RoverController();
        List<Rover> rList = plateau.getRoverList();
        for (Rover r : rList) {
            roverController.fireCommand(r);
            DisplayRover.showRover(r);
        }
    }

}
