

import com.mazurekb.Factory.Animal;
import com.mazurekb.Factory.AnimalFactory;
import com.mazurekb.NullObject.AbstractUser;
import com.mazurekb.NullObject.UserFactory;
import com.mazurekb.builder.ComputerSetup;
import com.mazurekb.builder.ComputerSetupBuilder;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Pattern: Null Object
		 * 
		 */
		
		AbstractUser user1 = UserFactory.getUser("Jack");
		AbstractUser user2 = UserFactory.getUser("Mike");
		AbstractUser user3 = UserFactory.getUser("Nick");
		AbstractUser user4 = UserFactory.getUser("Kate");
		AbstractUser user5 = UserFactory.getUser("John");
		
		System.out.println("Users: ");
		System.out.println(user1.getName());
		System.out.println(user2.getName());
		System.out.println(user3.getName());
		System.out.println(user4.getName());
		System.out.println(user5.getName());
		
		
		System.out.println();		
		/**********************************************************************/
		
		/*
		 * Pattern: Builder
		 * 
		 */

		ComputerSetupBuilder setupBuilder = new ComputerSetupBuilder();
		
		ComputerSetup forGames = setupBuilder.forGames();
		System.out.println("Setup for gamers: ");
		forGames.showComponents();
		System.out.println("Total cost: " + forGames.getCost());
		
		System.out.println();
		
		ComputerSetup forWork = setupBuilder.forWork();
		System.out.println("Setup for work: ");
		forWork.showComponents();
		System.out.println("Total cost: " + forWork.getCost());
		
		
		System.out.println();
		/**********************************************************************/
		
		/*
		 * Pattern: Factory
		 * 
		 */
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal animal1 = animalFactory.getAnimal("Dog");
		animal1.makeSound();
		
		Animal animal2 = animalFactory.getAnimal("Cat");
		animal2.makeSound();
		
		Animal animal3 = animalFactory.getAnimal("Cow");
		animal3.makeSound();
		
	}

}
