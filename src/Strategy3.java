import java.util.List;

// Using a for-loop with the get method
public class Strategy3 implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i)).append("\n");
            if ((i + 1) % 3 == 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
