package model;

/** 
* Information about Body includes:
* -
* - Color
* - Number of doors
* - Body Type (sedan, SUV, coupe, wagon)
* - Toteal seating
* -
**/

public class Body {
    
    private String color;
    private String bodyType;
    private int numDoors;
    private int totalSeating;

    public Body(String color, String bodyType, int numDoors, int totalSeating) {
        this.color = color;
        this.bodyType = bodyType;
        this.numDoors = numDoors;
        this.totalSeating = totalSeating;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
    public int getTotalSeating() {
        return totalSeating;
    }

    public void setTotalSeating(int totalSeating) {
        this.totalSeating = totalSeating;
    }

    }


