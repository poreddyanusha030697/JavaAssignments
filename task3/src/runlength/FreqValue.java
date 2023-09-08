package runlength;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreqValue {
	
	public static List<Integer> freqvalue(int[] nums) {
		int freq;
		int value;
		List<Integer> subnums = new ArrayList<>();
		
		if(nums.length%2==0) {
			for(int i = 0 ; i<nums.length; i+=2) {
				freq = nums[i];
				
				value = nums[i+1];
				
				for(int j = 0 ; j<freq ; j++) {
					
					subnums.add( value);
				}
				
				
			}
		}
		return subnums;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		List<Integer> result = freqvalue(nums);
		
			
			System.out.println("output Array: " + result);
		
		
	}

}
