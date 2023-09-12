package com.example.library_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


@DataJpaTest 
public class JPAWiringTest {
    

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void campusShouldHaveAListOfBook(){
        Campus testCampus = new Campus("Test Location");
        Author testAuthor = new Author("Test firstName", "Test lastName");
        Book   testBook = new Book("Title" ,"Description", testCampus, testAuthor1);
   
    }

}
