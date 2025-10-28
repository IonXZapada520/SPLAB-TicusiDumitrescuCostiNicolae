package ro.uvt.info.designpatternslab2025.model;

public interface Element {

    void print();


    void add(Element element);


    void remove(Element element);


    Element get(int index);
}