package hu.chriscoding.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Helló ez az első saját oldalam";
    }
}
