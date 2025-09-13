
// // // //array//#regi
// // // public class hello{
// // //     public static void main(String[] args) {
// // //         // Scanner scanner= new Scanner(System.in);
        
// // //         // // int arr1[]=new int[len];r(int i=0;i<len;i++){
// // //         // //     arr1[i]=scanner.nextInt();
// // //         // // }
// // //         // // // int arr[]={1,24,76,4,3};
// // //         // // // System.out.println(arr.length);
// // //         // // for(int i=0;i<arr1.length;i++){
// // //         //     System.out.print("enter the length of array");
// // //         //     int len =scanner.nextInt();
// // //         //     int sum=0;
// // //         //     int arr[]=new int[len];
// // //         //     for(int i=0;i<len;i++){
// // //         //         arr[i]=scanner.nextInt();


// // //         //     }
// // //         //     for(int i=0;i<len;i++){
// // //         //         sum+=arr[i];
// // //         //     }
// // //         //     System.out.println(sum);

// // //         // }
// // //         //  int arr []={12,5,3,23,9};
// // //         //  int st=0;
// // //         //  int end =arr.length-1;
// // //         //  arr[st]=arr[end];
// // //         //  st++;
// // //         //  end--;


// // //         // for (int i=arr.length-1;i>=0;i--){
// // //         //     System.out.print(arr[i]+" ");
// // //         // }
// // //         // System.out.println();
// // //         // System.out.println(arr[0]);
        
// // //     }
// // // // }
// // // import java.util.Scanner;

// // public class hello{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         for (int i = 1; i <= n; i++) {
// //             for (int j = 1; j <= i; j++) System.out.print("*");
// //             System.out.println();
// //         }
// //         sc.close();
// //     }
// // }
// // public class hello{


// // public static void main (String[]args){
// //     // int age =18;
// //     // String name ="mohit";
// //     // double cgpa=8.7;
// //     // boolean student=true;
// //     // System.out.println("Name "+ name);
// //     // System.out.println("Age "+ age);
// //     // System.out.println("CGPA "+ cgpa);
// //     // System.out.println("IS Student "+ student);
// //     int a=10,b=20;
// //     System.out.println("a+b="+(a+b));
// //     System.out.println("a-b="+(a-b));
// //     System.out.println("a*b="+(a*b));
// //     System.out.println("a/b="+(a/b));
// //     System.out.println("a%b="+(a%b));
// //   }
// // }
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int insertPos = 0;

//         // Non-zero elements ko front pe le aao
//         for (int num : nums) {
//             if (num != 0) {
//                 nums[insertPos++] = num;
//             }
//         }

// //         // Bachi jagah 0 se fill kar do
// //         while (insertPos < nums.length) {
// //             nums[insertPos++] = 0;
// //         }
// //     }
// // }
// // // condition of {if else/else if switch break }
// public class MaxArrayLoop {
//     public static void main(String[] args) {
//         int arr[] = {15,20,35,1,3,1050};
//         int max =Integer.MIN_VALUE;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
// //             }
// //         }
        
// //         System.out.println("Maximum element = " + max);
// //     }
// // }
// public class MaxArrayLoop {
//     public static void main(String[] args) {
// //         int arr[] = {-1,24,5,-4,98};
// //         int min =Integer.MAN_VALUE;
// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] > min) {
// //                 min = arr[i];
// //             }
// //         }
        
// //         System.out.println("Min element = " + min);
// //     }
// // }
// public class MaxArrayLoop {
//     public static void main(String[] args) {
//         int arr[] = {-1, 24, 5, -4, 98};
//         int min = Integer.MAX_VALUE;   // starting with very large number

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min) {   // minimum check
//                 min = arr[i];
//             }
//         }

//         System.out.println("Min element = " + min);
//     }
// }
// // public class PalindromeCheck {
//     public static void main(String[] args) {
//         String str = "nama";
//         int st=0;
//         int end=str.length()-1;
//         while (st<end) {
//             if (str.charAt(st)!=str.charAt(end)){
//                 System.out.println("not palindrom!");
//                 return;
//             }
//             st++;
//             end--;
            
//         }
       
//         System.out.println("palindrom");
//     }
// }

// public class anagram{
//     public static void main(String[] args) {
//         String str1="aman";
//         string str2="naman";
//         char arr[]=new char[str1.length(1)];
//         int arr[]=new int [10];
//     }

    
// import java.util.Arrays;

// public class Anagram {
//     public static void main(String[] args) {
//         String str1 = "cat";
//         String str2 = "tac";

//         int arr1[]=new int[26];
//         int arr2[]=new int[26];
//         if (str1.length()!=str2.length()){
//             System.out.println("not anagram");
//             return;

//         }
//         for(int i=0;i<26;i++){
            
//         }
        
        

//         }

//         // Convert to char arrays
//         char arr1[] = str1.toCharArray();
//         char arr2[] = str2.toCharArray();

//         // Sort both arrays
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         // Compare
//         if (Arrays.equals(arr1, arr2)) {
//             System.out.println("Anagram");
//         } else {
//             System.out.println("Not an Anagram");
//         }
//     }
// }

// import java.util.StringTokenizer;

// public class WordCount {
//     public static void main(String[] args) {
//         String str = "hey i am, a b.tech student";

//         StringTokenizer st = new StringTokenizer(str, " ,");

//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }

// //" " ke andar jo likha hai, usko string parameter bola jaata hai.
//        public class UpdateString {
//     public static void main(String[] args) {
//         String str1 = "teekesh ";
//         stringBuffer sb=new stringBuffer();
//         for (int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if (ch>'a'&& ch<='z'){
//                 ch=(char)(ch-32);
//                 sb.append(ch)
//             }

//         }
        
//     }
// }
