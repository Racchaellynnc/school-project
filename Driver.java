import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

    // Prompts the user for input and validates the input
        displayMenu();
        scnr.nextLine();

        String menu_option = scnr.nextLine();

        initializeDogList();
        initializeMonkeyList();

        do {
            displayMenu();
            if (menu_option != "q" ) {
                System.out.println("Rescue Animal System Menu");
                System.out.println("Press q to quit anytime");
                System.out.println("Press 1 to intake a new dog");
                System.out.println("Press 2 to intake a new monkey");
                System.out.println("Press 3 to Reserve an animal");
                System.out.println("Press 4 to Print a list of all dogs");
                System.out.println("Press 5 to Print a list of all monkeys");
                System.out.println("Press 6 to Print a list of all animals that are not reserved");
            }

            else if (menu_option == "1") {
                intakeNewDog(scnr);
            }

            else if (menu_option == "2" ) {
                System.out.println("What is the monkeys name?");
            }

            else {
                System.out.println("Make a selection");
            }
        }
        
        while (menu_option != "0");
        if(scnr != null) {
            scnr.close();
        }
       

    // Add a loop that displays the menu, accepts the users input
    // and takes the appropriate action.
	// For the project submission you must also include input validation
    // and appropriate feedback to the user.
    // Hint: create a Scanner and pass it to the necessary
    // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println(" ");
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }



    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Banana", "Guenon", 10.5, 2.0, 1.0, "male", "1", "25.6", "05-12-2019", "United States", "intake", null, false, "United States");
        Monkey monkey2 = new Monkey("Abu", "SquirrelMonkey", 7.0, 3.0, 0.5, "male", "3", "35.2", "02-03-2020", "United States", "Phase I", null, false, "United States");
        Monkey monkey3 = new Monkey("Rafiki", "Tamarin", 4.0, 7.0, 2.0, "female", "4", "25.6", "12-12-2019", "Canada", "in service", null, true, "Canada");
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's aquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's aquisition country?");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Do you want to make a reservation? (Y/N) ");
        String setReserved = scanner.nextLine();

        System.out.println("What country do you need service in?");
        String setInServiceCountry = scanner.nextLine();
        

        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list

        

    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {

        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        System.out.println("What is the monkey's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the monkey's aquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the monkey's aquisition country?");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Do you want to make a reservation? (Y/N) ");
        String setReserved = scanner.nextLine();

        System.out.println("What country do you need service in?");
        String setInServiceCountry = scanner.nextLine();

        System.out.println("What is the monkey's species?");
        String monkeySpecies = scanner.nextLine();

        System.out.println("What is the monkey's breed?");
        String monkeyBreed = scanner.nextLine();

        
        System.out.println("What is the monkey's tail length?");
        String monkeyTailLength =scanner.nextLine();

        
        System.out.println("What is the monkey's height?");
        String monkeyHeight =scanner.nextLine();

        
        System.out.println("What is the monkey's body length?");
        String monkeyBodyLength =scanner.nextLine();

        
                for(Monkey monkey: monkeyList) {
                    if(monkey.getName().equalsIgnoreCase(name)) {
                        System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");

        }
}

