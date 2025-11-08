// commands/GetAllBooksCommand.java
package ro.uvt.info.designpatternslab2025.commands;

import ro.uvt.info.designpatternslab2025.model.Book;
import ro.uvt.info.designpatternslab2025.persistence.BooksRepository;
import java.util.List;

public class GetAllBooksCommand implements Command<List<Book>> {

    private final BooksRepository booksRepository; // Folosim Repository

    public GetAllBooksCommand(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public List<Book> execute() {
        return booksRepository.findAll(); // [cite: 274]
    }
}