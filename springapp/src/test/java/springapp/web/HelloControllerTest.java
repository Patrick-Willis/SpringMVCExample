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
	        assertEquals("hello.jsp", modelAndView.getViewName());
	    }
	
}
