class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        final int magic = 665772;
        for(int i = left;i<=right;++i){
            if((magic>>Integer.bitCount(i)&1)==1){
                count=count+1;
            }
        }
        return count;
    }
}