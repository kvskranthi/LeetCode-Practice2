import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);

        int k = 1;
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                ans[0] = nums[i];
            }
            else if (nums[i] != k) {
                ans[1] = k;
                k = nums[i]; 
            }

            k++;
        }

        if (ans[1] == 0) {
            ans[1] = nums.length;
        }

        return ans;
    }
}
