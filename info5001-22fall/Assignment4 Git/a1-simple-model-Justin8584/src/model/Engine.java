package model;

/**
 * Information about Engine include:
 * 
 * - Number of Cylinders
 * - Power output in Horse power
 * - 0~60mph acceleration time in second
 * - Engine Type (char), (L - inline, V-angled, Horizontal)
 * - Turbo include or not
 */

public class Engine {
    
    private int numCylinders;
    private int powerOutput;
    private double acceleration0_60;
    private char engineType;
    private boolean turbo;

    public Engine(int numCylinders, int powerOutput, double acceleration0_60, char engineType, boolean turbo) {
        this.numCylinders = numCylinders;
        this.powerOutput = powerOutput;
        this.acceleration0_60 = acceleration0_60;
        this.engineType = engineType;
        this.turbo = turbo;
    }

    public int getNumCylinders() {
        return numCylinders;
    }
    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public int getPowerOutput() {
        return powerOutput;
    }
    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }
    
    public double getAcceleration0_60() {
        return acceleration0_60;
    }
    public void setAccesleration0_60(double acceleration0_60) {
        this.acceleration0_60 = acceleration0_60;
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        this.engineType = engineType;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    
}
