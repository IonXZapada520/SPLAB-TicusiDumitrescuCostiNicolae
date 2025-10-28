
package ro.uvt.info.designpatternslab2025.model;


public class Paragraph implements Element {

    private String text; // text: String [cite: 186]

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {

        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException();
    }
}