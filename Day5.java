//Day 5 :- 

//check the sum of the sub elements in an array  equal to the tgt value

// class Day5{
//   public static void main(String[] args) {
//       int[] arr = {2,7,9,0,5};
//       int tgt = 9;
//       for (int i = 0; i<arr.length; i++) {
//           int temp = tgt - arr[i];
//           for (int j = 0; j<arr.length; j++) {
//               if (j==temp) {
//                   System.out.println(arr[i]);
//                   System.out.println("and");
//                   System.out.println(temp);
//                   System.out.println("");
//               }
//           }
//       }
//   }
// }


// In leetcode:- 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i<nums.length; i++){
//             int temp = target - nums[i];
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[j]==temp){
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }


//with a single loop:- 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i<nums.length; i++){
//             int diff = target - nums[i];
//             if(map.containsKey(diff)){
//                 return new int[] {map.get(diff), i};
//             }
//             map.put(nums[i],i);
//         }
//         return new int[]{};
//     }
// }

//Median of the two merged sorted array:- 
// class Day5{
//   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] temp = new int[nums1.length+nums2.length];
//         int median = 0;
//         for(int i = 0; i<nums1.length; i++){
//             temp[i] = nums1[i];
//         }
//         for(int j = 0; j<nums2.length; j++){
//             temp[nums1.length+j] = nums2[j];
//         }
//         Arrays.sort(temp);
//         median = temp.length;
//         if(temp.length%2==0){
//             return (temp[median/2]+temp[median/2-1])/2.0;
//         }
//         else{
//             return temp[median/2];
//         }
//     }
//   public static void main(String[] args) {
//     int[] nums1 = {1,2,3,4,5};
//     int[] nums2 = {6,7,8,9,0};
//     findMedianSortedArrays(nums1, nums2);
//   }

// }

    