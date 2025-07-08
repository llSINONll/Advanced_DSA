
//       set.add("hello");
//       set.add("hye");
//       set.remove("hello");
//       System.out.println(set.contains("hye"));
//       System.out.println(set);
//   }
// }
// import java.util.TreeSet;
// //Tree set sort the elements and values are unique in it , we can't add an element at a particular index in the set
// class index{
//   public static void main(String[] args) {
//   TreeSet<Integer> set = new TreeSet<>();
//   set.add(1);
//   set.add(2);
//   set.add(3);

//   System.out.println(set);   
//   }
// }

//hashmap:-  key can't be duplicate in it and data will be stored in the key:value pair
// class index{
//   public static void main(String[] args) {
//       HashMap<String,Integer> map = new HashMap<>();
//       map.put("one", 1);
//       map.put("two", 2);
//       map.put("three", 3);
//       System.out.println(map);
//       //using get() method we can access the value from a key if the key is not found we'll get null
//       System.out.println(map.get("one"));
//       //getOrDefault() method gives the default value if the key is not found
//       System.out.println(map.getOrDefault("zero", 0));
//   }
// }

//Check the frequency of a string of characters:- 
// class index{
//   public static void main(String[] args) {
//       String subject = "proogrammiingggg";
//       HashMap<Character, Integer> map = new HashMap<>();
//       for (char ch : subject.toCharArray()) {
//         if (ch!=' ') {
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }   
//       }
//       System.out.println(map);
//   }
// }

//left rotate an array by 1 element:- 

// class index{
//   public static void main(String[] args) {
//     int [] arr = {1,2,3,4,5};
//     int length = arr.length;
//     int temp = arr[0];
//     for (int j=0; j<arr.length-1; j++) {
//       arr[j]=arr[j+1];
//     }

//     arr[length-1] = temp;

//     for (int i = 0; i<arr.length; i++) {
//         System.out.println(arr[i]);
//     }
//   }
// }
