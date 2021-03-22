package com.company;


class UsingVehicle{
    static void useVehicle(Manual c){
        c.gear();
    }
}
class Manual{
    void gear(){
        System.out.println("The Gear is manual");
    }
}
class Automatic{
    void gear(){
        System.out.println("The Gear is Automatic");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Manual c=new Manual();
        UsingVehicle.useVehicle(c);
    }
}
