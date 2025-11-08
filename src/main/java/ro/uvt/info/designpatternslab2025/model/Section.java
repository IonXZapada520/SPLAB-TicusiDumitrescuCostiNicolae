// model/Section.java
package ro.uvt.info.designpatternslab2025.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity // [cite: 237]
@Data
@NoArgsConstructor(force = true) // [cite: 239]
public class Section extends Element { // <-- Schimbare importantă: extends

    private String title;

    @OneToMany(cascade = CascadeType.ALL) // [cite: 250, 291]
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }
    // ... implementează și remove/get dacă e nevoie ...
}