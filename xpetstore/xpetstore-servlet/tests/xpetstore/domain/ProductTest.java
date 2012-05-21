/*
 * ProductTest.java
 * JUnit based test
 *
 * Created on September 13, 2006, 11:46 AM
 */

package xpetstore.domain;

import junit.framework.*;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Ryan Smith
 */
public class ProductTest extends TestCase {
    
    public ProductTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ProductTest.class);
        
        return suite;
    }

    /**
     * Test of getDescription method, of class xpetstore.domain.Product.
     */
    public void testGetDescription() {
    }

    /**
     * Test of getItems method, of class xpetstore.domain.Product.
     */
    public void testGetItems() {
    }

    /**
     * Test of getName method, of class xpetstore.domain.Product.
     */
    public void testGetName() {
    }

    /**
     * Test of getProductId method, of class xpetstore.domain.Product.
     */
    public void testGetProductId() {
    }

    /**
     * Test of setDescription method, of class xpetstore.domain.Product.
     */
    public void testSetDescription() {
    }

    /**
     * Test of setItems method, of class xpetstore.domain.Product.
     */
    public void testSetItems() {
    }

    /**
     * Test of setName method, of class xpetstore.domain.Product.
     */
    public void testSetName() {
    }

    /**
     * Test of setProductId method, of class xpetstore.domain.Product.
     */
    public void testSetProductId() {
    }
    
}
