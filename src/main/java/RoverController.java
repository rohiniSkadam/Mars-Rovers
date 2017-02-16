import model.Plateau;
import model.Rover;

import java.util.List;

/**
 * Created by synerzip on 16/2/17.
 */
public class RoverController {
   // Rover r = new Rover();
    public  void roverControl(String cmd, Plateau plateau)
    {
        switch (cmd)
        {
            case "L":
                moveLeft(plateau);
           case "R":
                moveRight(plateau);
        }
    }

    public void moveLeft(Plateau plateau) {
        String currentFace=plateau.getRoverList().get(0).getFace();
        List<Rover> r=plateau.getRoverList();
        switch (currentFace) {
            case "E":
                r.get(0).setFace("N");
            case "N":
                r.get(0).setFace("W");
            case "W":
                r.get(0).setFace("S");
            case "S":
                r.get(0).setFace("E");
        }

    }

    public void moveRight(Plateau plateau) {
        String currentFace=plateau.getRoverList().get(0).getFace();
        List<Rover> r=plateau.getRoverList();
        switch (currentFace) {
            case "E":
                r.get(0).setFace("S");
            case "S":
                r.get(0).setFace("W");
            case "W":
                r.get(0).setFace("N");
            case "N":
                r.get(0).setFace("E");
        }

    }

    public void move(Plateau plateau) {
        String currentFace=plateau.getRoverList().get(0).getFace();
        List<Rover> r=plateau.getRoverList();
//        int xCo=r.getxCo();
//        int yCo=r.getyCo();
//        String face=r.getFace();
        r.get(0).setxCo( r.get(0).getxCo() + 1);
        r.get(0).setyCo( r.get(0).getyCo() + 1);
    }

}
