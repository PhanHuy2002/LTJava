package LTJava_Lab3.example.Books.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import LTJava_Lab3.example.Books.Models.Book;
import LTJava_Lab3.example.Books.Services.BookService;
import LTJava_Lab3.example.Books.Services.CategoryService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService service;
	@GetMapping
	public String viewAllBook(Model model) {
		List<Book> listBook = service.listAll();
		model.addAttribute("books",listBook);
		return "book/index";
	}
	@Autowired
	private CategoryService categoryService;
	@GetMapping
	public String showNewBookPage(Model model) {
		Book book = new Book();
		return "book/new_book";
	}
	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book")Book book) {
		service.save(book);
		return "redirect:/books";
	}
}
