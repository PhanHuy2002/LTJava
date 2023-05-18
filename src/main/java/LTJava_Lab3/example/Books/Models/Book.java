package LTJava_Lab3.example.Books.Models;
import javax.persistence.*;
@Entity
@Table(name = "book")
public class Book {
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "title", nullable = false ,length = 255 )
	private String title;
	@Column(name = "author", nullable = true ,length = 255 )
	private String author;
	@Column(name = "price")
	private Long price;
	@ManyToOne
	@JoinColumn(name = "category_id",nullable =false)
	private Category category;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public Long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	public Book(Long id, String title, String author, Long price, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
public Book() {
		
	}
	
}
