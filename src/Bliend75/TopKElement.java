package src.Bliend75;

import java.util.*;

public class TopKElement {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,-1};
        int k =1;
        int[] ans = topKFrequent(arr,k);
        for(int i : ans){
            System.out.println(i);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> unsortedMap = new HashMap<>();
        int[] ans = new int[k];
        for(int i : nums){
            if(unsortedMap.containsKey(i)){
                unsortedMap.put(i,(unsortedMap.get(i)+1));
            }else{
                unsortedMap.put(i,1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
        Collections.sort(entryList, (entry1, entry2) -> -entry1.getValue().compareTo(entry2.getValue()));

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Display the sorted map
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : entryList) {
            if(k==0) return ans;
            ans[k-1] = entry.getKey();
            k--;
        }
        return ans;



    }
}
