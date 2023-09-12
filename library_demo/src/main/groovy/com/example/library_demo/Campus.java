package com.example.library_demo;

import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Campus {

    @Id
    @GeneratedValue
    private Long id;
    private String location;

    @OneToMany(mappedBy = "campus")
    private Collection<Book> books;

    public Long getId() {
        return id;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public Campus() {
    }

    public Campus(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Campus campus = (Campus) obj;
        return Objects.equals(id, campus.id);

    }
}