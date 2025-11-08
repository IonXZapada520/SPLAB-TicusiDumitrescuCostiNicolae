package ro.uvt.info.designpatternslab2025.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.designpatternslab2025.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class BooksService {


    private final List<Book> books = new CopyOnWriteArrayList<>();


    public BooksService() {
        books.add(new Book("Book 1", "Author 1"));
        books.add(new Book("Book 2", "Author 2"));
    }



    public List<Book> getAllBooks() {
        return new ArrayList<>(books); // Returnează o copie
    }

    public Book getBookById(int id) {
        if (id >= 0 && id < books.size()) {
            return books.get(id);
        }
        return null;
    }

    public Book createBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(int id, Book book) {
        if (id >= 0 && id < books.size()) {
            books.set(id, book);
            return book;
        }
        return null;
    }

    public void deleteBook(int id) {
        if (id >= 0 && id < books.size()) {
            books.remove(id);
        }

    }
}
