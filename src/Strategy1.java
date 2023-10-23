import java.util.Iterator;
import java.util.List;

// Using Iterator
public class Strategy1 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            result.append(iterator.next()).append("\n");
        }
        return result.toString();
    }
}
