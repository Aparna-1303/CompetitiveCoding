class Solution:
    def maxProfit(self, prices):
        min_value = prices[0]
        result = 0
        for i in range(1, len(prices)):
            min_value = min(min_value, prices[i])
            result = max(result, prices[i] - min_value)
        return result
        
