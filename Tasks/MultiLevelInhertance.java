package Tasks;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class elephant extends Animal {
    void run() {
        System.out.println("This elephant can run.");
    }
}

class Dog extends elephant {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultiLevelInhertance {

	public static void main(String[] args) {
		
		Dog d = new Dog();

        d.eat(); 
        d.run();  
        d.bark(); 

	}

}
