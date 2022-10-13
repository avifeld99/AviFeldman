package be.intecbrussel;

public class AutoApp {

    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println(myCar);

        Car myCar1 = new Car("green");
        Car myCar2 = new Car("groen", 70);
        Car myCar3 = new Car("Yellow", 160, 200);

        myCar.setCurrentSpeed(120);
        myCar.slowDown();
        myCar.repaint("blue");
        //myCar.setColour("blue");
        System.out.println(myCar.getCurrentSpeed() + " colour car: " + myCar.getColour());

        // System.out.println(myCar.getCarCount());

    }
}