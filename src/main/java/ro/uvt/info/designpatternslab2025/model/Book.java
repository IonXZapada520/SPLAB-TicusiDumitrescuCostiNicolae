
package ro.uvt.info.designpatternslab2025.model;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}