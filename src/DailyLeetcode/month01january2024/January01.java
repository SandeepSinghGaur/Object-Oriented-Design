package src.DailyLeetcode.month01january2024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class January01 {
    public static void main(String[] args) {
        int[] g = new int[]{10,9,8,7};
        int[] s = new int[]{5,6,7,8};
        int ans = assignCookies(g,s);
        System.out.println("Answer:"+" "+ans);
    }

    private static int assignCookies(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<s.length;i++){
            pq.add(s[i]);
        }
        for(int i=0;i<g.length && pq.size()>0 ;i++){
            int item = g[i];
            while(pq.size()>0 && pq.peek()<item){
                pq.poll();
            }
            if(pq.size()>0 && pq.remove()>=item){
                ans++;
            }

        }
        return ans;
    }
}
