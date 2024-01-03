package src.dsaNotes.arrays;

/*
Ques-: Given an array of size and a positive integer such that K<N;

Note : Without taking any extra space


Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]


Constraints:

1 <= nums.length <= 10^5
-2^31 <= nums[i] <= 2^31 - 1
0 <= k <= 10^5
 */


import java.util.Arrays;
import java.util.List;

public class RotationGame {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        for(int num : rotateNums(nums,k)){
            System.out.printf(" "+num);
        }

    }

    private static int[] rotateNums(int[] nums, int k) {
        int n = nums.length;
        if(k>nums.length){
            k = k%n;
        }
        if(k==0) return nums;
        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
        return nums;
    }

    private static void rotate(int[] nums, int low, int high) {
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

}
