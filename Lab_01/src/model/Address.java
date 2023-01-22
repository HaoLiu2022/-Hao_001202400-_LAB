/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haoliu
 */
public class Address {
    
    private String currentStreetName;
    private String currentAptNum;
    private String currentCityName;
    private String currentStateName;
    private String currentZipCode;
    private String permanentStreetName;
    private String permanentAptNum;
    private String permanentCityName;
    private String permanentStateName;
    private String permanentZipCode;


    public Address() {
        this.currentStreetName = "";
        this.currentAptNum = "";
        this.currentCityName = "";
        this.currentStateName = "";
        this.currentZipCode = "";
        this.permanentStreetName = "";
        this.permanentAptNum = "";
        this.permanentCityName = "";
        this.permanentStateName = "";
        this.permanentZipCode = "";        
    }

    /**
     * @return the currentStreetName
     */
    public String getCurrentStreetName() {
        return currentStreetName;
    }

    /**
     * @param currentStreetName the currentStreetName to set
     */
    public void setCurrentStreetName(String currentStreetName) {
        this.currentStreetName = currentStreetName;
    }

    /**
     * @return the currentAptNum
     */
    public String getCurrentAptNum() {
        return currentAptNum;
    }

    /**
     * @param currentAptNum the currentAptNum to set
     */
    public void setCurrentAptNum(String currentAptNum) {
        this.currentAptNum = currentAptNum;
    }

    /**
     * @return the currentCityName
     */
    public String getCurrentCityName() {
        return currentCityName;
    }

    /**
     * @param currentCityName the currentCityName to set
     */
    public void setCurrentCityName(String currentCityName) {
        this.currentCityName = currentCityName;
    }

    /**
     * @return the currentStateName
     */
    public String getCurrentStateName() {
        return currentStateName;
    }

    /**
     * @param currentStateName the currentStateName to set
     */
    public void setCurrentStateName(String currentStateName) {
        this.currentStateName = currentStateName;
    }

    /**
     * @return the currentZipCode
     */
    public String getCurrentZipCode() {
        return currentZipCode;
    }

    /**
     * @param currentZipCode the currentZipCode to set
     */
    public void setCurrentZipCode(String currentZipCode) {
        this.currentZipCode = currentZipCode;
    }

    /**
     * @return the permanentStreetName
     */
    public String getPermanentStreetName() {
        return permanentStreetName;
    }

    /**
     * @param permanentStreetName the permanentStreetName to set
     */
    public void setPermanentStreetName(String permanentStreetName) {
        this.permanentStreetName = permanentStreetName;
    }

    /**
     * @return the permanentAptNum
     */
    public String getPermanentAptNum() {
        return permanentAptNum;
    }

    /**
     * @param permanentAptNum the permanentAptNum to set
     */
    public void setPermanentAptNum(String permanentAptNum) {
        this.permanentAptNum = permanentAptNum;
    }

    /**
     * @return the permanentCityName
     */
    public String getPermanentCityName() {
        return permanentCityName;
    }

    /**
     * @param permanentCityName the permanentCityName to set
     */
    public void setPermanentCityName(String permanentCityName) {
        this.permanentCityName = permanentCityName;
    }

    /**
     * @return the permanentStateName
     */
    public String getPermanentStateName() {
        return permanentStateName;
    }

    /**
     * @param permanentStateName the permanentStateName to set
     */
    public void setPermanentStateName(String permanentStateName) {
        this.permanentStateName = permanentStateName;
    }

    /**
     * @return the permanentZipCode
     */
    public String getPermanentZipCode() {
        return permanentZipCode;
    }

    /**
     * @param permanentZipCode the permanentZipCode to set
     */
    public void setPermanentZipCode(String permanentZipCode) {
        this.permanentZipCode = permanentZipCode;
    }

}
