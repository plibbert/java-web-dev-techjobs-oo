package org.launchcode.techjobs_oo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String toString(){
        if (this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null){
            return "Oops, this job does not seem to exist!";
        }
//        if (this.name == "" && this.employer == "Data not available" && this.location == "Data not available" && this.positionType == "Data not available" && this.coreCompetency == "Data not available"){
//            return "Oops, this job does not seem to exist!";
//        }
        if (this.name == ""){
            this.name = "Data not available";
        }
        return "\n"+ "\n" + "ID: "+ this.id + "\nName: "+ this.name+ "\nEmployer: "+ this.employer+ "\nLocation: "+ this.location+ "\nPosition Type: "+ this.positionType+ "\nCore Competency: "+ this.coreCompetency + "\n"+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
