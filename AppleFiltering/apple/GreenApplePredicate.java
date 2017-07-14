package apple;

public class GreenApplePredicate implements ApplePredicate {
    public boolean test(Apple apple) {
       return ("green".equals(apple.color));
    }
}
