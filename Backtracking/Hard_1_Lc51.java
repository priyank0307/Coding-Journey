class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();

        boolean[][] board=new boolean[n][n];
        queens(board, 0, ans);

        return ans;
    }

    private static void queens(boolean[][] board, int row, List<List<String>> ans){
        if(row==board.length){
            ans.add(construct(board));
            return;
        }

        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col]=true;
                queens(board, row+1, ans);
                board[row][col]=false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col){

        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        int leftMax=Math.min(row, col);
        for(int i=1; i<=leftMax; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int rightMax=Math.min(row, board.length-col-1);
        for(int i=1; i<=rightMax; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static List<String> construct(boolean[][] board){
        List<String> res=new ArrayList<>();

        for(boolean[] row:board){
            StringBuilder sb=new StringBuilder();
            for(boolean element:row){
                if(element){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}
