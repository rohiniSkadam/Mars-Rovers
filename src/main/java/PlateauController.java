import model.Plateau;
import model.Rover;

/**
 * Created by synerzip on 16/2/17.
 */
public class PlateauController {
    RoverController rover=new RoverController();
    public void roverPosition(Plateau plateau)
    {
        String[] c=plateau.getRoverList().get(0).getRoverCommands();
        for(int i=0;i<c.length;i++)
        {
            rover.roverControl(c[i],plateau);
        }
        System.out.println(plateau.getRoverList().get(0).getFace());
    }

}
