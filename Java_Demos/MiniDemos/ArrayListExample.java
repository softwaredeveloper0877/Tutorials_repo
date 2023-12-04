import java.util.ArrayList; //In this we import the ArrayList package from use the ArrayList class.
public class ArrayListExample {
    /*ArrayList is actually an array. But Offers(sunmak) ease of use compared to(göre) simple arrays. Many operations such as(gibi) getting element in a specific(istenilen) index, adding, deleting element /or all elements do with methods in ArrayList*/
    public static void main(String[] args){
        ArrayList numbers = new ArrayList(); // We are making new for use ArrayList class.
        numbers.add(5); // In this we use the .add() method to add an element to number ArrayList
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add("anamanam"); // Can adding different type elements in ArrayList
        numbers.set(3,"babam"); // Can change desired index of ArrayList with .set() method.
        System.out.println(numbers.get(1)); // Use .get() method to getting desired element of ArrayList.
        numbers.remove(0); // Can remove desired index of ArrayList with .remove() method.
        for (Object i: numbers) // We should Browse indexes with object Because ArrayList contain different types
            System.out.println(i);
        numbers.clear(); // Can delete all element of ArrayList with .clear() method.
    }
}