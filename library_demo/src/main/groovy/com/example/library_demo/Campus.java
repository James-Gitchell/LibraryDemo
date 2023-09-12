package com.example.library_demo;

import java.util.Collection;

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
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Campus other = (Campus) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
