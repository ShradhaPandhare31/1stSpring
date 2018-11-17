package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
		@Override	
		public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response)
		{
			System.out.println("test1");
			ModelAndView mv=new ModelAndView("Page1");
			System.out.println("test2");
			mv.addObject("name", "Vijay");
			mv.addObject("address", "Mumbai");
			System.out.println("test3");
			return mv;

		}
	
	
}



