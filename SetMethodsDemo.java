package collectionss;
import java.util.*;
public class SetMethodsDemo {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // 1. add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 2. addAll(Collection<? extends E> c)
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Kiwi");
        moreFruits.add("Grapes");
        fruits.addAll(moreFruits);

        // 3. contains(Object o)
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // 4. remove(Object o)
        fruits.remove("Banana");

        // 5. size()
        System.out.println("Set size: " + fruits.size());

        // 6. isEmpty()
        System.out.println("Is set empty? " + fruits.isEmpty());

        // 7. iterator()
        System.out.println("All fruits:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. containsAll(Collection<?> c)
        System.out.println("Contains all from moreFruits? " + fruits.containsAll(moreFruits));

        // 9. retainAll(Collection<?> c)
        fruits.retainAll(moreFruits); // Keeps only elements also in moreFruits
        System.out.println("After retainAll: " + fruits);

        // 10. removeAll(Collection<?> c)
        fruits.removeAll(moreFruits); // Removes all elements in moreFruits
        System.out.println("After removeAll: " + fruits);

        // 11. clear()
        fruits.clear();
        System.out.println("After clear: " + fruits);

        // 12. equals(Object o)
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "A"));
        System.out.println("Are set1 and set2 equal? " + set1.equals(set2));

        // 13. hashCode()
        System.out.println("Hash code of set1: " + set1.hashCode());
    }
}
