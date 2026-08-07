static int sumOfDigits(int nums){
  if(num<=0){
  return 0;
}
return sumOfDigits(num/10)+num%10;
}
