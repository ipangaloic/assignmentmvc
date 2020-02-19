package controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class AssignmentController {
	@RequestMapping("/hello1")  
	    public String display()  
	    {  
	        return "viewpage1";  
	    }     
}
