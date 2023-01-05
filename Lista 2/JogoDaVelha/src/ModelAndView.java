
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.servlet.ModelAndView;

    @RestController
    @RequestMapping(value = "/")
    public class IndexController {

    	  @RequestMapping(method = RequestMethod.GET)
    	    public ModelAndView getIndexPage() {
    	        return new ModelAndView("/index");
    	    }

    }