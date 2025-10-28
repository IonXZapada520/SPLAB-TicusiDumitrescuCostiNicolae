package ro.uvt.info.designpatternslab2025;

import org.springframework.context.ApplicationContext;
import ro.uvt.info.designpatternslab2025.difexamples.ClientComponent;
import ro.uvt.info.designpatternslab2025.difexamples.SingletonComponent;
import ro.uvt.info.designpatternslab2025.difexamples.TransientComponent;
// ---

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LapspTicusiDumitrescuCostiNicolaeApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(LapspTicusiDumitrescuCostiNicolaeApplication.class, args);

        TransientComponent transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation(); // [cite: 146]

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation(); // [cite: 156]

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
    }
}