package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurence {
    public static void main(String[] args) {
        String input = "Vamsisaiiii";
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int cnt = map.get(ch);
                map.put(ch, cnt + 1);
            }
        }
            System.out.println("Occurance of each chacter :" +map);


    }
}
