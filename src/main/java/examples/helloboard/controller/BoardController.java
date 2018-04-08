package examples.helloboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/boards")
public class BoardController {

    @GetMapping
    public String boards(){

        return "boards_list";
    }
}
