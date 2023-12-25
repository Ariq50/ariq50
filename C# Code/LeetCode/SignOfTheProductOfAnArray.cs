public class Solution {
    public int ArraySign(int[] nums) {
        int negativeNums = 0;
        bool containsZero = false;
        int product = 0;
        
        for(int i = 0; i < nums.Length; i++)
        {
            if(nums[i] < 0)
            {
                negativeNums++;
            } else if(nums[i] == 0)
            {
                containsZero = true;
            }
        }
        if(containsZero)
        {
            product = 0;
        }
        else if(!(containsZero))
        {
            if((negativeNums % 2) == 0)
            {
                product = 1;
            } else {
                product = -1;
            }
        }
    return product;
    }
}
