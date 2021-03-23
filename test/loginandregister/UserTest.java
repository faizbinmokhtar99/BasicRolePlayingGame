/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandregister;

import CatsAreAwesome.User;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin-PC
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of UsernameCheck method, of class User.
     */
    @Test
    public void testUsernameCheck() {
        System.out.println("UsernameCheck");
        String name = "";
        String cat = "";
        String[] expResult = null;
        String[] result = User.UsernameCheck(name, cat);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FileCreation method, of class User.
     */
    @Test
    public void testFileCreation() {
        System.out.println("FileCreation");
        String name = "";
        int hour = 0;
        int minutes = 0;
        int seconds = 0;
        Date date = null;
        String[] expResult = null;
        String[] result = User.FileCreation(name, hour, minutes, seconds, date);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IntChange method, of class User.
     */
    @Test
    public void testIntChange() {
        System.out.println("IntChange");
        String[] data = null;
        int[] expResult = null;
        int[] result = User.IntChange(data);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FileExisting method, of class User.
     */
    @Test
    public void testFileExisting() {
        System.out.println("FileExisting");
        String name = "";
        int expResult = 0;
        int result = User.FileExisting(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FileRead method, of class User.
     */
    @Test
    public void testFileRead() {
        System.out.println("FileRead");
        String name = "";
        String[] expResult = null;
        String[] result = User.FileRead(name);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        User instance = new User();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
