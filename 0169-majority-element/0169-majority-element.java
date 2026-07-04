class Solution {
    public int majorityElement(int[] nums) {
   int n=nums.length;
   int count=0;int element=0;
   for(int i=0;i<n;i++){
    if(count==0){
        count=1;
        element=nums[i];
    }
    else if(nums[i]==element){
        count++;
    }
    else{
        count--;
    }
    
   }
   int cn1=0;
   for(int i=0;i<n;i++){
    if(nums[i]==element){
        cn1++;
    }
   }
   if(cn1>n/2)return element;
   return -1;
    }

}
