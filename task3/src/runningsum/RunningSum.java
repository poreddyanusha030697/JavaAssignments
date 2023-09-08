package runningsum;

public class RunningSum {
	

	
	public static int[] addition(int[] nums) {
		int result = 0;
		int[] runningarray = new int[nums.length];
		
		for(int sum = 0; sum < nums.length; sum++) {
			result +=  nums[sum];
			runningarray[sum] = result;
			
			}
		return runningarray;
			
		}
		
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] resultArray = addition(nums);
		for(int sum: resultArray) {
			System.out.println(sum);
		}
		
	
	
		
	}

}
