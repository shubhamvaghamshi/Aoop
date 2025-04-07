
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
       
        HashSet<String> colors = new HashSet<>();

        // Add color names to the HashSet
        colors.add("Black");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Sky Blue");

       
        System.out.println("Colors in the HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

