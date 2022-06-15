package com.techreturners.teama.healthfood;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

//@Query(value = "select * from meal where name = ?1", nativeQuery=true)
//List<Meal> getMealByName(String name)
@RestController
public class MealController {
    @GetMapping("/")
    public ResponseEntity<?> indmeal(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/meal")
    public ResponseEntity<?> meal(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
