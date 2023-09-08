package candies;


import java.util.ArrayList;
import java.util.List;

public class MaxCandy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        System.out.println(maxCandies);

     
        List<Boolean> result = new ArrayList<>();

       
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {
    	MaxCandy maxcandy = new MaxCandy();

       
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = null;
		try {
			result = MaxCandy.kidsWithCandies(candies, extraCandies);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
        System.out.println(result);
    }
}
