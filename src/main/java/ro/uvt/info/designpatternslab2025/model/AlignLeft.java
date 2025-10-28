// model/AlignLeft.java
package ro.uvt.info.designpatternslab2025.model;


public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph p) {

        System.out.println("Paragraph: " + p.getText());
    }
}