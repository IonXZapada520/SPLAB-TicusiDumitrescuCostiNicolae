// controllers/BooksController.java
package ro.uvt.info.designpatternslab2025.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.designpatternslab2025.commands.*;
import ro.uvt.info.designpatternslab2025.model.Book;
// Importăm noul Repository
import ro.uvt.info.designpatternslab2025.persistence.BooksRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {

    // Injectăm Repository-ul
    private final BooksRepository booksRepository;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        Command<List<Book>> command = new GetAllBooksCommand(booksRepository);
        List<Book> books = command.execute();
        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Command<Book> command = new CreateBookCommand(booksRepository, book);
        Book createdBook = command.execute();
        return ResponseEntity.ok(createdBook);
    }

    // Actualizăm și restul metodelor
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        Optional<Book> book = booksRepository.findById(id);

        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // PUT /books/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long id, @RequestBody Book bookDetails) {
        Optional<Book> optionalBook = booksRepository.findById(id);

        if (optionalBook.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Book book = optionalBook.get();
        book.setTitle(bookDetails.getTitle());
        // Poți actualiza și autori, conținut etc.
        Book updatedBook = booksRepository.save(book);
        return ResponseEntity.ok(updatedBook);
    }

    // DELETE /book/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Long id) {
        Optional<Book> optionalBook = booksRepository.findById(id);

        if (optionalBook.isPresent()) {
            booksRepository.delete(optionalBook.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }}