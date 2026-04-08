import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("Pineapple");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Apple");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nNumbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }

        fruits.remove("Pear"); 
        numbers.remove(2);       

        fruits.set(1, "Grapes");  
        numbers.set(0, 99);       

        System.out.println("\nUpdated Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nUpdated Numbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}