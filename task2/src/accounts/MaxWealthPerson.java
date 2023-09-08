package accounts;

public class MaxWealthPerson {
	
	public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
    	MaxWealthPerson maxwealthperson = new MaxWealthPerson();

        // Example usage
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        int maxWealth = 0;
		try {
			maxWealth = MaxWealthPerson.maximumWealth(accounts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(maxWealth);

}
}
