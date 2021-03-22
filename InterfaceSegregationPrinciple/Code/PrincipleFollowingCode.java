package com.company;

interface basic{
    public void movingg();
    public void stopping();
}

interface Advanced{
    public void reversing();
}
class Autoo implements basic{
    public void movingg(){
        System.out.println("Autoo is moving");
    }
    public void stopping(){
        System.out.println("Autoo is stopped");
    }
}
//Here class Autoo can implements the interface it requires instead of implementing all the methods in the interface.
class Car implements Advanced,basic{
    public void movingg(){System.out.println("Car is moving");}
    public void stopping(){System.out.println("Car is stopped");}
    public void reversing(){System.out.println("Car is reversing");}
}
public class interfaceSegregationPrinciple {

    public static void main(String[] args) {
        // write your code here
        Autoo auto=new Autoo();
        auto.movingg();

    }
}
