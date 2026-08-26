class Solution {
    public int[] plusOne(int[] digits) {
        long sum=0;
        long j=digits.length-1;
        for(int i=0; i<digits.length; i++){
            sum+=Math.pow(10, j--)*digits[i];
        }
        sum+=1;
        String n=String.valueOf(sum);

        int[] increment=new int[n.length()];

        int index=n.length()-1;

        while(sum>0){
            int num=(int)(sum%10);
            increment[index--]=num;
            sum/=10;
        }

        return increment;
    }
}

//not optimal, very large test case mei fail ho jayega
