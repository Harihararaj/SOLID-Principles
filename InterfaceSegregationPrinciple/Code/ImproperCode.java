  
package com.company;
interface Vehicle{
    public void moving();
    public void stop();
    public void reverse();
}
class Auto implements Vehicle{
    public void moving(){

        System.out.println("Auto is moving");
    }
    public void stop(){

        System.out.println("Auto is stopped");
    }
    public void reverse()//Here we donot need reverse method, Since we used a single interface We are Forced to implement reverse method
    {                    // Hence violates Interface Segregation Function
        System.out.println("Auto is reverse");
    }
}

public class notFollowingInterfaceSegregationPrinciple {

    public static void main(String[] args) {
	// write your code here
        Auto auto=new Auto();
        auto.moving();

    }
}
