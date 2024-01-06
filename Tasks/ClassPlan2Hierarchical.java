package Tasks;

class  Shape{
	void draw() {
		System.out.println("Draw a shape");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Drawing a Square");
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing a Triangle");
	}
}


public class ClassPlan2Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		Square s = new Square();
		Triangle t = new Triangle();
		
		c.draw();
		s.draw();
		t.draw();

	}

}
