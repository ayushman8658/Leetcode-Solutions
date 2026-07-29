class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
      
        
        Map<Integer, Integer> frequencyMap = new HashMap<>(k);
        
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            frequencyMap.merge(nums[i], 1, Integer::sum);
            currentSum += nums[i];
        }
      
       
        long maxSum = (frequencyMap.size() == k) ? currentSum : 0;
      
 
        for (int i = k; i < n; i++) {
       
            frequencyMap.merge(nums[i], 1, Integer::sum);
          
            
            int leftElement = nums[i - k];
            if (frequencyMap.merge(leftElement, -1, Integer::sum) == 0) {
                frequencyMap.remove(leftElement);
            }
          
            
            currentSum = currentSum + nums[i] - nums[i - k];
          
           
            if (frequencyMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
      
        return maxSum;
    }
}