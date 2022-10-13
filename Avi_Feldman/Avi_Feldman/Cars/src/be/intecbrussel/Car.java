package be.intecbrussel;

import java.util.Scanner;

public class Car {

    // properties -> eigenschappen een persoon haar, handen, leeftijd
    private String colour = "White";
    private double maxSpeed = 120;
    private double horsePower = 150;
    private double currentSpeed;
    private static int carCount = 0;

    // constructors -> om een instantie van de klas te maken. een object car
    public Car() {
        carCount++;
    }

    public Car(String colour) {
        // encapsulation
        setColour(colour);
        //this.colour = colour;
    }

    public Car(String colour, double maxSpeed) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public Car(String colour, double maxSpeed, double horsePower) {
        setColour(colour);
        setMaxSpeed(maxSpeed);
        setHorsePower(horsePower);
        carCount++;
    }

    // get en set methode -> valideren en properties bruikbaar maken
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {

        if (colour.equals("purple")) {
            System.out.println("I dont like this colour");
        } else {
            this.colour = colour;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public static int getCarCount() {
        return carCount;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {

        if (currentSpeed < 0 && currentSpeed > maxSpeed) {
            System.out.println("Not possible");

        } else {
            this.currentSpeed = currentSpeed;
        }

    }


    // methodes
    public void speedUp() {

        if (currentSpeed > maxSpeed - 5) {
            System.out.println("Not possible to increase speed");
        } else {
            currentSpeed += 5;
        }

    }

    public void slowDown() {
        if (currentSpeed > maxSpeed) {
            System.out.println("Not possible to increase speed");
        } else {
            currentSpeed -= 5;
        }
    }

    // while met if
    public void repaint(String newColour) {

        Scanner myScanner = new Scanner(System.in);

        while (newColour.equalsIgnoreCase("Blue")) {

            if (newColour.equalsIgnoreCase("Blue")) {
                System.out.println("This colour is not possible. Pleas enter a diffrent colour:");
                newColour = myScanner.nextLine();
            }

        }

        this.colour = newColour;


    }


    // override
    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", horsePower=" + horsePower +
                '}';
    }
}
