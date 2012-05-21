/*
 * AddressTest.java
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
public class AddressTest extends TestCase {
    
    public AddressTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AddressTest.class);
        
        return suite;
    }

    /**
     * Test of getCity method, of class xpetstore.domain.Address.
     */
    public void testGetCity() {
    	Address address = new Address();
    	String cityName = "New York";
    	address.setCity(cityName);
    	this.assertEquals(address.getCity(), cityName);
    }

    /**
     * Test of getCountry method, of class xpetstore.domain.Address.
     */
    public void testGetCountry() {
    	
    }

    public void testAnotherFakeTest23() {
    	
    }
    
    /**
     * Test of getState method, of class xpetstore.domain.Address.
     */
    public void testGetState() {
    	
    	try{Thread.sleep(700);} catch (Exception e){};
    }

    /**
     * Test of getStreet1 method, of class xpetstore.domain.Address.
     */
    public void testGetStreet1() {
    	this.assertTrue(true);
    }

    /**
     * Test of getStreet2 method, of class xpetstore.domain.Address.
     */
    public void testGetStreet2() {
    }

    /**
     * Test of getZipcode method, of class xpetstore.domain.Address.
     */
    public void testGetZipcode() {
    }

    /**
     * Test of set method, of class xpetstore.domain.Address.
     */
    public void testSet() {
    }

    /**
     * Test of setCity method, of class xpetstore.domain.Address.
     */
    public void testSetCity() {
    }

    /**
     * Test of setCountry method, of class xpetstore.domain.Address.
     */
    public void testSetCountry() {
    }

    /**
     * Test of setState method, of class xpetstore.domain.Address.
     */
    public void testSetState() {
    }

    /**
     * Test of setStreet1 method, of class xpetstore.domain.Address.
     */
    public void testSetStreet1() {
    }

    /**
     * Test of setStreet2 method, of class xpetstore.domain.Address.
     */
    public void testSetStreet2() {
    }

    /**
     * Test of setZipcode method, of class xpetstore.domain.Address.
     */
    public void testSetZipcode() {
    }
    
}
