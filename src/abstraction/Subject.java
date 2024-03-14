package abstraction;

//Java Program to implement Abstract Class
//having constructor, data member, and methods
import java.io.*;

abstract class Subject {
 Subject() { 
   System.out.println("Learning Subject"); 
 }

   abstract void syllabus();

   void learn(){
       System.out.println("Preparing Right Now!");
 }
}