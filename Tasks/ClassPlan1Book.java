package Tasks;

public class ClassPlan1Book {
	
	private int id;
    private String name;
    private String author;
    private String category;
    private double price;
    
    public ClassPlan1Book() {
    }
    
    public ClassPlan1Book(int id, String name, String author, String category, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
    }
    
    public ClassPlan1Book(String name, String author, String category, double price) {
        this.id = 1; // Default value for id when not provided
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getCategory() {
        return category;
    }
    
    public double getPrice() {
        return price;
    }
    
    

	@Override
	public String toString() {
		return "ClassPlan1Book [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		ClassPlan1Book book1 = new ClassPlan1Book(2, "It Starts With us", "Colleen Hoover", "Fiction", 100.00);
		ClassPlan1Book book2 = new ClassPlan1Book("It ends With us", "Colleen Hoover", "Fiction", 100.00);
		
		System.out.println("Book 1=" + book1);
        System.out.println("Book 2=" + book2);
	}

}
