package src.top100likedLeetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContinuousArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1};
        System.out.printf(""+findMaxLength(nums));
    }

    private static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxlen = 0, count = 0;
        for(int i = 0;i < nums.length;i++) {
            count += (nums[i] == 1)?1:-1;
            // Array from index 0 to i contains equal number of 0's and 1's
            if(count == 0)
                maxlen = Math.max(maxlen, i+1);
            if(map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else
                map.put(count, i);
        }
        return maxlen;
    }
}
