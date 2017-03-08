package pl.silnia.eonetworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import pl.silnia.eonetworks.SilniaRepository;
import pl.silnia.eonetworks.SilniaBD;

@Controller
public class SilniaController {

    @RequestMapping(value = "index.s")
    String index() {
        return "index";
    }

    private SilniaService silniaService;
    private SilniaRepository silniaRepository;

    @Autowired
    public SilniaController(SilniaRepository silniaRepository){this.silniaRepository = silniaRepository;}
    public SilniaController(SilniaService silniaService) {this.silniaService = silniaService;}


 //@GetMapping(path="/add") // Map ONLY GET Requests
   @RequestMapping(value = "/add", method = RequestMethod.GET)

    public @ResponseBody

    String addNewUser (@RequestParam int number, @RequestParam int score) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        SilniaBD n = new SilniaBD();
        n.setNumber(number);
        n.setScore(score);
        silniaRepository.save(n);
        return "Saved";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public @ResponseBody Iterable<SilniaBD> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return SilniaRepository.findAll();
//    }



















    @RequestMapping(value = "silnia.s", method = RequestMethod.GET)
    public ModelAndView printAll() throws ServletException, IOException{
        List<BigInteger> all = silniaService.getAll();
        ModelAndView mav = new ModelAndView("/WEB-INF/views/list.jsp");
        mav.addObject("silniaList", all);
        return mav;
    }
    @RequestMapping(value = "iterating.s", method = RequestMethod.POST)
    public ModelAndView liczIteracja(@RequestParam int n)throws ServletException, IOException {
        silniaService.liczIteracja(n);
        return new ModelAndView("redirect:silnia.s");
    }


    @RequestMapping(value = "recursion.s", method = RequestMethod.POST)
    public ModelAndView obliczSilniaRekurencja(@RequestParam int n) throws ServletException, IOException
    {

        silniaService.obliczSilniaRekurencja(n);
        if (n> 12000){

            throw new ArithmeticException("maxymalna wartość dla metody rkurencyjnej to 12000");
        }
        return new ModelAndView("redirect:silnia.s");
    }




}
