package Interface;

interface BasicAnimal {
    void eat();
    void sleep();
}

class Monkey {
    public void jump() 
    {
        System.out.println("Monkey is jumping...");
    }

    public void bite() 
    {
        System.out.println("Monkey is biting...");
    }
}

class Human extends Monkey implements BasicAnimal {
    public void speak() {
        System.out.println("Human is speaking...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping...");
    }
}
public class Interfaceprgrm2 {

	public static void main(String[] args) {
		
		 Human human = new Human();

	        	        human.jump();
	        human.bite();
	        human.speak();
	        human.eat();
	        human.sleep();	
		
	}

}
