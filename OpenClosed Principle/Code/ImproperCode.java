package com.company;

class Rectangle{
    int length;
    int breath;
    Rectangle(int l,int b)
    {
        this.length=l;
        this.breath=b;
    }
}
class Circle{
    int radius;
    Circle(int r)
    {
        this.radius=r;
    }
}
class AreaCalculation{
    public static int rectArea(Rectangle r)
    {
        return r.length * r.breath;
    }
    public static int circleArea(Circle c)
    {
        return (22/7)*(c.radius)*(c.radius);
    }

    //If We need to add new shape's area calculation You need to modify the Above class Which violates the Open/closed modification Principle.
}
public class notFollowingOpenForExtentionAndClosedForModification {

    public static void main(String[] args) {
	// write your code here
        Rectangle r=new Rectangle(10,20);
        int out=AreaCalculation.rectArea(r);
        System.out.println(out);
    }
}
