import controller.PlateauController;
import org.apache.log4j.Logger;

/**
 * Created by synerzip on 16/2/17.
 */

public class MarsRoversApp {
    public static void main(String[] args) {
      //  Logger logger=Logger.getLogger(MarsRoversApp.class);
        PlateauController p = new PlateauController();
        p.getInput();
      //  logger.info("In Main.");

    }
}
