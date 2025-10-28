package ro.uvt.info.designpatternslab2025.model; // Asigură-te că pachetul este corect


public class Author {
    private String name;


    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}