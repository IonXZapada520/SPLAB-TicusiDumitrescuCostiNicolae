package ro.uvt.info.designpatternslab2025.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.designpatternslab2025.difexamples.ClientComponent;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String hello() {

        return "Hello from ClientComponent = " + clientComponent;
    }
}
