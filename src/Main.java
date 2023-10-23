import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7");

        // Create instances of the strategies
        ListConverter strategy1 = new Strategy1();
        ListConverter strategy2 = new Strategy2();
        ListConverter strategy3 = new Strategy3();

        // Use each strategy to convert the list to a string
        String result1 = strategy1.listToString(items);
        String result2 = strategy2.listToString(items);
        String result3 = strategy3.listToString(items);

        // Print the results
        System.out.println("Strategy 1:\n" + result1);
        System.out.println("Strategy 2:\n" + result2);
        System.out.println("Strategy 3:\n" + result3);
    }
}
