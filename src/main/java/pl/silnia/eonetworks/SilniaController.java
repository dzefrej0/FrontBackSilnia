package pl.silnia.eonetworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class SilniaController {

    @RequestMapping(value = "index.s")
    String index() {
        return "index";
    }

    private SilniaService silniaService;

    @Autowired
    public SilniaController(SilniaService silniaService) {
        this.silniaService = silniaService;
    }

    @RequestMapping(value = "index.s", method = RequestMethod.GET)
    public ModelAndView printAll() {
        List<Integer> all = silniaService.getAll();
        ModelAndView mav = new ModelAndView("/WEB-INF/views/list.jsp");
        mav.addObject("silniaList", all);
        return mav;
    }

    @RequestMapping(value = "index.s", method = RequestMethod.POST)
    public ModelAndView licz(@RequestParam int n) {
        silniaService.licz(n);
        return new ModelAndView("redirect:index.s");
    }

}
