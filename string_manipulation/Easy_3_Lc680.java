//not an optimal sol

class Solution {
    public boolean validPalindrome(String s) {
        if(isPalin(s)==true){
            return true;
        }

        for(int i=0; i<s.length(); i++){
            String str="";
            for(int j=0; j<s.length(); j++){
                if(i!=j){
                    str+=s.charAt(j);
                }
            }

            if(isPalin(str)==true){
                return true;
            }
        }
        return false;
    }

    static boolean isPalin(String s){
        int i=0; 
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }else{
                return false;
            }
        }
            return true;
    }
}
