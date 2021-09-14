package com.mycompany.CSC229_Lab1;
import java.util.Scanner;

 public class Course {
    int ID, Code;
    String Name;

//Default Constructor 
    public Course() {
    }
    
//Overloaded Constructor for changing member variables 
    public Course(int ID, int Code, String Name) {
        this.ID = ID;
        this.Code = Code;
        this.Name = Name;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
      
   public static void main(String args[]){
       
//Instantiating Course class and assigning default values for members
        Course Course1;
        Course1 = new Course(00,0000,"Default");
       
//Collecting user input for "Code" member variable
        
        System.out.print("Input user's Code #");
        Scanner Codescnr = new Scanner(System.in);
        Course1.setCode(Codescnr.nextInt());
        
//Collecting user input for "ID" member variable        
        System.out.print("Input user's ID #");
        Scanner IDscnr = new Scanner(System.in);
        Course1.setID(IDscnr.nextInt());
        
//Collecting user input for "Name" member variable
        System.out.print("Input user's Name");
        Scanner Namescnr = new Scanner(System.in);
        Course1.setName(Namescnr.nextLine());
        
//Outputting user input for all member variables        
        System.out.println("Users Code # is " + Course1.getCode());
        System.out.println("Users ID is " + Course1.getID());
        System.out.println("Users Name is " + Course1.getName());
  
    }
    
}
