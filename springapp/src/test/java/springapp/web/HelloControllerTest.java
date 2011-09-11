package test.java.springapp.web;

import static org.junit.Assert.*;
import main.java.springapp.web.HelloController;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTest {

	  @Test
	  public void testHandleRequestView() throws Exception{		
	        HelloController controller = new HelloController();
	        ModelAndView modelAndView = controller.handleRequest(null, null);		
	        assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        String nowValue = (String) modelAndView.getModel().get("now");
	        assertNotNull(nowValue);
	    }
	
}
