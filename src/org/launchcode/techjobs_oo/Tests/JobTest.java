package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobA;
    Job jobB;
    Job newJob;
    Job jobQ;
    Job jobZ;

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Before
    public void createJob(){
     jobA = new Job();
     jobB = new Job();
    }
    @Test
    public void testSettingJobId(){

        assertTrue(jobA.equals(jobB));
    }

    @Test
    public void testJobConstructorSetsAllFields(){
       newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(newJob.getEmployer().getValue(), "ACME");
        assertEquals(newJob.getName(), "Product tester");
        assertEquals(newJob.getLocation().getValue(), "Desert");
        assertEquals(newJob.getPositionType().getValue(), "Quality control");
        assertEquals(newJob.getCoreCompetency().getValue(), "Persistence");
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        jobQ = new Job("Code Monkey", new Employer ("VMLY&R"), new Location("Kansas City, MO"), new PositionType("mobile app production"), new CoreCompetency("tenacity"));
        jobZ = new Job("Code Monkey", new Employer ("VMLY&R"), new Location("Kansas City, MO"), new PositionType("mobile app production"), new CoreCompetency("tenacity"));
        assertTrue(jobZ.equals(jobQ));
    }
}
