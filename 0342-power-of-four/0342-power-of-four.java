class Solution {
    public boolean isPowerOfFour(int n) {
        int mask = 0x55555555;
        if((n>0) && (n&(n-1))==0){
            if((n & mask)!= 0){
                return true;
            }
        }
        return false;
    }
}