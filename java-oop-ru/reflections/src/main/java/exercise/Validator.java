package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class Validator {
    public static List<String> validate(Object object) {
        List<String> result = new ArrayList<>();

        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    field.setAccessible(true);
                    if (field.get(object) == null) {
                        result.add(field.getName());
                    }
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }
}
// END
