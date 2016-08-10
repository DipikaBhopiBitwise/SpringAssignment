package springass1.onlineshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginControllerClass {

	    
	    @RequestMapping(value = "/Login", method = RequestMethod.GET)
	    public String init(Model model) {
	        model.addAttribute("msg", "Please Enter Your Login Details");
	      
	        return "Login";
	        
	    }
	 
	    @RequestMapping(  method = RequestMethod.POST)
	    public String submit(Model model, @ModelAttribute("User") UserDetailsClass user,BindingResult result)
	    {
	       System.out.println("submit.....");
	    	LoginValidatorClass val = new LoginValidatorClass();
	    	val.validate(user,result);
	    	if(result.hasErrors())
	    	{
	    		 model.addAttribute("error", "Please enter Details");
	                return "Login";
	    	}
            if (user.authenticate(user.getUsername(), user.getPassword())) 
            {
	              model.addAttribute("msg", "Welcome  " + user.getUsername());
	              model.addAttribute("ProductList", new ProductListClass());
	               return "redirect:/Home";
	        }
            else
	        {
	              model.addAttribute("error", "Invalid Details");
	              return "Login";
	        }
	        

	    }


}
