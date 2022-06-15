package com.techreturners.teama.healthfood;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

public interface MealPlanRepository extends JpaRepository<MealPlan,Long> {

}
