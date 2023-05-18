package LTJava_Lab3.example.Books.Models;

import java.util.List;
import javax.persistence.*;
@Entity
@Table(name= "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Long id;
	@Column(name = "name", nullable = false ,length = 255 )
	private String name;
	@Column(name = "decription", nullable = true ,length = 255 )
	private String decription;
	@OneToMany(mappedBy = "category")
	private List<Book> books;
	public Long getId() {
		return id;
	}
	public Category(Long id, String name, String decription, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.decription = decription;
		this.books = books;
	}
	public Category() {
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the decription
	 */
	public String getDecription() {
		return decription;
	}
	/**
	 * @param decription the decription to set
	 */
	public void setDecription(String decription) {
		this.decription = decription;
	}
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
}
