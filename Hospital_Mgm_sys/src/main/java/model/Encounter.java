/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Hitesh
 */
public class Encounter extends VitalSigns{
    private String issue;
    private String encdate;
    private String encdoc;
    private String encId;
    private String diagnosis;

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getEncounterID() {
        return encId;
    }

    public void setEncounterID(String encounterID) {
        this.encId = encounterID;
    }

    public String getAilment() {
        return issue;
    }

    public void setAilment(String ailment) {
        this.issue = issue;
    }

    public String getEncounterDate() {
        return encdate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encdate = encounterDate;
    }

    public String getEncounterWith() {
        return encdoc;
    }

    public void setEncounterWith(String encounterWith) {
        this.encdoc = encounterWith;
    }
}
