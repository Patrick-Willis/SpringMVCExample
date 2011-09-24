package test.java.springapp.service;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import main.java.springapp.service.SimpleProductManager;

public class SimpleProductManagerTests {

    private SimpleProductManager productManager;
    
    @Before
    protected void setUp() throws Exception {
        productManager = new SimpleProductManager();
    }

    @Test
    public void getProductsWithNoProducts() {
        productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }
	
}
