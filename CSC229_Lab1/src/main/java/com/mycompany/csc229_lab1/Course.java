package com.mycompany.CSC229_Lab1;
import java.util.Scanner;

public class Course {

  //Overloaded Constructor for changing member variables 
    public Course(int ID, int Code, String Name) {
        this.ID = ID;
        this.Code = Code;
        this.Name = Name;
    }

  //Default Constructor 
    public Course() {
    }
    
    
    int ID, Code;
    String Name;

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
        
        Course Course1;
        
        
        
    }

    
}