class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       if(n==0){
        return;
       }
       k=k%n;
       if(k>n)
       return;
       //create a temp array with k length
       int temp[]=new int[k];
       //adding the element to the temp array
       for(int i=n-k;i<n;i++){
        temp[i-n+k]=nums[i];

       }
       //shift the element in original array
       for(int i=n-k-1;i>=0;i--){
        nums[i+k]=nums[i];

       }
       //copy the temp array elements to original array
       for(int i=0;i<k;i++){
        nums[i]=temp[i];
       }
        
    }
}