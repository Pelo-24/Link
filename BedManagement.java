/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitaladmissionsystem;

/**
 *
 * @author emeris
 */
public class BedManagement {
  
   Beds[][] beds = new Beds[4][5];
  
   public BedManagement(){
       int counter = 1;
       for(int rw = 0; rw < 4; rw++){
           for (int col = 0; col < 5; col++){
           String id = String.format("B%02d", counter);
           beds[rw][col] = new Beds(id);
           counter++;
                   
       }
       
        
    }
}
  public void displayWard(){
      for (int rw = 0; rw < beds.length; rw++){
          for (int col = 0; col < 5; col++){
              System.out.print(beds[rw][col].BedID + "\t");
          }
          System.out.println();
      }
  }
}