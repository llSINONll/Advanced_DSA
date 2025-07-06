
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




//Day2:-


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



//Day3:-(2D array)

// class index{
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("Enter the no. of rows:- ");
//     int rows = in.nextInt();
//     System.out.println("Enter the no. of columns:- ");
//     int columns = in.nextInt();
//     int[][] matrix = new int[rows][columns];
//     for (int i=0; i<rows; i++) {
//       for (int j=0; j<columns; j++){
//         System.out.println("Enter the Element:- ");
//         matrix[i][j] = in.nextInt();
//       }    
//     }
//     System.out.println("Your matrix is:- ");
//     for (int i=0; i<rows; i++){
//       for (int j=0; j<columns; j++){
//         System.out.print(matrix[i][j] + " ");
//       }
//       System.out.println("");
//     } 
//   }
// }

//Matrix Transpose:- 

// class index{
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("Enter the no. of rows:- ");
//     int rows = in.nextInt();
//     System.out.println("Enter the no. of columns:- ");
//     int columns = in.nextInt();
//     int[][] matrix = new int[rows][columns];
//     for (int i=0; i<rows; i++) {
//       for (int j=0; j<columns; j++){
//         System.out.println("Enter the Element:- ");
//         matrix[i][j] = in.nextInt();
//       }    
//     }
//     int[][] transpose = new int[columns][rows];
//     for (int i=0; i<rows; i++) {
//       for (int j=0; j<columns; j++){
//         transpose[i][j] = matrix[j][i];
//       }    
//     }
//     System.out.println("Your Transpose matrix is:- ");
//     for (int i=0; i<rows; i++){
//       for (int j=0; j<columns; j++){
//         System.out.print(transpose[i][j] + " ");
//       }
//       System.out.println("");
//     } 
//   }
// }


//Max Element in a 2D Matrix:- 
// class index{
//   public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.println("Enter the no. of rows:- ");
//       int rows = in.nextInt();
//       System.out.println("Enter the no. of columns:- ");
//       int columns = in.nextInt();

//       int[][] matrix = new int[rows][columns];
//       for (int i=0; i<rows; i++) {
//         for (int j=0; j<columns; j++){
//           System.out.println("Enter the Element:- ");
//           matrix[i][j] = in.nextInt();
//        }    
//       }
//       int max = matrix[0][0];

//       for (int i=0; i<rows; i++) {
//         for (int j=0; j<columns; j++) {
//           if (matrix[i][j]>max) {
//               max = matrix[i][j];
//           }
            
//         }
          
//       }
//       System.out.println("Max element is:- "+max);

//   }
// }


//Check if a Matrix is a Symmetric Matrix

// class index{
//   public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       System.out.println("Enter the no. of rows:- ");
//       int rows = in.nextInt();
//       System.out.println("Enter the no. of columns:- ");
//       int columns = in.nextInt();
//       int elemSym = 0;
//       if (columns!=rows) {
//           System.out.println("The Matrix is no Symmetric");
//       }
//       else{
//         int[][] matrix = new int[rows][columns];
//         for (int i=0; i<rows; i++) {
//           for (int j=0; j<columns; j++){
//            System.out.println("Enter the Element:- ");
//            matrix[i][j] = in.nextInt();
//         }  
//         }  
//         int[][] transpose = new int[columns][rows];
//         for (int k=0; k<rows; k++) {
//           for (int j=0; j<columns; j++){
//             transpose[k][j] = matrix[j][k];
//          }    
//         }
//         for (int l=0; l<rows; l++) {
//           for (int j=0; j<columns; j++){
//             if (matrix[l][j]==transpose[l][j]) {
//                 elemSym+=1;
//             }
//             else{
//               break;
//             }
//          }    
//         }
//         if (elemSym==rows*columns) {
//             System.out.println("The matrix is Symmetric");
//         }
//         else{
//           System.out.println("The matrix is not Symmetric");
//         }

//       }

//   }
// }


//Check if a Matrix is a Symmetric Matrix (Optimized Version)




//String:- 

// class index{
//   public static void main(String[] args) {
//       String str = "hello";
//       for (int i = 0; i<str.length(); i++) {
//           System.out.println(str.charAt(i));
//       }
//   }
// }

//Reverse of a string:- 

// class index{
//   public static void main(String[] args) {
//       String str = "Hello";
//       String rstr = "";
//       for (int i = str.length()-1; i>=0; i--) {
//           rstr+=str.charAt(i);
//       }
//       System.out.println(rstr);
//   }
// }

//Remove the duplicate character:- 

// class index{
//   public static void main(String[] args) {
//       String str = "Hello";
//       String nstr = "";
//       for (int i = 0; i<str.length(); i++) {
//           char ch = str.charAt(i);
//           if (nstr.indexOf(ch)==-1) {
//               nstr+=ch;
//           }
//       }
//       System.out.println(nstr);
//   }
// }

//Count the Frequency of each character:- 

// class index{
//   public static void main(String[] args) {
//       String str = "Hello";
//       for(int i = 0; i<str.length();i++){
//         char ch = str.charAt(i);

//       }
//   }
// }

//Check which character duplicate first

// class index{
//   public static void main(String[] args) {
//       String str = "Hello";
//       String nstr = "";
//       for (int i = 0; i<str.length(); i++) {
//           char ch = str.charAt(i);
//           if (nstr.indexOf(ch)!=-1) {
//               nstr+=ch;
//               break;
//           }
//       }
//       System.out.println(nstr);
//   }
// }
