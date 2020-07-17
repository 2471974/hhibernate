package guru.spring.hibernate.controllers;

import guru.spring.hibernate.models.Category;
import guru.spring.hibernate.models.UnitOfMeasure;
import guru.spring.hibernate.repositories.CategoryRepository;
import guru.spring.hibernate.repositories.UnitOfMeasureRepository;
import guru.spring.hibernate.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }


/*
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category ID is: " + categoryOptional.get().getId());
        System.out.println("Unit Of Measure ID is: " + unitOfMeasureOptional.get().getId());

        Optional<Category> categoryOptional2 = categoryRepository.findById(2L);
        Optional<UnitOfMeasure> unitOfMeasureOptional2 = unitOfMeasureRepository.findById(2L);

        System.out.println("Category ID is: " + categoryOptional2.get().getDescription());
        System.out.println("Unit Of Measure ID is: " + unitOfMeasureOptional2.get().getDescription());

        return "index";
    }
*/
}
