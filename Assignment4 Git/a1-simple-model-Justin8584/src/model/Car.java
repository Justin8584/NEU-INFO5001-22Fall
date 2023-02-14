package model;

/** 
 * Information about a car includes:
 * 
 * - Model name
 * - Manufacturer
 * - Year
 * - Body
 * - Engine
 * - MSRP Price
 * 
**/

public class Car {
    
    private String manufacturer;
    private String modelName;
    private int year;
    private int MSRPprice;
    private Body body;
    private Engine Engine;
    
    public Car(String manufacturer, String modelName, int year, int mSRPprice, Body body, Engine engine) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.MSRPprice = mSRPprice;
        this.body = body;
        this.Engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMSRPprice() {
        return MSRPprice;
    }
    public void setMSRPprice(int mSRPprice) {
        MSRPprice = mSRPprice;
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }
    public Engine getEngine() {
        return Engine;
    }
    public void setEngine(Engine engine) {
        Engine = engine;
    }
    
    // self defined fucntion to print results
    public void announceCar() {
        System.out.println("\nThis vehicle is " + this.manufacturer + " " + this.modelName + " in " + this.year + " year version.");
        System.out.println("The current MSRP price is $" + this.MSRPprice + ".");
        System.out.println("It is a " + this.body.getColor() + " " + this.body.getBodyType() + " with " + this.body.getNumDoors() + " doors and total " + this.body.getTotalSeating() + " seats.");
        System.out.println("Its engine has power of " + this.Engine.getPowerOutput() + " hp and " + this.Engine.getAcceleration0_60() + " sec from 0 ~ 60 mph within total " + this.Engine.getNumCylinders() + " cylinders. ");
        System.out.println("All cylinders in engine are arranged in " + this.Engine.getEngineType() + " shape and turbo status is " + this.Engine.isTurbo() + ".\n");
    }
    
    // override toString function and print results
    @Override
    public String toString() {

        String a = String.format("\nThis vehicle is %s %s in %s year version.\n", manufacturer, modelName, year);
        String b = String.format("The current MSRP price is $%s.\n", MSRPprice);
        String c = String.format("It is a %s %s with %s doors and total %s seats.\n", body.getColor(), body.getBodyType(), body.getNumDoors(), body.getTotalSeating());
        String d = String.format("Its engine has power of %s hp and %s sec from 0 ~ 60 mph within total %s cylinders.\n", Engine.getPowerOutput(), Engine.getAcceleration0_60(), Engine.getNumCylinders());
        String e = String.format("All cylinders in engine are arranged in %s shape and turbo status is %s.\n", Engine.getEngineType(), Engine.isTurbo());
        return a.concat(b).concat(c).concat(d).concat(e);

    }
}
    
