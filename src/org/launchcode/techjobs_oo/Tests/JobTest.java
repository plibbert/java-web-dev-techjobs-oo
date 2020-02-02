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
    Job jobE;

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Before
    public void createJob(){
     jobA = new Job();
     jobB = new Job();
     jobE = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
    }
    @Test
    public void testSettingJobId(){

        assertFalse(jobA.equals(jobB));
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
        assertFalse(jobZ.equals(jobQ));
    }

    @Test
    public void testToStringBeginsAndEndsWithBlankLines(){
        assertTrue(jobE.toString().toCharArray()[0] == '\n');
        assertTrue(jobE.toString().toCharArray()[jobE.toString().length()-1] == '\n');
    }

    @Test
    public void testForLabelsForEachField(){
        assertEquals(jobA.toString(),"\n\nID: 16\nName: null\nEmployer: null\nLocation: null\nPosition Type: null\nCore Competency: null\n\n");
    }

    @Test
    public void testForDataNotAvailableIfEmpty(){
        assertEquals(jobE.toString(),"\n\nID: 11\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n\n");
    }
}
