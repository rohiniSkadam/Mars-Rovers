package model;

import java.util.Arrays;

/**
 * Created by synerzip on 16/2/17.
 */

public class Rover {

    int xCo;
    int yCo;
    String face;
    String[] roverCommands;

    public Rover(int xCo, int yCo, String face, String[] roverCommands) {

        this.xCo = xCo;
        this.yCo = yCo;
        this.face = face;
        this.roverCommands = roverCommands;
    }

    public Rover() {
    }

    public int getxCo() {
        return xCo;
    }

    public void setxCo(int xCo) {
        this.xCo = xCo;
    }

    public int getyCo() {
        return yCo;
    }

    public void setyCo(int yCo) {
        this.yCo = yCo;
    }


    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String[] getRoverCommands() {
        return roverCommands;
    }

    public void setRoverCommands(String[] roverCommands) {
        this.roverCommands = roverCommands;
    }

    @Override
    public String toString() {
        return "Rover{" + "xCo=" + xCo + ", yCo=" + yCo + ", face='" + face + '\'' +", roverCommands=" + Arrays.toString(roverCommands) + '}';
    }
}
