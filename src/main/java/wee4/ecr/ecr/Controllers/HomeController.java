package wee4.ecr.ecr.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   
 @GetMapping("/")
 public String home() {
    return  "Kingsley Botchway Ecr Lab Home Docker Container";
 }
}
