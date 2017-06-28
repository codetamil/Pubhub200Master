package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByOrderByPriceDesc();
	
	List<Book> findByOrderByPriceAsc();
/*
	@Query(name = "SELECT fn_get_order_amount(?1)", nativeQuery = true)
	public Integer findByPrice(Long orderId);*/

	List<Book> findByOrderByReleasedDateDesc();
	
	
	
	
}
