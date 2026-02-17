import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Pet 1 — default constructor
        Pet myPet1 = new Pet();
        System.out.println(myPet1.toString());

        // Pet 2 — custom constructor
        Pet myPet2 = new Pet("Dog", "Buster", 11);
        System.out.println(myPet2.toString());

        // Pet 3 — user input
        System.out.println("Enter animal type:");
        String type = scnr.nextLine();

        System.out.println("Enter animal name:");
        String name = scnr.nextLine();

        System.out.println("Enter animal age:");
        int age = scnr.nextInt();

        Pet myPet3 = new Pet(type, name, age);
        System.out.println(myPet3.toString());

        scnr.close();
    }
}
