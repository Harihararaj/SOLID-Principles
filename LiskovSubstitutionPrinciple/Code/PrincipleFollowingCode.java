package com.company;
class VehicleAction{
    static void vehicleActionRe(ReversableVehicle v ){
        v.reverse();
    }
    static void vehicleAction(Vehicle1 v2){
        v2.move();
    }
}
abstract class Vehicle1{
    abstract void move();
    abstract void stop();
}
abstract class ReversableVehicle extends Vehicle1{
    abstract void reverse();
}
class car extends ReversableVehicle{
    void move(){
        System.out.println("car is moving");
    }
    void stop(){
        System.out.println("car is stoped");
    }
    void reverse(){
        System.out.println("car is reversed");
    }
}
class Auto1 extends Vehicle1{
    void move(){
        System.out.println("Auto is moving");
    }
    void stop(){
        System.out.println("Auto is stopped");
    }
}
public class liskovSubstitutionPrinciple{

    public static void main(String[] args) {
        // write your code here
        car c=new car();
        Auto1 a=new Auto1();
        VehicleAction.vehicleActionRe(c);
        VehicleAction.vehicleAction(a);
    }
}
