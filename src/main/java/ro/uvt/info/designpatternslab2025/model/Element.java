
package ro.uvt.info.designpatternslab2025.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor(force = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public abstract void print();

    public void add(Element element) {
        throw new UnsupportedOperationException();
    }
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }
    public Element get(int index) {
        throw new UnsupportedOperationException();
    }
}