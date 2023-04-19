package com.example.springrecipeapp.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = "recipe")
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure){
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe){
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
        this.recipe = recipe;
    }

    public Ingredient() {

    }

}
