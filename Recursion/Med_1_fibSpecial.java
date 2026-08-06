public static void main(String[] args){
        System.out.println(fibSpecial(5, 7, 5));
}

static int fibSpecial(int a, int b, int n){
        if(n%3==0) return a;
        if(n%3==1) return b;

        return fibSpecial(a, b, n-1)^fibSpecial(a, b, n-2);
}
