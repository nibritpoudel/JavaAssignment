/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbNibriti;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nibriti Poudel
 */
public class databaseNibritiTest {
    
    public databaseNibritiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of adminlogin method, of class databaseNibriti.
     */
    @Test
    public void testAdminlogin() {
        System.out.println("adminlogin");
        String username = "";
        String password = "";
        databaseNibriti instance = new databaseNibriti();
        ResultSet expResult = null;
        ResultSet result = instance.adminlogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of studentlogin method, of class databaseNibriti.
     */
    @Test
    public void testStudentlogin() {
        System.out.println("studentlogin");
        String token = "";
        String epassword = "";
        databaseNibriti instance = new databaseNibriti();
        ResultSet expResult = null;
        ResultSet result = instance.studentlogin(token, epassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addnewToken method, of class databaseNibriti.
     */
    @Test
    public void testAddnewToken() {
        System.out.println("addnewToken");
        String token = "";
        String password = "";
        String studentname = "";
        databaseNibriti instance = new databaseNibriti();
        int expResult = 0;
        int result = instance.addnewToken(token, password, studentname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQuestion method, of class databaseNibriti.
     */
    @Test
    public void testAddQuestion() {
        System.out.println("addQuestion");
        String ques = "";
        String opt1 = "";
        String opt2 = "";
        String opt3 = "";
        String opt4 = "";
        String cor = "";
        String sub = "";
        databaseNibriti instance = new databaseNibriti();
        int expResult = 0;
        int result = instance.addQuestion(ques, opt1, opt2, opt3, opt4, cor, sub);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
