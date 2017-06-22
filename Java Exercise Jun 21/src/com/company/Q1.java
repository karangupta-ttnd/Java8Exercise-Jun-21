package com.company;

//1. Write a program to copy and paste a file to other location

import java.io.*;

public class Q1 {
    
    public static void main(String[] args) {
        
        try{
            
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/karan Pc/IdeaProjects/Java Exercise Jun 20/src/com/company/file1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/karan Pc/IdeaProjects/Java Exercise Jun 20/src/com/file1.txt"));
            int i;
            
            do{
                i=br.read();
                bw.write((char)i);
            }while (i!=-1);
            
            br.close();
            bw.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
    }
    
    
}

