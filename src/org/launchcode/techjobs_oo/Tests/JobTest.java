package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private static Job jobA;
    private static Job jobB;
    private static Job jobE;
    private static Job jobY;
    private static Job newJob;


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @BeforeClass
    public static void createJob(){
     jobA = new Job();
     jobB = new Job();
     jobE = new Job("", new Employer("Tomorrow Land"), new Location(), new PositionType(), new CoreCompetency());
     jobY = new Job("potato peeler", new Employer("foodworld"), new Location ("here"), new PositionType("the help"), new CoreCompetency("vegetable peelers"));
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
        Job jobQ = new Job("Code Monkey", new Employer ("VMLY&R"), new Location("Kansas City, MO"), new PositionType("mobile app production"), new CoreCompetency("tenacity"));
        Job jobZ = new Job("Code Monkey", new Employer ("VMLY&R"), new Location("Kansas City, MO"), new PositionType("mobile app production"), new CoreCompetency("tenacity"));
        assertFalse(jobZ.equals(jobQ));
    }

    @Test
    public void testToStringBeginsAndEndsWithBlankLines(){
        assertTrue(jobE.toString().toCharArray()[0] == '\n');
        assertTrue(jobE.toString().toCharArray()[jobE.toString().length()-1] == '\n');
    }

    @Test
    public void testForLabelsForEachField(){
        assertEquals(jobY.toString(),"\n\nID: 4\nName: potato peeler\nEmployer: foodworld\nLocation: here\nPosition Type: the help\nCore Competency: vegetable peelers\n\n");
    }

    @Test
    public void testForDataNotAvailableIfEmpty(){
        assertEquals(jobE.toString(),"\n\nID: 3\nName: Data not available\nEmployer: Tomorrow Land\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n\n");
    }

    @Test
    public void testForEmptyJobExceptId(){
        Job newJobD = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        assertEquals(newJobD.toString(),"Oops, this job does not seem to exist!");
    }
    @Test
    public void testForNullJob(){
        assertEquals(jobA.toString(), "Oops, this job does not seem to exist!");
    }
}
