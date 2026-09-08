/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitaladmissionsystem;

/**
 *
 * @author emeris
 */
public class Beds {
    public String BedID;
    public int PatientID;
    public boolean IsOccupied;
    
    public Beds(String bedId){
        this.BedID = bedId;
        this.IsOccupied = false;
        this.PatientID = -1;
    }
    @Override
    public String toString(){
        return "BedID: " + this.BedID + ", Occupied: " + this.IsOccupied + ", PatientID: " + this.PatientID;
    }
    
}
