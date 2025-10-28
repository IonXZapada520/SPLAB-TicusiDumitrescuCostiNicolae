package ro.uvt.info.designpatternslab2025.model;

public class Paragraph implements Element {

    private String text;

    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
        this.textAlignment = null;
    }

    // Metodă getter pentru ca strategiile să acceseze textul
    public String getText() {
        return text;
    }


    public void setAlignStrategy(AlignStrategy strategy) {
        this.textAlignment = strategy;
    }

    @Override
    public void print() {

        if (textAlignment != null) {

            textAlignment.render(this);
        } else {

            System.out.println("Paragraph: " + text);
        }
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