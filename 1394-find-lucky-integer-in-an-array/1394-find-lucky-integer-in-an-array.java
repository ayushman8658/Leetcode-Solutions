class Solution {
    public int findLucky(int[] arr) {
        int[] cnt=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=arr.length){
                ++cnt[arr[i]];
            }
        }
        for (int i = arr.length; i >= 1; --i)
            if (cnt[i] == i)
                return i;

        return -1;
    }
}