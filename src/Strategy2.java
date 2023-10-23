import java.util.List;

// Using a for-loop after converting the list to an array
public class Strategy2 implements ListConverter{
    @Override
    public String listToString(List<String> list) {
        String[] dataArray = list.toArray(new String[0]);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dataArray.length; i++) {
            result.append(dataArray[i]).append("\n");
            if (i % 2 == 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
