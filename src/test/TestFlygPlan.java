/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 2 JUnit test
 */

package test;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Lab3Uppg02.FlygPlan;

@RunWith(Parameterized.class)
public class TestFlygPlan
{
    private FlygPlan fp;

    @Before
    public void setUp() throws Exception
    {
        fp = new FlygPlan();
    }


    @After
    public void tearDown() throws Exception
    {}
    
    @Parameterized.Parameters
    public static Collection<Object[]> testData()
    {
        return Arrays.asList(new Object[][] {
                { new int[] { 1  , 2   , 3    } , 2   }   ,
                { new int[] { 3  , 2   , 1    } , 2   }   ,
                { new int[] { 2  , 3   , 1    } , 2   }   ,
                { new int[] { 1  , 3   , 2    } , 2   }   ,
                { new int[] { 10 , 10  , 20   } , 10  }   ,
                { new int[] { 11 , 12  , 13   } , 12  }   ,
                { new int[] { 13 , 12  , 1000 } , 13  }   ,
                { new int[] { 1  , 101 , 1002 } , 101 }   ,
                { new int[] { 1  , 1   , 1    } , 1   }   ,
                { new int[] { 1  , 0   , 0    } , 0   }   ,
                { new int[] { 0  , 0   , 0    } , 0   } });
    }

    @Test
    public void testFlygPlan()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAltitude()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSetAltitude()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetHeading()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSetHeading()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetSpeed()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSetSpeed()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetIdentifier()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSetIdentifier()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testPrintInfo()
    {
        fail("Not yet implemented");
    }

}
