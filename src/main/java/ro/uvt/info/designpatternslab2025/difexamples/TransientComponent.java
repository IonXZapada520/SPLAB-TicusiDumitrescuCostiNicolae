package ro.uvt.info.designpatternslab2025.difexamples;



import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Numele corect este "prototype"
public class TransientComponent {
    public TransientComponent() {
        System.out.println("TransientComponent::TransientComponent = " + this);
    }

    public void operation() {
        System.out.println("Invoked TransientComponent::operation() on " + this);
    }
}