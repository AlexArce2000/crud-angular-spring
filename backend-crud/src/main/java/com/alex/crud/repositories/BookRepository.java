package com.alex.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.crud.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
