package com.techreturners.teama.healthfood;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class MealPlanController {
    @Autowired
    private MealPlanService mealPlanService;
    @PostMapping("/mealplan")
    public ResponseEntity<MealPlan> saveMealPlan(@RequestBody MealPlan mealPlan){
      MealPlan saveMealPlan=mealPlanService.saveMealPlan(mealPlan);
      return new ResponseEntity<>(saveMealPlan,HttpStatus.CREATED);
    }

    @PostMapping("/mealplan")
    public ResponseEntity<MealPlan> getMealPlan(@RequestParam(name = "mpid") long mealPlanId){
        MealPlan mealPlan=mealPlanService.getMealPlan(mealPlanId);
        return new ResponseEntity<>(mealPlan,HttpStatus.OK);
    }

    @GetMapping("/mealplan")
    public List<MealPlan> getMealPlans(@RequestParam(name = "uid") long userId){
        return mealPlanService.getMealPlans(userId);
    }

    @PatchMapping("/mealplan")
    public ResponseEntity<MealPlan> updateMealPlan(@RequestParam(name = "mpid") long mealPlanId, @RequestBody MealPlan mealPlan){
        MealPlan updatedMealPlan=mealPlanService.updateMealPlan(mealPlanId,mealPlan);
        return new ResponseEntity<>(updatedMealPlan,HttpStatus.OK);
    }

    @DeleteMapping("/mealplan")
    public ResponseEntity<MealPlan> deleteMealPlan(@RequestParam(name = "mpid") long mealPlanId){
        MealPlan deletedMealPlan=mealPlanService.deleteMealPlan(mealPlanId);
        return new ResponseEntity<>(deletedMealPlan,HttpStatus.OK);
    }


}
