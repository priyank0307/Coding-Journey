public static void main(String[] args){
  pyramid(4, 0);
}

statuc void pyramid(int row, int col){
  if(col<row-1){
    System.out.print(" ");
    pyramid(row, col+1);
  }else{
    for(int i=0; i<5-row+1; i++){
      System.out.print("* ");
    }
    System.out.println();
    pyramid(row-1, 0);
  }
}



//output:

   *
  * *
 * * *
* * * *     
     
