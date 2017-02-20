package pl.silnia.eonetworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SilniaController {
    private SilniaService todoService;

    @Autowired
    public SilniaController(SilniaService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "index.s", method = RequestMethod.GET)
    public ModelAndView printAll() {
        List<Integer> all = todoService.getAll();
        ModelAndView mav = new ModelAndView("/WEB-INF/views/list.jsp");
        mav.addObject("todoList", all);
        return mav;
    }

    @RequestMapping(value = "index.s", method = RequestMethod.POST)
    public ModelAndView licz(@RequestParam int n) {
        todoService.licz(n);
        return new ModelAndView("redirect:index.s");
    }

}
