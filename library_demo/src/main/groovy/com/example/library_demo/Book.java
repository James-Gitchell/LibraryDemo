package com.example.library_demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

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

    public Book() {

    }

    public Book(String title, String description, Campus campus, Author...authors) {
        this.title = title;
        this.description = description;
        this.campus = campus;
        this.authors = new ArrayList<>(Arrays.asList(authors));

    }

    @Override
    public int hashCode() {
     return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
      return Objects.equals(id, book.id);
    }

}
