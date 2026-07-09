class Solution {
    public int removeDuplicates(int[] nums) {
        int rd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                nums[rd+1]=nums[i];
                rd++;
            }
        }
        return ++rd;
    }
}