class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers: left starting from beginning, right from end
        int left = 0;
        int right = s.length - 1;
      
        // Continue swapping until the pointers meet in the middle
        while (left < right) {
            // Swap characters at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
          
            // Move pointers towards the center
            left++;
            right--;
        }
    }
}