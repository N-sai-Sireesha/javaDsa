package collectionss;
import java.util.*;

public class ArrayListAllMethods {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 1. add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 2. add(index, element)
        fruits.add(1, "Blueberry");

        // 3. get(index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // 4. set(index, element)
        fruits.set(2, "Coconut");

        // 5. remove(index)
        fruits.remove(1); // Removes "Blueberry"

        // 6. remove(Object)
        fruits.remove("Apple");

        // 7. contains(element)
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // 8. size()
        System.out.println("Size: " + fruits.size());

        // 9. isEmpty()
        System.out.println("Is Empty? " + fruits.isEmpty());

        // 10. indexOf(element)
        fruits.add("Banana");
        System.out.println("First Index of 'Banana': " + fruits.indexOf("Banana"));

        // 11. lastIndexOf(element)
        fruits.add("Banana");
        System.out.println("Last Index of 'Banana': " + fruits.lastIndexOf("Banana"));

        // 12. clear()
        ArrayList<String> temp = new ArrayList<>(fruits);
        temp.clear();
        System.out.println("Temp after clear: " + temp);

        // 13. toArray()
        Object[] array = fruits.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 14. clone()
        ArrayList<String> cloned = (ArrayList<String>) fruits.clone();
        System.out.println("Cloned: " + cloned);

        // 15. ensureCapacity()
        fruits.ensureCapacity(20); // Optimize size (no visible output)

        // 16. subList(fromIndex, toIndex)
        List<String> subList = fruits.subList(0, 2);
        System.out.println("Sublist (0 to 2): " + subList);

        // 17. forEach()
        System.out.println("Using forEach:");
        fruits.forEach(System.out::println);

        // 18. sort()
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        // 19. retainAll()
        ArrayList<String> keep = new ArrayList<>(Arrays.asList("Banana", "Coconut"));
        fruits.retainAll(keep);
        System.out.println("After retainAll: " + fruits);

        // 20. removeAll()
        fruits.removeAll(Collections.singleton("Banana"));
        System.out.println("After removeAll: " + fruits);

        // 21. addAll()
        fruits.addAll(Arrays.asList("Mango", "Papaya", "Kiwi"));
        System.out.println("After addAll: " + fruits);

        // 22. containsAll()
        boolean hasAll = fruits.containsAll(Arrays.asList("Mango", "Kiwi"));
        System.out.println("Contains All [Mango, Kiwi]? " + hasAll);

        // 23. replaceAll()
        fruits.replaceAll(e -> e.toUpperCase());
        System.out.println("After replaceAll: " + fruits);

        // 24. iterator()
        System.out.println("Using Iterator:");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 25. listIterator()
        System.out.println("Using ListIterator backward:");
        ListIterator<String> listItr = fruits.listIterator(fruits.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 26. equals()
        ArrayList<String> another = new ArrayList<>(fruits);
        System.out.println("Is Equal? " + fruits.equals(another));
    }
}
