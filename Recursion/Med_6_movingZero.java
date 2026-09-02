static void moveZero(int[] arr, int index, int last){  
  if(index>=last){  
   System.out.println(Arrays.toString(arr));
   return;
  }

if(arr[last]==0){
  moveZero(arr, index, last-1);
}else if(arr[index]==0){
  int temp=arr[index];
  arr[index]=arr[last];
  arr[last]=temp;

  moveZero(arr, index, last-1);
}else{
  moveZero(arr, index+1, last);
}
}
