from typing import List
from heapq import heapify, heappush, heappop

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        
        max_heap = [(-value, index) for index, value in enumerate(nums[:k - 1])]
        heapify(max_heap)
      
        result = []
      
       
        for i in range(k - 1, len(nums)):
           
            heappush(max_heap, (-nums[i], i))
          
            
            while max_heap[0][1] <= i - k:
                heappop(max_heap)
          
            
            result.append(-max_heap[0][0])
      
        return result