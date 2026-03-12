// My code has two constructors and three methods. 
public class Animal {

    private String species;

    // 1st constructor is a default constructor.
    public Animal() {
        species = "";
    }

    // 2nd constructor is a custom constructor.
    public Animal(String newSpecies) {
        species = newSpecies;
    }

    // Setter method
    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    // Getter method
    public String getSpecies() {
        return species;
    }

    // toString method
    public String toString() {
        return "Species: " + species;
    }
}