package src.DailyLeetcode.month01january2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class January04 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,3,2,2,4,2,3,4};
       int ans = minOperations(nums);
        System.out.println(ans);
    }

    private static int minOperations(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> countFrequency = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(countFrequency.containsKey(nums[i])){
                countFrequency.put(nums[i],countFrequency.get(nums[i])+1);
            }else{
                countFrequency.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : countFrequency.entrySet()){
            int count = entry.getValue();
            if(count==1) return -1;
               int r1 = count%3;
               int x1 = count/3;
               if(r1 == 0 ){
                   ans+=x1;
               }else if(r1==1){
                   ans+=(x1-1)+2;
               }
               else {
                   ans+=x1+1;
               }
        }
        return ans;
    }
}
