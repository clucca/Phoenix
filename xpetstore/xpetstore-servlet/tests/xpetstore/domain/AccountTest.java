/*
 * AccountTest.java
 * JUnit based test
 *
 * Created on September 13, 2006, 11:46 AM
 */

package xpetstore.domain;

import junit.framework.*;
import java.io.Serializable;

/**
 *
 * @author Ryan Smith
 */
public class AccountTest extends TestCase {
    
    public AccountTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AccountTest.class);
        
        return suite;
    }

    /**
     * Test of matchPassword method, of class xpetstore.domain.Account.
     */
    public void testMatchPassword() {
    }

    /**
     * Test of getPassword method, of class xpetstore.domain.Account.
     */
    public void testGetPassword() {
    }

    /**
     * Test of getUserId method, of class xpetstore.domain.Account.
     */
    public void testGetUserId() {
    }

    /**
     * Test of set method, of class xpetstore.domain.Account.
     */
    public void testSet() {
    }

    /**
     * Test of setPassword method, of class xpetstore.domain.Account.
     */
    public void testSetPassword() {
    }

    /**
     * Test of setUserId method, of class xpetstore.domain.Account.
     */
    public void testSetUserId() {
    }
    
}
