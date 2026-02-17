// For the name of the pet I put Morgan. He was our family pet. He wasn't a Dachshund or Husky but I just felt like
// adding him.
public class Pet {

    // Private data
    private String name;
    private String type;
    private int age;

    //  Public constructor
    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1); // using mutator inside constructor
    }
    
    public Pet(String type, String name, int age) {
        setType(type);
        setName(name);
        setAge(age);
    }

    // Public set method
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Public get method
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";

        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Yowl";
        }
    }

    // Public toString() method
    public String toString() {
        String result = "";
        result += "Pet information:\n";
        result += "Type: " + type + "\n";
        result += "Name: " + name + "\n";
        result += "Sound: " + speak() + "\n";
        result += "Age: " + age + "\n";
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
