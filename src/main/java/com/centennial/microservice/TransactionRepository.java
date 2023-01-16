package com.centennial.microservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{
	@Query(value = "SELECT * FROM transaction WHERE trxntype = 'Check-in'", nativeQuery = true)
    List<Transaction> findByCheckInBooks();
	
}