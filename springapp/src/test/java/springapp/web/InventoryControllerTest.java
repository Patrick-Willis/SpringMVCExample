package test.java.springapp.web;

import static org.junit.Assert.*;

import java.util.Map;

import main.java.springapp.service.SimpleProductManager;
import main.java.springapp.web.InventoryController;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class InventoryControllerTest {

	  @Test
	  public void testHandleRequestView() throws Exception{		
	        InventoryController controller = new InventoryController();
	        controller.setProductManager(new SimpleProductManager());
	        ModelAndView modelAndView = controller.handleRequest(null, null);
	        assertEquals("hello", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        Map modelMap = (Map) modelAndView.getModel().get("model");
	        String nowValue = (String) modelMap.get("now");
	        assertNotNull(nowValue);
	    }
	
}
