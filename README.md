# Java-ChangeMaking-Problem-DynamicProgramming-Example

This Java code utilizes dynamic programming to solve the "Change Making Problem". It aims to minimize the number of coins or banknotes used to reach a specified sum using given denominations. Through nested loops, it calculates the minimum number of coins for each amount and stores them in a dynamic programming array. If the desired sum cannot be achieved, it returns -1. Its usage is straightforward: the minCoins function calculates the minimum number of coins for a given amount. This code provides a solution to the problem and can be adapted for various currencies or target amounts.

Pseudo code: 


    Function minCoins(coins[], amount):
    // Create an array to store the minimum number of coins for each amount
    dp[0...amount]

    // Initialize the dp array with a large value (amount + 1) for each amount
    for i = 1 to amount:
        dp[i] = amount + 1

    // Base case: Minimum number of coins needed for 0 amount is 0
    dp[0] = 0

    // Calculate the minimum number of coins needed for each amount
    for i = 1 to amount:
        for each coin in coins:
            if coin <= i:
                dp[i] = min(dp[i], dp[i - coin] + 1)

    // If dp[amount] is still greater than amount, it means the amount cannot be reached
    if dp[amount] > amount:
        return -1
    else:
        return dp[amount]
