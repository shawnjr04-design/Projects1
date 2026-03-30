// Matching IntArray class for the Runner file
public class IntArray {
    private int length;
    private int[] myArray;

    public IntArray(int size) {
        length = size;
        myArray = new int[length];
    }
    
    public int size() {
        return length;
    }

    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = (int)(Math.random() * 6) +1;

        }
    }

    public void set(int index, int value) {
        if(index >= 0 && index < length) {
            myArray[index] = value;
        }
    }

    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        }
        return -1; 
    }

    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    public String toString() {
        if (length == 0) return "[]";

        String result = "[";
        for (int i = 0; i < length; i++) {
            result += myArray[i];
            if (i < length - 1) {
                result += ", ";
            }
        }

        result += "]";
        return result; 
    }
}