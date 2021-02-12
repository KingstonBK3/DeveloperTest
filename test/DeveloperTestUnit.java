/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import developer.Developer;
import developer.DeveloperLogic;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class DeveloperTestUnit {
    
    public DeveloperTestUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    
    @Test
    public void developerAnnualSalary() {
        Developer dev = new Developer("Andrei", "Andreevich", "Developer", 2500);
        DeveloperLogic devlogic = new DeveloperLogic();
        double finalResult = devlogic.calculateAnnualSalary(dev);
        System.out.println(dev.getFirsName()+dev.getLastName()+finalResult+ " Annual salary");
    }
    
    public void developerHourRate() {
        Developer dev = new Developer("Maksim", "Ivanov", "Manager", 1500);
        DeveloperLogic devlogic = new DeveloperLogic();
        double finalResult = devlogic.calculateHourRate(dev);
        System.out.println(dev.getFirsName()+dev.getLastName()+finalResult+ " Hour rate");
    }
}
