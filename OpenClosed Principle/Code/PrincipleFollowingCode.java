package com.company;
interface Area{
    public int areacalculation();
}
class Rectangles implements Area{
    int length;
    int breath;
    Rectangles(int l,int b)
    {
        this.length=l;
        this.breath=b;
    }
    public int areacalculation(){
        return this.length*this.breath;
    }
}
class Circles implements Area{
    int radius;
    Circles(int r)
    {
        this.radius=r;
    }
    public int areacalculation(){
        return (22/7)*(this.radius)*(this.radius);
    }
}
class Triangle implements Area{
    int base;
    int height;
    Triangle(int b,int h)
    {
        this.base=b;
        this.height=h;
    }
    public int areacalculation(){
        return (this.base*this.height)/2;
    }
}
class openForExtentionAndClosedForModification {

    public static void main(String[] args) {
        // write your code here
        Triangle t=new Triangle(10,20);
        int ot=t.areacalculation();
        System.out.println(ot);
    }
    //Here if You need to add new shape then You can implement the Area interface and find Area hence it Follows Open for Extention And Closed For Modification Principle.
}
