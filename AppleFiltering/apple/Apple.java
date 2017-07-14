package apple;
import java.util.*;

public class Apple {
    public int weight;
    public String color;

    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate pred) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple a:apples) {
            if (pred.test(a)) {
                result.add(a);
            }
        }
        return result;
    }
}

