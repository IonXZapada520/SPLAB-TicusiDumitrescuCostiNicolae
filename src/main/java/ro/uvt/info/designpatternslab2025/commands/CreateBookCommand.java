
package ro.uvt.info.designpatternslab2025.commands;

import ro.uvt.info.designpatternslab2025.model.Book;
import ro.uvt.info.designpatternslab2025.services.BooksService;

public class CreateBookCommand implements Command<Book> {

    private final BooksService booksService;
    private final Book book;

    public CreateBookCommand(BooksService booksService, Book book) {
        this.booksService = booksService;
        this.book = book;
    }

    @Override
    public Book execute() {
        return booksService.createBook(book);
    }
}