// import java.util.HashMap;
// class Day8{
//   public static int lengthOfLongestSubstring(String s) {
//         int i = 0;
//         int max = 0;
//         HashMap<Character,Integer> map = new HashMap();
//         for(int j = 0; j<s.length(); j++){
//             char ch = s.charAt(j);
//             if(map.containsKey(ch)){
//                 i = Math.max(i,map.get(ch)+1);
//             }
//             map.put(ch, j);
//             max = Math.max(max,j-i+1);
//         }
//         return max;
//     }
//   public static void main(String[] args) {
//     String s = "abcsgajgd";
//     System.out.println(lengthOfLongestSubstring(s));
//   }
// }

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k = 1;
//         for(int i = 1; i<nums.length; i++){
//             if(nums[i]!=nums[i-1]){
//                 nums[k++] = nums[i];
//             }
//         }
//         for(int j = 0; j<nums.length; j++){
//             System.out.println(nums[j]);
//         }
//         return k;
//     }
// }

//Check how many negative no.s are in a window size of 3 in an array:-

// class Day8{
//   public static int Solution(int[] arr){
//     int size = 3;
//     int k = 0;
//     for (int i = k; i<arr.length; i++) {

//     }
//   }
//   public static void main(String[] args) {
//     int[] arr = {1,2,-5,-5,-1,5,9};
//     Solution(arr);
      
//   }
// }