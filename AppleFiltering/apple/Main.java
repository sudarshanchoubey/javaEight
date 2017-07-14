package apple;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Apple greenApple = new Apple();
        greenApple.color = "green";
        Apple otherApple = new Apple();
        otherApple.color = "red";
        ArrayList<Apple> inventory = new ArrayList<>();
        inventory.add(greenApple);
        inventory.add(otherApple);
        ApplePredicate p = new GreenApplePredicate();
        List<Apple> result = Apple.filterApples(inventory, p);
        for(Apple a:result) {
            System.out.println(a.color);
        }
    }
}
