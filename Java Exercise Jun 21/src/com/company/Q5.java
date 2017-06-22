package com.company;

// 5. Write a program having interface with default
// and static methods and call them also in your main method


interface MyInterface{
    
   default void display(){
       System.out.println("This come from a default method in MyInterface");
   }
    static void showInfo(){
        System.out.println("This come from a static method in MyInterface");
    }
    
}


public class Q5 implements MyInterface{
    
    public static void main(String[] args) {
    
        Q5 obj =new Q5();
        obj.display();
        MyInterface.showInfo();
    
    }
}
