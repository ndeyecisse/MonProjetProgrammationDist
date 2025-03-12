package com.example.progDistribuee.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class RentalService {
    List<Car> listeCars = new ArrayList<Car>();

    Logger logger = LoggerFactory.getLogger(RentalService.class);

    public RentalService(){
        Car car = new Car("AAAA","peugeot",122);
        listeCars.add(car);
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return listeCars;

    }
    @GetMapping("/cars/{plateNumber}")
    
    @ResponseBody
    public Car aCar(@PathVariable("plateNumber") String plateNumber)throws Exception{
        for (Car car : listeCars){
            if (car.getPlateNumber() == plateNumber){
                return car;
            }
        }
            throw new Exception("voiture nontrouvé");
        }
    

    @GetMapping("/bonjour")
    public String disBonjour(){
        return "Bonjour";
    }

    @PutMapping(value = "/cars/{plateNumber}")
    public void rent(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent") boolean rent,
            @RequestBody Dates dates){

        logger.info("PlateNumber : " + plateNumber);
        logger.info("Rent : " + rent);
        logger.info("Dates : " + dates);


    }

}
