package model;

import java.util.List;

/**
 * Created by synerzip on 16/2/17.
 */
public class Plateau {
    int upperRightXCo;
    int upperRightYCo;
    int numOfRovers;
    List<Rover> roverList;

    public Plateau() {
    }

    public Plateau(int upperRightXCo, int upperRightYCo, int numOfRovers, List<Rover> roverList) {
        this.upperRightXCo = upperRightXCo;
        this.upperRightYCo = upperRightYCo;
        this.numOfRovers = numOfRovers;
        this.roverList = roverList;
    }

    public int getUpperRightXCo() {
        return upperRightXCo;
    }

    public void setUpperRightXCo(int upperRightXCo) {
        this.upperRightXCo = upperRightXCo;
    }

    public int getUpperRightYCo() {
        return upperRightYCo;
    }

    public void setUpperRightYCo(int upperRightYCo) {
        this.upperRightYCo = upperRightYCo;
    }

    public int getNumOfRovers() {
        return numOfRovers;
    }

    public void setNumOfRovers(int numOfRovers) {
        this.numOfRovers = numOfRovers;
    }

    public List<Rover> getRoverList() {
        return roverList;
    }

    public void setRoverList(List<Rover> roverList) {
        this.roverList = roverList;
    }


    @Override
    public String toString() {
        return "Plateau{" + "upperRightXCo=" + upperRightXCo + ", upperRightYCo=" + upperRightYCo +
                ", numOfRovers=" + numOfRovers + ", roverList=" + roverList + '}';
    }
}
