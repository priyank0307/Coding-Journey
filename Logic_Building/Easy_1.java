public static void main(String[] args){
  int[] arr={1, 3, -1};
  int max=0;  

  for(int i=0; i<arr.length; i++){
    for(int j=0; j<arr.length; j++){
      if(Math.abs(arr[i]-arr[j])+Math.abs(i-j)>max){
        max=Math.abs(arr[i]-arr[j])+Math.abs(i-j);
      }
    }    
  }

System.out.println(max);
}
