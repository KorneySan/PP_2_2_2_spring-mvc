package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    @GetMapping()
    public String printWelcome(Integer count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        new CarServiceImpl().listCarsFirst(count).forEach(car -> messages.add(car.toString()));
        model.addAttribute("messages", messages);
        return "cars";
    }
}
