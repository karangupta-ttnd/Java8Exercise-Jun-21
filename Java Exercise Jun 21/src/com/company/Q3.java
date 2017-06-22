package com.company;

// 3. Write a program to read all field and method names of a class using reflection

import java.lang.Class;
import java.util.Arrays;


class MyDemoClass{
    
    private int myVar1;
    private String myVar2;
    
    private void displayInfo(int a,String b){
        System.out.println("Data is:"+myVar1+" "+myVar2);
    }
    
    public MyDemoClass(int var1,String var2){
        myVar1=var1;
        myVar2=var2;
    }
    
}

public class Q3 {
    
    public static void main(String[] args) {
    
        MyDemoClass obj=new MyDemoClass(7,"TestData");
    
        Class c=obj.getClass();
    
        System.out.println("Class name is: "+c.getSimpleName());
        System.out.println("Class fields are: "+Arrays.toString(c.getDeclaredFields()));
        System.out.println("Class methods are: "+Arrays.toString(c.getDeclaredMethods()));
        System.out.println("Class special methods are: "+Arrays.toString(c.getDeclaredConstructors()));
        
    }
}
