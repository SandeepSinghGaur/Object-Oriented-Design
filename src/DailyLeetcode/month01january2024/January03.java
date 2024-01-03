package src.DailyLeetcode.month01january2024;

import java.util.ArrayList;

public class January03 {
    public static void main(String[] args) {
        String[] bank = new String[]{"011001","000000","010100","001000"};
        int ans = numberOfBeams(bank);
        System.out.println(ans);

    }

    private static int  numberOfBeams(String[] bank) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int count = 0;
            for(int j =0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count!=0){
                al.add(count);
            }

        }
        System.out.println(al);
        int ans = 0;
        for(int i=0;i<=al.size()-2;i++){
            int res = al.get(i)*al.get(i+1);
            ans+=res;

        }
        return ans;
    }
}
