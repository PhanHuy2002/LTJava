package LTJava_Lab3.example.Books.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import LTJava_Lab3.example.Books.Models.Book;
public interface BookRepository extends JpaRepository <Book, Long> {

}
