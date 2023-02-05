/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author haoliu
 */
public class MedicineCatalog {
    
    private ArrayList<Medicine> medicineList;
    
    public MedicineCatalog() {
        this.medicineList = new ArrayList<Medicine>();
    }

    /**
     * @return the medicineList
     */
    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    /**
     * @param medicineList the medicineList to set
     */
    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage) {
        Medicine medicine = new Medicine();
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineList.add(medicine);
        
        return medicine;
    }
    
    public Boolean checkIfMedicineUnique(String name) {
        for (Medicine med : this.medicineList) {
            if (med.getMedicineName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public void removeMedicine(String name) {
         
         for(Medicine med: this.medicineList) {
             if(med.getMedicineName().equals(name)) {
                 this.medicineList.remove(med);
                 break;
             }
         }
    }
    
    
}
