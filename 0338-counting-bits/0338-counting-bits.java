class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n + 1]; 
        for (int i = 0; i <= n; i++) {
            int count = 0;
            String bs = Integer.toBinaryString(i);
            for (char m : bs.toCharArray()) {
                if (m == '1') {
                    count++;
                }
            }
            a[i] = count;
        }
        return a;
        
        // int[] dp=new int[n+1];
        // for(int i=0;i<=n;i++){
        //     dp[i]= dp[i>>1]+(i&1);
        // }
        // return dp;
    }
}
