
//   public static void main(String[] args) {
//     System.out.println("Hello");
//     for(int i=0; i<5; i++){
//       System.out.println(i);
//     }
//     int[] arr={1,2,3,4,5};
//     for (int i=arr.length-1; i>=0; i--){
//       System.out.println(arr[i]);
//     }
//   }
// }

//     //#1 Max value of the array
//     // int[] arr={3,2,8,6};
//     // int max=arr[0];
//     // for (int i=0; i<arr.length; i++){
//     //   if(arr[i]>max){
//     //     max=arr[i];
//     //   }
//     // }
//     // System.out.println(max);

//     //#2 Sum of the array
//     // int[] arr={3,5,2,6,7,3,7};
//     // int sum = 0;
//     // for (int i=0; i<arr.length; i++){
//     //   sum+=arr[i];
//     // }
//     // System.out.println(sum);


//   }
  
// 
// import java.util.Scanner;
// public class index{
//   public static void main(String[] args) {
//     Scanner in =new Scanner(System.in);
//       System.out.println("Enter size of the array");
//       int n= in.nextInt();
//       int[] arr=new int[n];
//       for (int i = 0; i<n; i++) {
//         System.out.println("Enter the Element: ");
//         arr[i]=in.nextInt();
//       }
//       for(int k=0; k<arr.length; k++){
//         System.out.println(arr[k] +"   "+"elem");
//       }
//   }
// }




//Day2


// class index{
//   public static void main(String[] args) {
//       int[] arr1={1,2,3,4,5};
//       int[] arr2={4,2,4,2,4};
//       int sum = 0;
//       for (int i = 0; i<arr1.length; i++) {
//         sum+=arr1[i]+arr2[i];
//       }
//       System.out.println(sum);
//   }
// }

// class index{
//   public int Sum(arr1,arr2){
//     int sum = 0;
//     for (int i = 0; i<arr1.length; i++) {
//         sum+-=arr1[i]+arr2[i];
//     }
//     return 0;
//   }
//   public static void main(String[] args) {
//     int[] arr1 = {1,2,3,4,5};
//     int[] arr2 = {4,2,4,2,4};
//     Sum(arr1,arr2);
//   }
// }

// class index{
//   public static void main(String[] args) {
//     int[] arr1 = {1,2,3,4,5};
//     int[] arr2 = {4,2,4,2,4};
//     int[] arr3 = new int[arr1.length+arr2.length];

//     for(int i = 0; i<arr1.length; i++) {
//         arr3[i]=arr1[i];
//     }
//     for(int k = 0; k<arr2.length; k++) {
//         arr3[arr1.length+k]=arr2[k];
//     }
//     for(int j = 0; j<arr1.length+arr2.length; j++) {
//       System.out.println(arr3[j]);
//     }
//   }
// }

// class index{
//   public static void main(String[] args) {
//     int[] arr1 = {1,2,3,4,5,2};
//     int[] arr2 = {4,2,4,2,4};
//     int[] common = {arr1.length+arr2.length};
//     for (int i = 0 ; i<arr1.length; i++) {
//       for (int j = 0; j<arr2.length; j++) {
//         if(arr1[i]==arr2[j]){
//           System.out.println(arr1[i]);
//           break;
//         }
//       }     
//     }
//     for (int l = 0; l<common.length; l++) {
//       System.out.println(common[l]);
//     }
//   }
// }

// class index{
//   public static void main(String[] args) {
//       int[] arr1 = {1,2,3,4,2,5};
//       int[] arr2 = {4,2,4,2,4};

//       for (int i = 0; i<arr1.length; i++) {
//         for (int j = 0; j<arr2.length; j++) {
//             if(arr1[i]!=arr2[j]){
//               System.out.println(arr1[i]);
//               break;
//             }          
//           }
//         }
//       }
//   }


// class index{
//    public static void main(String[] args) {
//        int[] a1={12,23,45,74,54};
//        int[] a2={10,12,45,64,21};
//        boolean isUnique=false;
//        for(int i=0;i<a1.length;i++){
//         for(int j=0;j<a2.length;j++){
//             if(a1[i]==a2[j]){
//               isUnique=false;
//               break;
//             }
//             else{
//               isUnique=true;
//             }
//         }
//         if(isUnique){
//           System.out.println(a1[i]);
//         }
//        }
//    }
// }

// class index{
//   public static void main(String[] args) {
//       int[] a1={12,45,65,48,24,6,9};
//       int max = 0;
//       for(int i=0;i<a1.length;i++){
//           if(a1[i]>max){
//             max = a1[i];
//           }
//       }
//       System.out.println("First maximum value : "+max);
//       int newmax=0;
//       for(int i=0;i<a1.length;i++){
//           if(a1[i]<max && a1[i]>newmax){
//              newmax = a1[i];
//           }
//       }
//       System.out.println("Second maximum value :" +newmax);
//       int new1max=0;
//       for(int i=0;i<a1.length;i++){
//           if(a1[i]<newmax && a1[i]>new1max){
//              new1max = a1[i];
//           }
//       }
//       System.out.println("Third maximum value : "+new1max);
//   }
// }

// class index{
//   public static void main(String[] args) {
//     int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//       for (int i=0; i<arr.length; i++) {
//         int sum = 0;
//           for (int j=0; j<arr[i].length; j++) {
//               sum+=arr[i][j];
//           }
//         System.out.println("Row sum:- "+sum);
//       }
      
//   }
// }


// class index{
//   public static void main(String[] args) {
//     int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//       for (int i=0; i<arr.length; i++) {
//         int sum = 0;
//           for (int j=0; j<arr[i].length; j++) {
//               sum+=arr[j][i];
//           }
//         System.out.println("Column sum:- "+sum);
//       }   
//   }
// }


// class index{
//   public static void main(String[] args) {
//       int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//       int max = arr[0][0];

//       for (int i = 0; i<arr.length; i++) {
//           for (int j = 0; j<arr[i].length; j++) {
//               if (arr[i][j]>max) {
//                   max=arr[i][j];
//               }
//           }
//       }
//       System.out.println(max);

//   }
// }