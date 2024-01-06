package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Food {
    private int foodId;
    private String foodName;
    private String type;
    private double price;
    private int rating;

    public Food(int foodId, String foodName, String type, double price, int rating) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Food ID: " + foodId + ", Food Name: " + foodName + ", Type: " + type + ", Price: " + price + ", Rating: " + rating;
    }
}

public class FoodTask {
	
	public static void main(String[] args) {
		
		 ArrayList<Food> f = new ArrayList<>();

	      
	        f.add(new Food(1, "Chicken Biryani", "Non-Veg", 10.00, 5));
	        f.add(new Food(2, "Palak Paneer", "Veg", 7.00, 5));
	        f.add(new Food(3, "Sandwich", "Veg", 5.00, 5));
	        f.add(new Food(4, "Butter Chicken", "Non-Veg", 12.00, 5));
	        f.add(new Food(5, "Pasta", "Veg", 6.00, 5));

	       
	        Collections.sort(f, Comparator.comparingDouble(Food::getPrice));

	    
	        System.out.println("Food items sorted by price in ascending order:");
	        for (Food food : f) {
	            System.out.println(food);
	        }
		
	}
}


	


