package ui;

import model.Car;
import model.Engine;
import model.Body;

public class Main {
    public static void main(String[] args) throws Exception {

        // Mercedes Benz C300 2022, 2.0L inline 4-cylinder turbo, $45,550, 4-door sedan

        Body bodyOne = new Body("white", "sedan", 4, 5);
        Engine engineOne = new Engine(4, 255, 5.7, 'L', true);
        Car carOne = new Car("Mercedes-Benz", "C300W", 2022, 45550, bodyOne, engineOne);
        
        System.out.println("############# Below is the informaiont for First vehicle: ");

        // carOne.announceCar();
        System.out.println(carOne.toString());

        engineOne.setAccesleration0_60(5.8);  // setter can change the value of vairable and print out again
        System.out.println("The new 0 ~ 60 mph acceleration time is " + carOne.getEngine().getAcceleration0_60() + "sec.\n");

        // BMW 330i 2022, 2.0L inline 4-cylinder twinpower turbo, $41,450, 4-door sedan

        Body bodyTwo = new Body("blue", "sedan", 4, 5);
        Engine engineTwo = new Engine(4, 255, 5.6, 'L', true);
        Car carTwo = new Car("BMW", "330i", 2022, 42450, bodyTwo, engineTwo);

        System.out.println("############# Below is the informaiont for Second vehicle: ");
        // carTwo.announceCar();
        System.out.println(carTwo.toString());

        // Audi A4 2022, 2.0L inline 4-cylinder turbo, $39,900, 4-door sedan

        Body bodyThree = new Body("grey", "sedan", 4, 5);
        Engine engineThree = new Engine(4, 261, 5.2, 'L', true);
        Car carThree = new Car("Audi", "A4", 2022, 39900, bodyThree, engineThree);

        System.out.println("############# Below is the informaiont for Third vehicle: ");
        // carThree.announceCar();
        System.out.println(carThree.toString());

        // Toyota Camy XLE 2022, 2.5L inline 4-cylinder, $30,595, 4-door sedan

        Body bodyFour = new Body("black", "sedan", 4, 5);
        Engine engineFour = new Engine(4, 202, 7.3, 'L', false);
        Car carFour = new Car("Toyota", "Camry XLE", 2022, 30595, bodyFour, engineFour);

        System.out.println("############# Below is the informaiont for Fourth vehicle: ");
        // carFour.announceCar();
        System.out.println(carFour.toString());

        // Alfa Romeo Giulia 2022, 2.0L inline 4-cylinder turbo twinpower turbo, $43,350, 4-door sedan

        Body bodyFive = new Body("red", "sedan", 4, 5);
        Engine engineFive = new Engine(4, 280, 4.2, 'V', true);
        Car carFive = new Car("Alfa Romeo", "Giulia", 2022, 43350, bodyFive, engineFive);

        System.out.println("############# Below is the informaiont for Fifth vehicle: ");
        // carFive.announceCar();
        System.out.println(carFive.toString());

    }
}
