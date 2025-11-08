// ro/uvt/.../commands/GetAllBooksCommand.java
package ro.uvt.info.designpatternslab2025.commands;

import ro.uvt.info.designpatternslab2025.model.Book;
import ro.uvt.info.designpatternslab2025.services.BooksService;
import java.util.List;


public class GetAllBooksCommand implements Command<List<Book>> {

    private final BooksService booksService; // Receiver-ul [cite: 518]

    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public List<Book> execute() {

        return booksService.getAllBooks();
    }
}