package src.top100likedLeetcode.backtrack;

import java.util.ArrayList;
import java.util.List;


public class GenerateParantheses {
    public static void main(String[] args) {
        int n =2;
        List<String> ans = generatePanatheses(n);
        for (String str : ans){
            System.out.println(str);
        }
    }

    private static List<String> generatePanatheses(int n) {
        List<String> ans = new ArrayList<>();
        recurse(ans,0,0,"",n);
        return ans;
    }

    private static void recurse(List<String>ans,int left, int right, String s, int n) {
        if(s.length()==(n*2)){
            ans.add(s);
            return;
        }
        if(left<n){
            recurse(ans,left+1,right,s+"(",n);
        }
        if(right<left){
            recurse(ans,left,right+1,s+")",n);
        }
    }
}
