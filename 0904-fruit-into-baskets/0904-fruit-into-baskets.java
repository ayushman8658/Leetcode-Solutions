class Solution {
     public int totalFruit(int[] fruits) {
        
        Map<Integer, Integer> fruitCount = new HashMap<>();
      
       
        int maxFruits = 0;
      
        
        int left = 0;  
      
        for (int right = 0; right < fruits.length; right++) {
         
            int currentFruit = fruits[right];
            fruitCount.merge(currentFruit, 1, Integer::sum);
          
           
            while (fruitCount.size() > 2) {
                int leftFruit = fruits[left];
                left++;
                if (fruitCount.merge(leftFruit, -1, Integer::sum) == 0) {
                    fruitCount.remove(leftFruit);
                }
            }
          
            
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
      
        return maxFruits;
    }
}