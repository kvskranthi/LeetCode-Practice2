class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t_g = 0;
        int c_g = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            t_g += gas[i] - cost[i];
            c_g += gas[i] - cost[i];

            if (c_g < 0) {
                start = i + 1;
                c_g = 0;
            }
        }

        return t_g >= 0 ? start : -1;
    }
}