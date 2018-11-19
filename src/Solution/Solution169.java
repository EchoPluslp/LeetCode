package Solution;

import java.util.HashMap;

public class Solution169 {
    // 出现次数> n/2
    //high
    public static int majorityElement(int[] nums) {
        int cnt = 1;
        int base = nums[0];
        for(int i=1;i<nums.length;i++){
            if(base==nums[i]){
                cnt++;
            } else {
                cnt--;
                if(cnt==0){
                    base=nums[i];
                    cnt++;
                }
            }
        }
        return base;
    }

    public static void main(String[] args) {
        int[] temp = {1,1,1,1,1,1,1,1,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2};
        System.out.println(temp.length);

        System.out.println(majorityElement(temp));
    }
}
