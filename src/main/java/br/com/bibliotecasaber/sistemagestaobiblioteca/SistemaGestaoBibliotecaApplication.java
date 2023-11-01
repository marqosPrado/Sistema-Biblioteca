package br.com.bibliotecasaber.sistemagestaobiblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SistemaGestaoBibliotecaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SistemaGestaoBibliotecaApplication.class, args);
    }

}
