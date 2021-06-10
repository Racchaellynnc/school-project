public class Monkey extends RescueAnimal  {
    private String species;
    private String breed;
    private double tailLength;
    private double height;
    private double bodyLength;

enum Species{ Capuchin, Guenon, Macaque, marmoset, SquirrelMonkey, Tamarin }

// MONKEY SPECIFIC ATTRIBUTES: 

public Monkey() {
    species = "";
    breed = "";
    tailLength = 0.0;
    height = 0.0;
    bodyLength = 0.0;
}

// INHERITS FROM THE RESCUE ANIMAL CLASS

public Monkey (
    String monkeySpecies, 
    String monkeyBreed, 
    double monkeyTailLength, 
    double monkeyHeight, 
    double monkeyBodyLength, 
    String name, 
    String gender, 
    String age, 
    String weight, 
    String acquisitionDate, 
    String acquisitionCountry, 
    String trainingStatus, 
    boolean reserved, 
    String inServiceCountry
    
)   {
    this.species = monkeySpecies;
    this.breed = monkeyBreed;
    this.tailLength = monkeyTailLength;
    this.height = monkeyHeight;
    this.bodyLength = monkeyBodyLength;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.weight = weight;
    this.acquisitionDate = acquisitionDate;
    this.acquisitionCountry = acquisitionCountry;
    this.trainingStatus = trainingStatus;
    this.reserved = reserved;
    this.inServiceCountry = inServiceCountry;
}

// MUTATOR AND ACCESS METHODS FOR EACH ATTRIBUTE: 

    String getSpecies() {
        return species;
    }
    String getBreed() {
        return breed;
    }
    double getTailLength() {
        return tailLength;
    }
    double getHeight() {
        return height;
    }
    double getBodyLength() {
        return bodyLength;
    }
    void setSpecies(String monkeySpecies) {
        this.species = monkeySpecies;
    }
    void setBreed(String monkeyBreed) {
        this.breed = monkeyBreed;
    }
    void setTailLength(double monkeyTailLength) {
        this.tailLength = monkeyTailLength;
    }
    void setHeight(double monkeyHeight) {
        this.height = monkeyHeight;
    }
    void setBodyLength(double monkeyBodyLength) {
        this.bodyLength = monkeyBodyLength;
    }
}
