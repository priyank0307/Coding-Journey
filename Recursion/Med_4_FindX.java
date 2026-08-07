 static int findX(int n, int a) {
        if (n == 1)
            return 0;

        if (n % a != 0)
            return -1; 

        return 1 + findX(n / a, a);
    }
