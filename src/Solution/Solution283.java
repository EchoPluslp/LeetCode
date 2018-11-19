package Solution;

/*
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
 */
public class Solution283 {
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int currNotZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currNotZero++] = nums[i];
            }
        }
        while (currNotZero < nums.length) {
            nums[currNotZero++] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


    public static void main(String[] args) {
        int[] x = {0, 0, 1,0, 0, 4};
        moveZeroes(x);
    }
}
