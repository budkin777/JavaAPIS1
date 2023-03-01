import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class S2z2 {
    private static String getRequest(Map<String, String> data) {
        StringBuilder sb = new StringBuilder("select * from students where ");
        // Map.Entry - описываем пару (ключ - значение) "name=Ivanov" и т.п.
        // entrySet - возращает множество со значениями Map, т.е. [name=Ivanov, country=Russia, city=Moscow...]
        Iterator<Map.Entry<String, String>> entries = data.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            if (entry.getValue() != "null") {
                sb.append(entry.getKey() + " = '" + entry.getValue() + "' and ");
            }
        }
        sb.delete(sb.toString().length() - 5, sb.toString().length());
        return sb.toString();

    }

    public static void main(String[] args) {

        Map<String, String> data = new HashMap<>();
        data.put("name", "Ivanov");
        data.put("country", "Russia");
        data.put("city", "Moscow");
        data.put("age", "null");

        String st = getRequest(data);
        System.out.println(st);

    }
}
