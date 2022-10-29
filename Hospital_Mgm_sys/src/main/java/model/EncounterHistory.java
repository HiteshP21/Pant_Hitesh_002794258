/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Hitesh
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory = new ArrayList<>();

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addEncounterHistory(){
        Encounter encounter = new Encounter();
        encounterHistory.add(encounter);
        return encounter;
    }
}
