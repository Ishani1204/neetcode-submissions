class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxWater = 0;
        int left = 0; 
        int right = n -1;

        while(left < right){
        int width = right - left;
        int minHeight = Math.min(heights[left], heights[right]);
        maxWater = Math.max(maxWater, width*minHeight);

        if(heights[left] < heights[right]){
            left ++ ;
        } else {
            right --;
        }
        }

        return maxWater;
    }
}
