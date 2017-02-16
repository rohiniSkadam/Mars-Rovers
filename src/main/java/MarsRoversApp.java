import model.Plateau;
import model.Rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by synerzip on 16/2/17.
 */

public class MarsRoversApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfRovers = 0;
        String upperRightCo, roverPosition, roverCommands = null, roverFace = null;
        int upperRightXco = 0, upperRightYco = 0;
        int roverPosXco = 0, roverPosYco = 0;
        ArrayList<Rover> roverList = new ArrayList<>();
        String[] cmdArray=null;
PlateauController pl=new PlateauController();
        Plateau plateau=null;

        System.out.print("Enter Upper Right Coordinates of the Plateau :  ");
        upperRightCo = sc.nextLine();
        String[] upperCoArray = upperRightCo.split(" ");

        System.out.print("Enter Number Of Rovers : ");
        numOfRovers = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < numOfRovers; i++) {

            for (int k = 0; k < upperCoArray.length; k++) {
                upperRightXco = Integer.parseInt(upperCoArray[0]);
                upperRightYco = Integer.parseInt(upperCoArray[1]);
            }

            System.out.print("Enter Rover Position : ");
            roverPosition = sc.nextLine();
            String[] roverPositionArray = roverPosition.split(" ");
            for (int j = 0; j < roverPositionArray.length; j++) {
                roverPosXco = Integer.parseInt(roverPositionArray[0]);
                roverPosYco = Integer.parseInt(roverPositionArray[1]);
                roverFace = roverPositionArray[2];

            }
            System.out.print("Enter series of Commands for Rover :  ");
            roverCommands = sc.nextLine();
            cmdArray = roverCommands.split("");

            Rover rover = new Rover(roverPosXco, roverPosYco, roverFace,cmdArray);
            roverList.add(rover);
            plateau = new Plateau(upperRightXco, upperRightYco, numOfRovers, roverList);
        }
        pl.roverPosition(plateau);
    }
}
