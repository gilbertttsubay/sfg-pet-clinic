package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/pet-clinic")
public class OwnerController {

    @GetMapping("/owner")
    String indexOwner(){
        return "owner/index";
    }
}
