package kaznu.srs.Srs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import javax.validation.Valid;



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
        //toCreate a table
        //repository.createTable();
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

    @GetMapping("/show")
    public String showEverything(Model model){
        model.addAttribute("all",repository.showAll());
        return "results";
    }
}
