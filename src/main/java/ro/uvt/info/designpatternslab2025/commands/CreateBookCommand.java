// commands/CreateBookCommand.java
package ro.uvt.info.designpatternslab2025.commands;

import ro.uvt.info.designpatternslab2025.model.Book;
import ro.uvt.info.designpatternslab2025.persistence.BooksRepository;

public class CreateBookCommand implements Command<Book> {

    private final BooksRepository booksRepository;
    private final Book book; // [cite: 271]

    public CreateBookCommand(BooksRepository booksRepository, Book book) {
        this.booksRepository = booksRepository;
        this.book = book;
    }

    @Override
    public Book execute() {
        return booksRepository.save(book); // [cite: 272]
    }
}