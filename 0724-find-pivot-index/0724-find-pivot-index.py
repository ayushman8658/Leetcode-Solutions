class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        # Initialize left sum as 0 and right sum as total sum of array
        left_sum = 0
        right_sum = sum(nums)
      
        # Iterate through each element with its index
        for index, current_value in enumerate(nums):
            # Subtract current element from right sum (exclude it from right side)
            right_sum -= current_value
          
            # Check if left sum equals right sum (current element is the pivot)
            if left_sum == right_sum:
                return index
          
            # Add current element to left sum for next iteration
            left_sum += current_value
      
        # No pivot index found
        return -1
