package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {
//    public CarService cs;
//
//    public CarsController(CarService cs) {
//        this.cs = cs;
//    }
//
//    @Autowired
//    public void setCs(CarService cs) {
//        this.cs = cs;
//    }


    //    @GetMapping("/cars")
//    public String getCars(@RequestParam (defaultValue = "0") Integer count,
//                          @RequestParam (value = "count", requiered = false) Integer sadf,
//                          Model model) {
//        List<Car> displayList = new CarServiceImpl().getListCars();
//        model.addAttribute("display2", displayList);
//        return "cars";
//    }

    @GetMapping("/cars")
    public String getCarsWithParam(@RequestParam (value = "count", defaultValue = "5", required = false) Integer count,
                                   Model model) {
        List<Car> displayList = null;
        displayList = new CarServiceImpl().getListCarsByParam(count);
        model.addAttribute("display2", displayList);
        return "cars";
    }
}
