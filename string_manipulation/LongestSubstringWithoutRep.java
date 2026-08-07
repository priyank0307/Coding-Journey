class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str1="";
        char[] ch=s.toCharArray();
        int cnt=0;
        int maxNo=0;

        for(int i=0; i<=ch.length-1; i++){
            String alpha=Character.toString(ch[i]);
            if(str1.contains(alpha)){
                str1=str1.substring(str1.indexOf(alpha)+1);
            }
            str1=str1+alpha;
            maxNo=Math.max(maxNo, str1.length());
        }
        

        return maxNo;
    }
}
