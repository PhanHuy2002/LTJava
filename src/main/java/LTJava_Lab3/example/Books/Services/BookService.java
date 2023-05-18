package LTJava_Lab3.example.Books.Services;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LTJava_Lab3.example.Books.Models.Book;
import LTJava_Lab3.example.Books.Repositories.BookRepository;
@Service
@Transactional
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> listAll(){
		return bookRepository.findAll();
	}
	public void save(Book product) {
		bookRepository.save(product);
	}
	public Book get(long id) {
		return bookRepository.findById(id).get();
	}
	public void delete(long id) {
		bookRepository.deleteById(id);
	}
	
}
