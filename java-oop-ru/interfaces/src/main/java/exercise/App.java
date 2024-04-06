package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        if (homes.isEmpty()) {
            return new ArrayList<>();
        }

        var result = homes.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Home::toString)
                .toList();

        return result.subList(0, n);
    }
}
// END
