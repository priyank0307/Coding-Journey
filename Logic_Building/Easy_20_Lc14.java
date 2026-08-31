class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word=strs[0];
        for(int i=0; i<strs.length; i++){
            String com="";
            String str=strs[i];

            int n=Math.min(word.length(), str.length());
            for(int j=0; j<n; j++){
                if(strs[i].charAt(j)!=word.charAt(j)){
                    break;
                }else{
                    com+=strs[i].charAt(j);
                }
            }
            word=com;
        }

        return word;
    }
}

//not optimal
