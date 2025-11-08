
package ro.uvt.info.designpatternslab2025.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor(force = true)
public class Paragraph extends Element {

    private String text;

    @Transient
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
        this.textAlignment = null;
    }

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


}