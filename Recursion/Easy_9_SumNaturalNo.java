 public static int recurSum(int n){
        
        if (n == 0)
            return 0;
            
        return n + recurSum(n - 1);
    }

    public static void main(String args[]){
        int n = 3;
        System.out.println(recurSum(n));
    }
