package com.globallogic.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.book.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
	
	public Book findByName(String name);
	
	
	public List<Book> findByAuthor(String name);
	

}
