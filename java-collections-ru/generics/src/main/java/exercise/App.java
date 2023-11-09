package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {

    public static <T> List<Map<T, T>> findWhere(List<Map<T, T>> books, Map<T, T> where) {
        List<Map<T, T>> result = new ArrayList<>();


        for (Map<T, T> book : books) {
            if (book.values().containsAll(where.values())) {
                result.add(book);
            }
        }

        return result;

    }
}
//END
