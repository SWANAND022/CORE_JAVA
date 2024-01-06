package Tasks;

class Pets {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Bull extends Animal {
    void makeSound() {
        System.out.println("Bull Runs");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pets p = new Pets();

        Bull b = new Bull();
        b.makeSound(); 

        Cat c = new Cat();
        c.makeSound(); 

	}

}
