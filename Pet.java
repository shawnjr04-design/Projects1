// For the name of the pet I put Morgan. He was our family pet. He wasn't a Dachshund or Husky but I just felt like
// adding him.
public class Pet {

    // Private data
    private String name;

    //  Public constructor
    public Pet() {
        setName("Pet Name"); // using mutator inside constructor
    }

    // Public set method
    public void setName(String name) {
        this.name = name;
    }

    // Public get method
    public String getName() {
        return name;
    }

    // Public toString() method
    public String toString() {
        String result = "";
        result += "Pet information:\n";
        result += "Name: " + name;
        return result;
    }

    //  Main method that instantiates two pet objects.
    public static void main(String[] args) {

        // First pet object uses the default constructor.
        Pet myPet1 = new Pet();
        System.out.println(myPet1.toString());

        // Second pet object uses the set method.
        Pet myPet2 = new Pet();
        myPet2.setName("Morgan");
        System.out.println(myPet2.toString());
    }
}
