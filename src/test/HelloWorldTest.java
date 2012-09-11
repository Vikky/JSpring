package test;

import org.springframework.web.servlet.ModelAndView;
import com.HelloWorldController;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

    public void testHandleRequestView() throws Exception{		
        HelloWorldController controller = new HelloWorldController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
        
    }
}