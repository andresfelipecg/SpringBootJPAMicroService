package com.centennial.microservice;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	TransactionRepository transactionRepository;

// Get All Customer
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

 // Get All Books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
   
    
 // Get All Transactions
    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    
    // Get All Books availability of books
    @GetMapping("/booksAvailable")
    public List<Book> getAllBooksAvailable() {
    	
    	//Get the books available. Check the state "Check-in" of the history of a books order by datetime
    	return bookRepository.findByCheckInBooks();
    }
    
 // Get All Books lent out
    @GetMapping("/booksLentOut")
    public List<Book> getAllBooksLentOut() {
    	
    	//Get the books available. Check the state "Check-Out" of the history of a books order by datetime
    	return bookRepository.findByCheckOutBooks();
    }
    
    
    
    // Get All Books availability of books
    @GetMapping("/booksAvailableOld")
    public List<Book> getAllBooksAvailable2() {
    	
    	//Get the libraries available. Use to select to the book table
    	List<Transaction> b=transactionRepository.findByCheckInBooks();
    	
        return bookRepository.findAll( (Sort) transactionRepository.findByCheckInBooks().
        		stream().map(tb->tb.getBookid()));
    }
    
    //Post methods
    
    // Save book
    @PostMapping("/addBook")
    public void addBook(Book book) {
    	
    	bookRepository.save(book);
    }
    
    // Save book
    @PostMapping("/addTransaction")
    public void addTransaction(Transaction transaction) {
    	
    	transactionRepository.save(transaction);
    }
    
}


