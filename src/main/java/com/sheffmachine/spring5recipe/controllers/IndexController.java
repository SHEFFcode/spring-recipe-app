package com.sheffmachine.spring5recipe.controllers;

import com.sheffmachine.spring5recipe.domain.Category;
import com.sheffmachine.spring5recipe.domain.UnitOfMeasure;
import com.sheffmachine.spring5recipe.repositories.CategoryRepository;
import com.sheffmachine.spring5recipe.repositories.UnitOfMeasureRepository;
import com.sheffmachine.spring5recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
