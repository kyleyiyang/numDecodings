class Solution {
    public int numDecodings(String s) {
        if (s==null || s.length()==0) return 0;
        int[] ans=new int[s.length()+1];
        ans[0]=1;
        ans[1]=s.charAt(0)=='0'?0:1;
        for (int i=2;i<=s.length();i++) {
            int first=Integer.valueOf(s.substring(i-1,i));
            int second=Integer.valueOf(s.substring(i-2,i));
            if (first>=1 && first<=9) ans[i]+=ans[i-1];
            if (second>=10 && second<=26) ans[i]+=ans[i-2];
        }
        return ans[s.length()];
    }
}
