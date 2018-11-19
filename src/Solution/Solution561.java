package Solution;

import java.util.Arrays;

public class Solution561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = {3,4,2,1,6,4,7,8,120,12};
        System.out.println(arrayPairSum(num));
    }
}
