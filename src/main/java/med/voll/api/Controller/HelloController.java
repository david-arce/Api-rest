package med.voll.api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //ruta de HTTP que esá siguiendo el metodo
public class HelloController {

    @GetMapping //mapear el metodo get en la ruta /Hello para esta aplicacion
    public String helloWorld(){
        return "Hello world from colombia";
    }
}
