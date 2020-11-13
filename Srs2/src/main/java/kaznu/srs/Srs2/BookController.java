package kaznu.srs.Srs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import javax.validation.Valid;
import java.io.*;
import java.util.List;


@Controller
public class BookController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }
    @Autowired
    BookRepository repository;



    @GetMapping("/")
    public String showForm(Book book) {

        return "form";

    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Book book, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        repository.insertBook(book);


        return "redirect:/show";
    }
//	@RequestMapping("/results")
//	public String loopExample1(Model model) {
//		model.addAttribute("allPeople");
//		return "results";
//	}
    @GetMapping("/show")
    public String showEverything(Model model){
        model.addAttribute("all",repository.showAll());
        return "results";
    }
}
