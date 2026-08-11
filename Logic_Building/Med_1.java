puclic static void main(String[] args){
  int maxPlus=Integer.Min_Value;
  int minPlus=Integer.Max_Value;
  int maxMinus=Integer.Min_Value;
  int minMinus=Integer.Max_Value;

  for(int i=0; i<arr.length; i++){
    maxPlus=Math.max(maxPlus, arr[i]+i);
    minPlus=Math.min(minPlus, arr[i]+i);
    
    maxMinus=Math.max(maxMinus, arr[i]-i);
    maxMinus=Math.min(minMinus, arr[i]-i);
  }

int ans1=maxPlus-minPlus;
int ans2=maxMinus-minMinus;

int res=Math.max(ans1, ans2);
System.out.println(res);
}
