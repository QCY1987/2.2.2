package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarServise;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/car")
public class CarController {
    @GetMapping
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarServise service = new CarServise();
        model.addAttribute("cars", service.getCars(count));
        return "сar";
    }
}