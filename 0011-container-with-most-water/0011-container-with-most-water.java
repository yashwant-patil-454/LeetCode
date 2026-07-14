class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
     int maximunArea=0;
       while(left<right){
          int currentArea= Math.min(height[left],height[right]) * (right-left);
          if(currentArea>maximunArea){
            maximunArea=currentArea;
          }

        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }


       }
       return maximunArea;
    }
    
}