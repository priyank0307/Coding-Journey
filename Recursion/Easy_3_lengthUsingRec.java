    static int len(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return len(str.substring(1)) + 1;
    }

    public static void main(String[] args)
    {
        String str = "GeeksforGeeks";
        System.out.println(len(str));
    }
