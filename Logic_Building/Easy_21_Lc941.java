class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }

        int n=0;
        if(arr[0]>arr[1]){
            return false;
        }

        if(arr[arr.length-1]>arr[arr.length-2]){
            return false;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                continue;
            }else{
                n=i;
                break;
            }
        }

        for(int i=n; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
