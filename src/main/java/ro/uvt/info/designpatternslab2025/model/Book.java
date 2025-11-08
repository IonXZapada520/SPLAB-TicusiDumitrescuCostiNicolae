// model/Book.java
package ro.uvt.info.designpatternslab2025.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity // [cite: 237]
@Data
@NoArgsConstructor(force = true) // [cite: 239]
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // [cite: 307]
public class Book {

    @Id // [cite: 240]
    @GeneratedValue // [cite: 242]
    private Long id;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL) // [cite: 253-255, 291]
    private List<Author> authors = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL) // [cite: 250, 291]
    private List<Element> content = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        content.add(element);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (Element element : content) {
            element.print();
        }
    }
}