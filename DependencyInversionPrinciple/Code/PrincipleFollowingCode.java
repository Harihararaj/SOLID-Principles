package com.company;

class UseVehicle1{
    static void useVehicle(Vehicle com){
         com.gear();
    }
}
interface Vehicle{
    void gear();
}
class Manualcar1 implements Vehicle{
    public void gear(){
        System.out.println("Gear is Manual");
    }
}
class Automatic implements Vehicle{
    public void gear(){
        System.out.println("Gear is Automatic");
    }
}


class FollowingDepencyPrinciple {

    public static void main(String[] args) {
        // write your code here
        Automatic c1=new Automatic();
        Manualcar1 m=new Manualcar1();
        UseVehicle1.useVehicle(m);
    }
}
