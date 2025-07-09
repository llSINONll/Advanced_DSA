//Container with most water:- 

// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0;
//         int right = height.length-1;
//         int maxArea = 0;
//         while(left<right){
//             int h = Math.min(height[left], height[right]);
//             int width = right - left;
//             int area = h * width;
//             maxArea = Math.max(maxArea, area);
//             if(height[left]<height[right]){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         } 
//         return maxArea;
//     }
// }

//Find the largest sum of the subarray in which 3 elements comes continously

// class Day6{
//   public static void main(String[] args) {
//       int[] arr = {5,4,-1,7,8};
//       int size = 3;
//       int maxSum = 0;
//       int n = arr.length;
//       for(int i = 0; i<=n-size; i++){
//           int currSum = 0;
//           for (int j = i; j<i+size; j++) {
//               currSum+=arr[j];
//               maxSum = Math.max(currSum, maxSum);
//           }
          
//       }
//       System.out.println(maxSum);
//   }
// }

//Sliding window:- 

// class Day6{
//   public static void main(String[] args) {
//       int[] arr = {1,2,3,4,5,6};
//       int size = 3;
//       int n = arr.length;
//       int windowSum=0;
//       int max = 0;
//       for (int i = 0; i<size; i++) {
//         windowSum+=arr[i]; 
//       }
//       for (int j = size; j<n; j++) {
//           windowSum+=arr[j]-arr[j-size];
//           if (windowSum>max) {
//               max = windowSum;
//           }
//       }
//       System.out.println(max);
//   }
// }


//Kadane's Algorithm:- 

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currSum = 0;
//         int maxSum = nums[0];
//         for(int num : nums){
//             currSum = Math.max(num,currSum+num);
//             maxSum = Math.max(currSum, maxSum);
//         }
//         return maxSum;
//     }
// }