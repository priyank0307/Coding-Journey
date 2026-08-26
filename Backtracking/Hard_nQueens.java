static int queens(boolean[][] board, int row){
  if(row==board.length){
    display(board);
    return 1;
  }
  int count=0;

  for(int col=0; col<board.length; col++){
    if(isSafe(board, row, col){
      board[row][col]=true;
      count+=queens(board, row+1);
      board[row][col]=false;
    }
  }
  return count;
}

private static void isSafe(board, row, col){
  for(int i=0; i<row; i++){
    if(board[i][col]){
      return false;
    }
  }

  int leftMax=Math.min(row, col);
  for(int i=1; i<leftMax; i++){
    if(board[row-i][col-i]){
      return false;
    }
  }

  int rightMax=Math.min(row, board.length-col-1);
  for(int i=1; i<rightMax; i++){
    if(board[row-i][col+i]){
      return false;
    }
  }

  return true;
}
  

  private static void display(boolean[][] board){
    for(boolean[] row:board){
      for(int element:row){
        if(element){
          System.out.print("Q ");
        }else{
          System.out.print("X ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  

  
