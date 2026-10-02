class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int sum=money;
        int cnt=0;
        for(int i=0; i<2; i++){
            if(sum>0 && prices[i]<money){
                sum-=prices[i];
                cnt++;
            }
        }

        if(cnt==2 && sum>=0){
            return sum;
        }
        return money;
    }
}
