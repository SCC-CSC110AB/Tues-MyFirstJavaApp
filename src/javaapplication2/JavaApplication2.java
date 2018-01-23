/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author john
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myFirstInt = 5;
        int mySecondInt = 16;
        int myThirdInt = 1;
        
        float myFirstFloat;
                
        myFirstInt =  mySecondInt / myFirstInt;
        System.out.println(myFirstInt);
        
        myFirstInt = 5;
        myFirstFloat = mySecondInt / 5F;
        System.out.println(myFirstFloat);
        
        myFirstInt = (int)myFirstFloat;
        
        System.out.println(myFirstInt);
        
        boolean isTeacherAJerk = true;
        
        System.out.println(isTeacherAJerk);
        
        char aChar = 'a';
        
        System.out.println(aChar);
        
        char bChar = 'b';
        char cChar = 'c';
        
        System.out.println(aChar + bChar + cChar);
        
        // PLEASE GOD DON'T DO THIS For example only.
        System.out.println("" + aChar + bChar + cChar);
        
        // mySecondInt == 16 & myFirstInt == 5
        int remainder = mySecondInt % myFirstInt;
        
        System.out.println(remainder);
    }
    
}
