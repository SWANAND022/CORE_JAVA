package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Food1 {
	
	private Integer foodId;
	private String foodName;
	private String type;
	private Integer price;
	private Double rating;
	
	public Food1(Integer foodId, String foodName, String type, Integer price, Double rating) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.type = type;
		this.price = price;
		this.rating = rating;
	}

    public Food1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Food [\nfoodId=" + foodId + ", foodName=" + foodName + ", type=" + type + ", price=" + price + ", rating="
				+ rating + "]";
	}

  public Integer getFoodId() {
		return foodId;
	}

  public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
  public String getFoodName() {
		return foodName;
	}
  public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
  public String getType() {
		return type;
	}
  public void setType(String type) {
		this.type = type;
	}
public Integer getPrice() {
		return price;
	}
public void setPrice(Integer price) {
		this.price = price;
	}
public Double getRating() {
		return rating;
	}

public void setRating(Double rating) {
		this.rating = rating;
	}


public class Food {
	
	

	public Food(int i, String string, String string2, int j, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        ArrayList<Food> f=new ArrayList<>();
		
		
		f.add(new Food(205,"Burger","Veg",400,3.0));
		f.add(new Food(15,"Manchurian","Nonveg",230,4.5));
		f.add(new Food(50,"Chiken-chilli","Nonveg",700,5.0));
		f.add(new Food(45,"Panipuri","Veg",100,3.5));
		
		Collections.sort(f,Comparator.comparingDouble(Food::getPrice()));
		
		System.out.println("In ascending order:-");
		
		for(Food food : f) {
			System.out.println(food);
		}




	}

}
