package collectionss;
import java.util.*;

public class LinkedListAllMethods {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. add(element)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 2. add(index, element)
        list.add(1, "Blueberry");

        // 3. addFirst(element)
        list.addFirst("Mango");

        // 4. addLast(element)
        list.addLast("Pineapple");

        // 5. get(index)
        System.out.println("Element at index 2: " + list.get(2));

        // 6. getFirst() and getLast()
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // 7. set(index, element)
        list.set(2, "Coconut");

        // 8. remove(index)
        list.remove(1);

        // 9. remove(Object)
        list.remove("Apple");

        // 10. removeFirst() and removeLast()
        list.removeFirst();
        list.removeLast();

        // 11. contains(element)
        System.out.println("Contains 'Banana'? " + list.contains("Banana"));

        // 12. size()
        System.out.println("Size: " + list.size());

        // 13. isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // 14. indexOf(element)
        list.add("Banana");
        System.out.println("First Index of 'Banana': " + list.indexOf("Banana"));

        // 15. lastIndexOf(element)
        list.add("Banana");
        System.out.println("Last Index of 'Banana': " + list.lastIndexOf("Banana"));

        // 16. clear()
        LinkedList<String> temp = new LinkedList<>(list);
        temp.clear();
        System.out.println("Temp after clear: " + temp);

        // 17. toArray()
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 18. clone()
        LinkedList<String> cloned = (LinkedList<String>) list.clone();
        System.out.println("Cloned: " + cloned);

        // 19. subList(fromIndex, toIndex)
        List<String> subList = list.subList(0, 2);
        System.out.println("Sublist (0 to 2): " + subList);

        // 20. forEach()
        System.out.println("Using forEach:");
        list.forEach(System.out::println);

        // 21. sort()
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // 22. retainAll()
        LinkedList<String> keep = new LinkedList<>(Arrays.asList("Banana", "Coconut"));
        list.retainAll(keep);
        System.out.println("After retainAll: " + list);

        // 23. removeAll()
        list.removeAll(Collections.singleton("Banana"));
        System.out.println("After removeAll: " + list);

        // 24. addAll()
        list.addAll(Arrays.asList("Mango", "Papaya", "Kiwi"));
        System.out.println("After addAll: " + list);

        // 25. containsAll()
        boolean hasAll = list.containsAll(Arrays.asList("Mango", "Kiwi"));
        System.out.println("Contains All [Mango, Kiwi]? " + hasAll);

        // 26. replaceAll()
        list.replaceAll(e -> e.toUpperCase());
        System.out.println("After replaceAll: " + list);

        // 27. iterator()
        System.out.println("Using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 28. descendingIterator()
        System.out.println("Using Descending Iterator:");
        Iterator<String> descItr = list.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }

        // 29. listIterator()
        System.out.println("Using ListIterator backward:");
        ListIterator<String> listItr = list.listIterator(list.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 30. peek(), peekFirst(), peekLast()
        System.out.println("Peek: " + list.peek());
        System.out.println("Peek First: " + list.peekFirst());
        System.out.println("Peek Last: " + list.peekLast());

        // 31. poll(), pollFirst(), pollLast()
        System.out.println("Poll: " + list.poll());
        System.out.println("Poll First: " + list.pollFirst());
        System.out.println("Poll Last: " + list.pollLast());

        // 32. push() and pop()
        list.push("Strawberry");
        System.out.println("After push: " + list);
        System.out.println("Popped: " + list.pop());

        // 33. equals()
        LinkedList<String> another = new LinkedList<>(list);
        System.out.println("Is Equal? " + list.equals(another));
    
    }
}
