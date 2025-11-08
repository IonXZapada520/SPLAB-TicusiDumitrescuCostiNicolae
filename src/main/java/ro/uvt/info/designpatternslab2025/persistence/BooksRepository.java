// persistence/BooksRepository.java
package ro.uvt.info.designpatternslab2025.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.designpatternslab2025.model.Book;

@Repository // [cite: 264]
public interface BooksRepository extends JpaRepository<Book, Long> { // [cite: 265]
    // Am folosit Long pentru @Id, deci punem Long aici
}