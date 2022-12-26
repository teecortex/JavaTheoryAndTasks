package com.company.professions;

public class Driver {
    private String snp;
    private int experience;
    public void setSnp(String snp) {this.snp = snp;}
    public void setExperience(int experience) {this.experience = experience;}
    public String getSnp() {return snp;}
    public int getExperience() {return experience;}
    public Driver(String snp, int experience){
        this.snp = snp;
        this.experience = experience;
    }
    public Driver(){
        this.snp = "";
        this.experience = 0;
    }
    public Driver(Driver driver){
        this.snp = driver.getSnp();
        this.experience = driver.getExperience();
    }
}
