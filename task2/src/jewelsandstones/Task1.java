package jewelsandstones;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static int numJewelsInStones(String jewels, String stones) {
       
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int numJewels = 0;

        
        for (char stone : stones.toCharArray()) {
          
            if (jewelSet.contains(stone)) {
                numJewels++;
            }
        }

        return numJewels;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }
}
