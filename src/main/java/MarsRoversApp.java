import controller.PlateauController;

/**
 * Created by synerzip on 16/2/17.
 */

public class MarsRoversApp {
    /**
     * Main Function to start the MarsRover App by calling Methods
     * @param args
     */
    public static void main(String[] args) {
        PlateauController p = new PlateauController();
        p.getInput();

    }
}

/*
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
Expected Output:
1 3 N
5 1 E
 */
