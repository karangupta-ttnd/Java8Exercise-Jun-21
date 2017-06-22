package com.company;

// 6. Create a class Employee with name and age.
// Then write a program to print all those employees whose name start with n and age is greater then 24.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee2{
    
    String name;
    int age;
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public Employee2(String name, int age){
        this.name=name;
        this.age=age;
    }
}


public class Q6 {
    
    public static Predicate<Employee2> getResult() {
        return e -> e.getAge() > 24 && e.getName().endsWith("n");
    }
    
    public static List<Employee2> filterEmployees (List<Employee2> employees, Predicate<Employee2> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Employee2>toList());
    }
    
    
    public static void main(String[] args) {
        
        Employee2 obj1=new Employee2("Pavan",25);
        Employee2 obj2=new Employee2("Suman",24);
        Employee2 obj3=new Employee2("Ajay",25);
    
        List<Employee2> employees = new ArrayList<Employee2>();
        employees.addAll(Arrays.asList(new Employee2[]{obj1,obj2,obj3}));
    
        for (Employee2 e:filterEmployees(employees, getResult())) {
            System.out.println("Name :"+e.getName()+" Age :"+e.getAge());
        }
        
    }
}
