package shuffle;

public class ShuffleString {
	
	public String shuffle(String str,int[]arr) {
		
		char[] Shufflestring = new char[str.length()];
		
		
		
		for(int i=0; i<str.length(); i++) {
			Shufflestring[arr[i]] = str.charAt(i);
			
			
		}
		
		return new String(Shufflestring);
		

			
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ShuffleString shufflestring = new ShuffleString();
		
		int[] arr = {5,3,4,0,1,2};
		
		String str = "anusha";
		String result = shufflestring.shuffle(str, arr);
		System.out.println("output String: " + result);
		
	}

}
