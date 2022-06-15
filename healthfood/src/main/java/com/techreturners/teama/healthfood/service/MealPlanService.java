package com.techreturners.teama.healthfood;

import javax.persistence.*;

@Service
public class MealPlanService {
    @Autowired
private MealPlanRepository mealPlanRepository;

    public MealPlan saveMealPlan(MealPlan mealPlan){
        return mealPlanRepository.save(mealPlan);
    }

    public MealPlan getMealPlan(long mealPlanId){
        return mealPlanRepository.findById(mealPlanId).orElseThrow(()->
                new RuntimeException("not found"));
    }

    public List<MealPlan> getMealPlans(long userId){
        return mealPlanRepository.getMealPlans(userId);
    }

    public MealPlan updateMealPlan(long mealPlanId,MealPlan mealPlan) {
        MealPlan existingMealPlan = mealPlanRepository.findById(mealPlanId).orElseThrow(() ->
                new RuntimeException("not found"));
        existingMealPlan.setDate(mealPlan.getDate());
        existingMealPlan.setMealPlanId(mealPlan.getMealPlanId());
        mealPlanRepository.save(existingMealPlan);
        return existingMealPlan;
    }

    public MealPlan deleteMealPlan(long mealPlanId) {
        MealPlan existingMealPlan = mealPlanRepository.findById(mealPlanId).orElseThrow(() ->
                new RuntimeException("not found"));
         mealPlanRepository.deleteById(mealPlanId);
        return existingMealPlan;
    }

}
