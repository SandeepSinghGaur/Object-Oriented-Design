package src.DailyLeetcode;

public class Question779 {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        System.out.println(kthGrammar(n,k));
    }

    private static int kthGrammar(int n, int k) {
        if(n==1) return 0;
        StringBuffer sb = new StringBuffer();
        sb.insert(0,'0');
        int ans = findKthGrammer(n-1,k,sb);
        return ans;
    }

    private static int findKthGrammer(int n, int k, StringBuffer sb) {
        if(n==0){
            if(sb.charAt(k-1)=='0'){
                return 0;
            }else{
                return 1;
            }
        }
        int sz = sb.length();
        StringBuffer localString = new StringBuffer();
        for(int i=0;i<sz;i++){
            if(i==0){
                localString.insert(i,"01");
            }else if(sb.charAt(i)=='0'){
                if(i==sz-1){
                    localString.append('0');
                    localString.append('1');
                }else{
                    localString.insert(i+2,"01");
                }
            }else{
                if(i==sz-1){
                    localString.append('1');
                    localString.append('0');
                }else{
                    localString.insert(i+2,"10");
                }
            }
        }
        sb = localString;
        return findKthGrammer(n-1,k,sb);
    }
}
