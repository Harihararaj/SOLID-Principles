package com.company;

class Student{
    String name;
    boolean b=true;
    Student(String name)
    {
        this.name=name;
    }
    public void printDetails(){
        System.out.println(this.name);
    }
    
    public void changeDetails(String s)
    {
        this.name=s;
    }
    
    public void changeStatus(boolean l)
    {
        this.b=l;
    }
    
    public void printDetailsofClass(){
        System.out.println("There are 100 students");
    }
	//This Particular Class called Students has two reason to change. Hence it doesnot follows the Single Responsibility Principle.
}
public class notFollowingSingleResponsibilityPrinciple {

    public static void main(String[] args) {
	// write your code here
        Student stu=new Student("Hari");
        stu.printDetails();
    }
}
