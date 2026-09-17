class Solution {       
    public List<String> restoreIpAddresses(String s) {
        List<String> list=new ArrayList<>();
        String str="";
        backtrack(s, str, list, 0, 0);

        return list;  
    }

    private static void backtrack(String s, String str, List<String> list, int index, int dotCnt){
        if(dotCnt==4 && index==s.length()){
            list.add(str.substring(0, str.length()-1));
            return;
        }

        if(dotCnt==4) return;

        for(int i=1; i<=3; i++){

            //not enough charcters left
            if(index+i>s.length()) break;

            //putting in a group of three
            String str1=s.substring(index, index+i);

            //for trailing zeros
            if(str1.length()>1 && str1.charAt(0)=='0') continue;

            //0 to 255 check
            if(Integer.parseInt(str1)>=0 && Integer.parseInt(str1)<=255){
                backtrack(s, str+str1+".", list, index+i, dotCnt+1);
            }

        }
    }
}
