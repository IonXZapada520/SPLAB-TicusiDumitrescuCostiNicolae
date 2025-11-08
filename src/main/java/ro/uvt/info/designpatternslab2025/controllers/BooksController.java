
package ro.uvt.info.designpatternslab2025.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.designpatternslab2025.commands.*;
import ro.uvt.info.designpatternslab2025.model.Book;
import ro.uvt.info.designpatternslab2025.services.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {


    private final BooksService booksService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        Command<List<Book>> command = new GetAllBooksCommand(booksService);
        List<Book> books = command.execute();
        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Command<Book> command = new CreateBookCommand(booksService, book);
        Book createdBook = command.execute();
        return ResponseEntity.ok(createdBook);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id) {
        Book book = booksService.getBookById(id);
        if (book != null) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") int id, @RequestBody Book book) {
        // Aici ai crea UpdateBookCommand...
        Book updatedBook = booksService.updateBook(id, book);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
        booksService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}