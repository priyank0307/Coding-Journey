public static void main(String[] args){
  diamond(5);
  diamondInverse(4);
}

static void diamond(int n){
  if(n==0){
    return;
  }

diamond(n-1, index);
for(int i=0; i<n; i++){
  System.out.print("*"):
    }
  System.out.println();
}

static void diamondInverse(int n){
  if(n==0){
    return;
  }

for(int i=0; i<n; i++){
  System.out.print("*"):
    }
  System.out.println();
  diamondInverse(n-1);
}


//input: 
(5)
(4)  
//output
*
**
***
****
*****  
****  
***
**
*
  
Concept used here is stack memory allocation. like the calling part is super imp
  
