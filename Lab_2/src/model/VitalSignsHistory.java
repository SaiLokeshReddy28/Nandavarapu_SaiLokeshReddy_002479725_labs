/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sailokeshreddynandavarapu
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns> history;
    
    //Constructor to create a new ArrayList of Vitals for Vital Signs Historty
    public VitalSignsHistory(){
    history = new ArrayList<VitalSigns>();
    }
    
    //method to add new Vital
    public VitalSigns addNewVitals(){
        VitalSigns newVs = new VitalSigns();
        history.add(newVs);
        return newVs;
    }
    
    //method to remove a Vital Sign
    public void removeVitals(VitalSigns vs){
        history.remove(vs);
    }
    
    //returns the whole list to display the data 
    public ArrayList<VitalSigns> getHistory(){
        return history;
    }
}
