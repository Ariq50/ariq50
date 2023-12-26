public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] indices = [];

        for(int i = 0; i < nums.Length; i++)
        {
            for(int j = 0; j < nums.Length - 1; j++)
            {
                if((nums[i] + nums[j]) == target && i != j)
                {
                    indices = [i, j];
                }
            }
        }
        return indices;
    }
}
