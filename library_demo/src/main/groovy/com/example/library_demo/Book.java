package com.example.library_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    private Campus campus;
    @ManyToMany
    private Collection<Author> authors;

        
    public Long getId() {
        return id;

    }
public Book(){

}
    public Book(String title, String description, Campus campus, Author ...authors) {
        this.title = title;
        this.description = description;
        this.campus=campus;
        this.authors=new ArrayList<>(Arrays.asList(authors));

    }




}
