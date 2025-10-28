// model/Book.java
package ro.uvt.info.designpatternslab2025.model;
import java.util.ArrayList;
import java.util.List;


public class Book {

    private String title;
    private List<Author> authors = new ArrayList<>();
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
            author.print(); // [cite: 219]
        }


        for (Element element : content) {
            element.print();
        }
    }
}