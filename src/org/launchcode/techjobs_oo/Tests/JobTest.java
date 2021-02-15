package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTest {

    @Test
    public void testSettingJobId(){
        //Arrange
        Job job = new Job();
        Job job2 = new Job();

        //Act

        //Assert

        Assert.assertEquals(job.getId(), job2.getId(), 1);

        //Verify

    }

    @Test
    public void testJobConstructorSetsAllFields(){

        //Arrange
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Act

        //Assert

        Assert.assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
        Assert.assertEquals(testJob.getName(), "Product Tester");
        Assert.assertEquals(testJob.getEmployer().getValue(), "ACME");
        Assert.assertEquals(testJob.getLocation().getValue(), "Desert");
        Assert.assertEquals(testJob.getPositionType().getValue(), "Quality control");

        //Verify

    }

    @Test
    public void testJobsForEquality(){
        //Arrange
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Act

        //Assert

        Assert.assertFalse(job.equals(job2));

        //Verify

    }

    @Test
    public void testJobToString(){

        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals(job.toString(),
                "\nID: " + job.getId() +
                        "\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence"

                );

    }

    @Test
    public void testJobToString_ScenarioB(){

        Job job = new Job("Product Tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals(job.toString(),
                "\nID: " + job.getId() +
                        "\nName: Product Tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence"

        );

    }
}
