import java.util.Arrays;

public class ChangeMaking {

	public static int minCoins(int[] coins, int amount){
		int[] dp = new int[amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = amount + 1;
		}
		dp[0] = 0;
		
		for (int i = 1; i <=amount; i++) {
			for (int coin : coins) {
				if (coin <= i) {
					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
	
	public static void main(String[] args) {
		int[] coins = {1, 3, 5}; // available coins
		int amount = 10; // amount
		int minCoinsNeeded = minCoins(coins, amount);
		if(minCoinsNeeded == -1) {
			System.out.println("The amount cannot be reached with the given coins.");
		}else {
            System.out.println("Minimum number of coins needed: " + minCoinsNeeded);
        }
		
	}	
}
