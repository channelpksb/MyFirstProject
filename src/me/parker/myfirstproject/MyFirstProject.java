/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.parker.myfirstproject;

/**
 *
 * @author sweepark484
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("hellobeal");
        
        
      int number = 5;
      int number2 = 4;
       
      System.out.println("addition: " + AddMe(number, number2));
      System.out.println("subtraction: " + (number - number2));
      System.out.println("multiplication: " + (number * number2));
      System.out.println("division: " + (number / number2));
      System.out.println("exponentation: " + Math.pow(number , number2));
      System.out.println("magic: " + (number % number2));
      
      if (IsEvenNumber(8200)) {
          System.out.println("That number is even");
      }
    }

    public static Integer AddMe(int number, int number2){
        return number + number2;
    }   //
    
    public static Boolean IsEvenNumber(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return (number % 2 == 0);
    }
}

      
      
          
          
    
