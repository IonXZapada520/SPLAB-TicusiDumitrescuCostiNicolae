package ro.uvt.info.designpatternslab2025.model;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph p) {
        int width = 70;
        int padding = (width - p.getText().length()) / 2;
        String line = " ".repeat(padding) + p.getText();
        System.out.println("Paragraph: " + line);
    }
}