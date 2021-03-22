package com.company;

class Student1{
    String name="hari";
    boolean b=false;
    public void printDetailss(){
        System.out.println(this.name);
    }
    public void changeDetailss(String s)
    {
        this.name=s;
    }
    public void changeStatuss(boolean l) {
        this.b = true;
    }
}
class Class{
    public void printDetailsofClass(){
        System.out.println("There are 100 students");
    }
}
// Every Class has only one reason to change. Hence it follows Single Responsibility Principle.
public class singleResponsibilityPrinciple {

    public static void main(String[] args) {
        // write your code here
        Student1 stu=new Student1();
        stu.printDetailss();
    }
}
