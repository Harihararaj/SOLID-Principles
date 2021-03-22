package com.company;
class VehicleActions{
    static void vehicleActions(Vehicle c){
        c.reverse();
    }
}
abstract class Vehicle{
    abstract void move();
    abstract void stop();
    abstract void reverse();
}
class Auto extends Vehicle{
    void move(){
        System.out.println("Auto is moving");
    }
    void stop(){
        System.out.println("Auto is stopped");
    }
    void reverse(){
        throw new UnsupportedOperationException();
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto v=new Auto();
        VehicleActions.vehicleActions(v);
    }
}
