package com.sheffmachine.spring5recipe.domain;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;
}
