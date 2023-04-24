package unit11.b;

class Vehicle extends Object{
    private int numWheels;

    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public String toString() {
        return this.getClass().getName() + " with " + numWheels + " wheels";
    }
}

// Code me! bikes have 2 wheels
public class Bike extends Vehicle {

    private String type;
    private boolean suspension;

    public Bike(){
        super(2);
    }

    public Bike(String type, boolean sus){
        super(2);
        this.type = type;
        this.suspension = sus;
    }

    public static void main (String [] args){
        Bike bike = new Bike();
        System.out.println(bike.toString());
    }
}
