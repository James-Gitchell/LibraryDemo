package com.example.library_demo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Campus {



    @Id
    @GeneratedValue
        private Long id;
        private String location;
        


    public Long getId() {
        return null;
    }
    
    public Collection<Book>getBooks() {
        return null;
    }

    public Campus(){
    }
    
    public Campus(String location) {
        this.location = location;
    }




}
