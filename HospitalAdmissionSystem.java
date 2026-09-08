/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitaladmissionsystem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class HospitalAdmissionSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Patients> patientlist = new ArrayList<>();
        BedManagement wardBeds = new BedManagement();
        Reports report = new Reports();
        
        int choice;
        do {
            System.out.println("\n--- Hospital Admission System ---");
            System.out.println("1. Register for a new patient");
            System.out.println("2. Search for patient");
            System.out.println("3. Update patient details");
            System.out.println("4. Delete patient");
            System.out.println("5. Display all patients");
            System.out.println("6. Display ward layout");
            System.out.println("7. Allocate a bed");
            System.out.println("8. Release bed");
            System.out.println("9. View Reports");
            System.out.println("10. Exit");
            choice = Integer.parseInt(input.nextLine());
            
            switch (choice){
                case 1:
                    // register logic 
                    break;
                case 2:
                    // seearch logic 
                    break;
                case 3:
                    //update logic 
                    break;
                case 4:
                    // delete logic
                    break;
                case 5:
                    report.displayAllPatients(patientlist);
                    break;
                case 6:
                    wardBeds.displayWard();
                    break;
                case 7:
                    //allocate bed
                    break;
                case 8:
                    // release bed
                    break;
                case 9:
                    // call reports method
                    break;
                case 10:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    
                    
            
        }
        } while (choice != 10);
    }
}
