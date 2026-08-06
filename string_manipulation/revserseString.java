class Solution {
    public void reverseString(char[] s) {
        int index=0;

        while(index<s.length/2){
            char temp=s[s.length-index-1];
            s[s.length-index-1]=s[index];
            s[index]=temp;
            index+=1;
        }
        System.out.println(s);
    }
}
