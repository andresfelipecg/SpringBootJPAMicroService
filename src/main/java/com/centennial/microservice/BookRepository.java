package com.centennial.microservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.centennial.microservice.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{
	
	@Query(value = "SELECT * FROM transaction WHERE trxntype = 'Check-in'", nativeQuery = true)
    List<Book> findByCheckInBooks2();
	
	@Query(value = "SELECT a.*\r\n"
			+ "FROM book AS a\r\n"
			+ "INNER JOIN transaction AS b ON a.bookid = b.bookid\r\n"
			+ "WHERE b.trxntype = 'Check-in' AND b.trxndate = (SELECT MAX(trxndate) FROM transaction WHERE bookid = b.bookid)\r\n"
			+ "GROUP BY a.title;", nativeQuery = true)
    List<Book> findByCheckInBooks();
	
	@Query(value = "SELECT a.*\r\n"
			+ "FROM book AS a\r\n"
			+ "INNER JOIN transaction AS b ON a.bookid = b.bookid\r\n"
			+ "WHERE b.trxntype = 'Check-out' AND b.trxndate = (SELECT MAX(trxndate) FROM transaction WHERE bookid = b.bookid)\r\n"
			+ "GROUP BY a.title;", nativeQuery = true)
    List<Book> findByCheckOutBooks();
	
}