package com.company;

// 2. Write a program to serialize a class Employee with property name and then deserialize it

import java.io.*;

class Employee  implements Serializable {
    
    String name,empid;
    int salary;
    
    public String getName() {
        return name;
    }
    
    public Employee setName(String name) {
        this.name = name;
        return this;
    }
    
    public String getEmpid() {
        return empid;
    }
    
    public Employee setEmpid(String empid) {
        this.empid = empid;
        return this;
    
    }
    
    public int getSalary() {
        return salary;
    }
    
    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    
    }
}

public class Q2 {
    
    public static void main(String[] args) {
    
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        
        emp1.setEmpid("EMP01").setName("Ashutosh").setSalary(100000);
        emp2.setEmpid("EMP02").setName("Puskar").setSalary(100000);
    
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.ser"));
            oos.writeObject(emp1);
            oos.writeObject(emp2);
            oos.close();
            
            System.out.println("Objects Serialized Succesfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Objects Serialized Faulty");
        }
    
    
        try {
            
            ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("Employee.ser"));
            emp1 = (Employee)ois.readObject();
            emp2 = (Employee)ois.readObject();
            ois.close();
    
            System.out.println("\nObjects Deserialized Succesfully \n The result is:");
            System.out.println("\n"+emp1.getEmpid()+""+emp1.getName()+""+emp1.getSalary());
            System.out.println("\n"+emp2.getEmpid()+""+emp2.getName()+""+emp2.getSalary());
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Objects Serialized Faulty");
        }
    
    }
}
