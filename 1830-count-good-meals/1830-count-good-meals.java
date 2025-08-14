import java.util.*;
class Solution {
    public int countPairs(int[] deliciousness) {
        final int MOD = 1_000_000_007;
        Map<Integer, Integer> countMap = new HashMap<>();
        long pairs = 0;
        int maxVal = 0;
        for (int val : deliciousness) {
            maxVal = Math.max(maxVal, val);
        }
        int maxSum = maxVal * 2;
        for (int x : deliciousness) {
            int power = 1;
            while (power <= maxSum) {
                int complement = power - x;
                if (countMap.containsKey(complement)) {
                    pairs += countMap.get(complement);
                    pairs %= MOD;
                }
                power <<= 1; 
            }
           countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }
        return (int) pairs;
    }
}
