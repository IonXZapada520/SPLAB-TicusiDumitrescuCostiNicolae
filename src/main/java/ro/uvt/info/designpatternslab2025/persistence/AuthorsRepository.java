// persistence/AuthorsRepository.java
package ro.uvt.info.designpatternslab2025.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.designpatternslab2025.model.Author;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Long> { // [cite: 261]
}