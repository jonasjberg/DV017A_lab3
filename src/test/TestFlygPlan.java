/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 2 JUnit test
 */

/* TODO: Skriv klart koden */

package test;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import Lab3Uppg02.FlygPlan;
import Lab3Uppg02.Flygriktning;

@RunWith(Parameterized.class)
public class TestFlygPlan
{
    private int          ALTITUDE;
    private Flygriktning HEADING_ENUM;
    private int          HEADING_INT;
    private int          SPEED;
    private String       ID;

    private FlygPlan     fp1;
    private FlygPlan     fp2;

    @Before
    public void setUp() throws Exception
    {
//        fp1 = new FlygPlan(TEST_ALTITUDE, TEST_HEADING_ENUM, TEST_SPEED,
//                TEST_ID);
//        fp2 = new FlygPlan(TEST_ALTITUDE, TEST_HEADING_INT, TEST_SPEED,
//                TEST_ID);
        fp1 = new FlygPlan(ALTITUDE, HEADING_ENUM, SPEED, ID);
        fp2 = new FlygPlan(ALTITUDE, HEADING_INT, SPEED, ID);
    }

    @After
    public void tearDown() throws Exception
    {
        fp1 = null;
        fp2 = null;
    }

    /* TestFlygPlan konstruktor */
    public TestFlygPlan(int ALTITUDE, Flygriktning HEADING_ENUM,
            int HEADING_INT, int SPEED, String ID) {
        ALTITUDE = this.ALTITUDE;
        HEADING_ENUM = this.HEADING_ENUM;
        HEADING_INT = this.HEADING_INT;
        SPEED = this.SPEED;
        ID = this.ID;
        
        System.out.println("ALTITUDE: " + ALTITUDE);
        System.out.println("HEADING_ENUM: " + HEADING_ENUM);
        System.out.println("_HEADING_INT: " + HEADING_INT);
        System.out.println("SPEED" + SPEED);
        System.out.println("ID: " + ID);
    }

    /* Parameteriserad test data */
    @Parameterized.Parameters
    public static Collection<Object[]> testData()
    {
        return Arrays.asList(new Object[][] {
        /* höjd, flygriktning (enum), flygriktning (int) hastighet, modellbeteckning */
        { 100, Flygriktning.STOPPED, 0, 100, "abc" },
        { 10, Flygriktning.EAST, 2, 100, "abc" },
        { 1, Flygriktning.NORTH, 1, 100, "abc" },
        { 0, Flygriktning.SOUTH, 3, 100, "bla" } });
    }

    /* JUnit testcases */
    @Test
    public void testFlygPlan()
    {
        assertNotNull(fp1);
        assertNotNull(fp2);
    }

    @Test
    public void testGetAltitude()
    {
        int expected = TEST_ALTITUDE;
        int actual = fp1.getAltitude();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAltitude()
    {
        int expected = TEST_ALTITUDE;
        fp1.setAltitude(TEST_ALTITUDE);
        int actual = fp1.getAltitude();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetHeadingAsEnum()
    {
        Flygriktning expected = TEST_HEADING_ENUM;
        Flygriktning actual = fp1.getHeading();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetHeadingAsInt()
    {
        int expected = TEST_HEADING_INT;
        System.out.println("expected heading: " + expected);
        int actual = fp1.getHeading().ordinal();
        System.out.println("actual heading: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetHeadingWithEnum()
    {
        Flygriktning expected = TEST_HEADING_ENUM;
        fp1.setHeading(TEST_HEADING_ENUM);
        Flygriktning actual = fp1.getHeading();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSpeed()
    {
        int expected = TEST_SPEED;
        int actual = fp1.getSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSpeed()
    {
        int expected = TEST_SPEED;
        fp1.setSpeed(TEST_SPEED);
        int actual = fp1.getSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetIdentifier()
    {
        String expected = TEST_ID;
        String actual = fp1.getIdentifier();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetIdentifier()
    {
        String expected = TEST_ID;
        fp1.setIdentifier(TEST_ID);
        String actual = fp1.getIdentifier();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintInfo()
    {
        fail("Not yet implemented");
    }

}
