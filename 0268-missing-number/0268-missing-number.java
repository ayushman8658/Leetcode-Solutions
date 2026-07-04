class Solution {
    public int missingNumber(int[] nums) {
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        // }
        // int actualsum=(nums.length*(nums.length+1)/2);
        // int missingsum=actualsum-sum;
        // return missingsum;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int actualsum=(n*(n+1))/2;
        int missNumber=actualsum-sum;
        return missNumber;
    }

}