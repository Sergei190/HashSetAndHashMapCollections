import java.util.HashMap;
import java.util.Map;

public class Main {
    static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
            "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        int value = 0;
        char c = 0;

        for (int i = 0; i < TEXT.length(); i++) {
            if (Character.isLetter(TEXT.charAt(i))) {
                if (!map.containsKey(TEXT.charAt(i))) {
                    map.put(TEXT.charAt(i), value);
                }
            }
        }
        int max = -1;

        for (Map.Entry<Character, Integer> ci : map.entrySet()) {
            if (max < ci.getValue()) {
                max = ci.getValue();
                c = ci.getKey();
            }
        }
        System.out.println("Максимальное значение: " + c + ", равен " + max);

        int min = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> ci : map.entrySet()) {
            if (min > ci.getValue()) {
                min = ci.getValue();
                c = ci.getKey();
            }
        }
        System.out.println("Минимальное значение: " + c + ", равен " + min);
    }
}