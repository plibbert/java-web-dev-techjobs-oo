package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
        private int id;
        private static int nextId = 1;
        private String value = "Data not available";

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this();
            this.value = value;
        }

    //Custom Overrides
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
