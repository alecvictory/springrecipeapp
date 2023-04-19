package com.example.springrecipeapp.services;

import com.example.springrecipeapp.domain.Recipe;
import com.example.springrecipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() throws Exception{

    }

    @Test
    void getRecipes() throws Exception{

    }
}