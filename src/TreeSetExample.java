import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

    public static void main(String[] args) {
        // 1. Create a new TreeSet, add some colors, and print out the tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("TreeSet of colors: " + colors);

        // 2. Iterate through all elements in a tree set.
        System.out.println("Iterating through TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Add all elements of a specified TreeSet to another TreeSet.
        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.add("Orange");
        moreColors.add("Pink");
        moreColors.addAll(colors);
        System.out.println("New TreeSet after adding more colors: " + moreColors);

        // 4. Create a reverse order view of the elements contained in a TreeSet.
        TreeSet<String> reverseColors = (TreeSet<String>) colors.descendingSet();
        System.out.println("Reverse order of colors: " + reverseColors);

        // 5. Get the first and last elements in a TreeSet.
        System.out.println("First color: " + colors.first());
        System.out.println("Last color: " + colors.last());

        // 6. Clone a TreeSet to another TreeSet.
        TreeSet<String> clonedSet = (TreeSet<String>) colors.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);

        // 7. Get the number of elements in a TreeSet.
        System.out.println("Number of elements in TreeSet: " + colors.size());

        // 8. Compare two TreeSets.
        System.out.println("Are colors and moreColors equal? " + colors.equals(moreColors));

        // 9. Find the numbers less than 7 in a TreeSet (Assuming numbers in a new TreeSet).
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(9);
        System.out.println("Numbers less than 7: " + numbers.headSet(7));

        // 10. Get the element in a TreeSet which is greater than or equal to a given element.
        System.out.println("Element greater than or equal to 5: " + numbers.ceiling(5));

        // 11. Get the element in a TreeSet which is less than or equal to a given element.
        System.out.println("Element less than or equal to 5: " + numbers.floor(5));

        // 12. Get the element in a TreeSet which is strictly greater than a given element.
        System.out.println("Element strictly greater than 5: " + numbers.higher(5));

        // 13. Get the element in a TreeSet which is strictly less than a given element.
        System.out.println("Element strictly less than 5: " + numbers.lower(5));

        // 14. Retrieve and remove the first element of a TreeSet.
        System.out.println("First element removed: " + numbers.pollFirst());
        System.out.println("TreeSet after removing first element: " + numbers);

        // 15. Retrieve and remove the last element of a TreeSet.
        System.out.println("Last element removed: " + numbers.pollLast());
        System.out.println("TreeSet after removing last element: " + numbers);

        // 16. Remove a given element from a TreeSet.
        boolean isRemoved = colors.remove("Green");
        System.out.println("Is 'Green' removed? " + isRemoved);
        System.out.println("TreeSet after removing 'Green': " + colors);
    }
}
