package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField{
    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location coreCompetency = (Location) o;
        return getId() == coreCompetency.getId();
    }

}
