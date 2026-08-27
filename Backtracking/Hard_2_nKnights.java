public static void main(Strings[] args){
  int n=4;
  boolean[][] board=new boolean[n][n];
  nKinghts(board, 0, 0, 4);
}

static void nKinghts(boolean[][] board, int row, int col, int knights){
  if(knights==0){
    display(board);
    System.out.println();
    return;
  }

  if(row==board.length && col==board.length-1){
    return;
  }

if(col==board.length){
  nKnights(board, row+1, 0, knights);
}

  if(isSafe(board, row, col){
    board[row][col]=true;
    nKnights(board, row, col+1, knights-1);
    board[row][col]=false;
  }
  nKnights(board, row, col+1, knights);
}

static boolean isValid(boolean[][] board, int row, int col){
  if(row>=0 && row<board.length && col>=0 && col<board.length){
    return true;
  }
  return false;
}

private static boolean isSafe(boolean[][] board, int row, int col){
  
  if(iValid(board, row-2, col-1){
    if(board[row-2][col+1]{
      return false;
    }
  }

  if(iValid(board, row-2, col+1){
    if(board[row-2][col-1]{
      return false;
    }
  }

  if(iValid(board, row-2, col-2){
    if(board[row-2][col+1]{
      return false;
    }
  }

  if(iValid(board, row-1, col+2){
    if(board[row-2][col+1]{
      return false;
    }
  }

  return true;
}

private static void 
    
