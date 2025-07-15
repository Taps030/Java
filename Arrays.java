//1.Declare and print an array

// public class Main
// {
// 	public static void main(String[] args) {
// 		int []arr={12,1,6,8,5};
// 		for(int i: arr){
// 		    System.out.print(i+" ");
// 		}
// 	}
// }

//2.Input and output elements of an array
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         for (int i = 0; i < 5; i++){
//             arr[i] = sc.nextInt();
//         } 
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }

//3.Find the sum of elements in an array in java
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8};
//         int sum = 0;
//         for (int x : arr) sum += x;
//         System.out.println("Sum: " + sum);
//     }
// }


//4.Find the average of elements in an array

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8};
//         int sum = 0;
//         float num_of_element= arr.length;
//         for (int x : arr) sum += x;
//         System.out.println("Average: " + (sum / num_of_element));
//     }
// }


//5.Find the maximum element
// public class Main{
//     public static void main(String[]args){
//         int []arr={5,8,9,10,1};
//         int max=arr[0];
//         for(int x: arr){
//             if(x>max){
//                 max=x;
//             }
//         }
//         System.out.println("Max: "+max);
//     }
// }

//6.Find the minimum element

// public class Main{
//     public static void main(String[]args){
//         int []arr={5,8,9,10,1};
//         int min=arr[0];
//         for(int x: arr){
//             if(x<min){
//                 min=x;
//             }
//         }
//         System.out.println("Min: "+min);
//     }
// }

//7.Count even and odd numbers
// public class Main{
//     public static void main(String[]args){
//         int []arr={5,8,9,1,3};
//         int even=0;
//         int odd=0;
//         for(int x:arr){
//             if (x%2==0){
//                 even++;
//             }else{
//                 odd++;
//             }
//         }
//         System.out.println("even: "+  even+" odd: "+odd);
//     }
// }


//8.Print elements at even indices
// public class Main{
//     public static void main(String[]args){
//         int []arr={1,6,8,4,33,51,44};
//         for(int i=0;i<arr.length;i+=2){
//             System.out.println("Element at even indices: "+arr[i]);
//         }
//     }
// }

//9.Print elements at odd indices
//public class Main{
//     public static void main(String[]args){
//         int []arr={1,6,8,4,33,51,44};
//         for(int i=1;i<arr.length;i+=2){
//             System.out.println("Element odd indices: "+arr[i]);
//         }
//     }
// }


//10.Count positive and negative numbers
// public class Main{
//     public static void main(String[]args){
//         int []arr={1,6,8,4,33,51,44};
//         int positive=0;
//         int negative=0;
//         for(int x:arr){
//             if(x>=0){
//                 positive++;
//             }else{
//                 negative++;
//             }
//         }
//         System.out.println("positive number:"+positive+"  Negative number: "+negative);
//     }
// }


//11.Replace all negative numbers with zero
// public class Main{
//     public static void main(String[]args){
//         int []arr={1,6,-8,4,-33,51,-44};
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<0){
//                 arr[i]=0;
//             }
//         }for(int x:arr){
//             System.out.println(x+" ");
//         }
//     }
// }


//12.Search an element (Linear Search)
// public class Main{
//      public static void main(String[]args){
//          int []arr={1,6,-8,4,-33,51,-44};
//          int target=-1;
//          boolean found=false;
//          for(int x:arr){
//              if(x==target){
//                  found = true;
                
//              }
//          }
//          System.out.println(found? "Found":"Not Found");
//      }
// }


//13.Copy an array
// public class CopyArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int[] copy = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) copy[i] = arr[i];
//         for (int x : copy) System.out.print(x + " ");
//     }
// }


//14.Reverse an array


// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         for(int i = arr.length - 1; i >= 0; i--){
//             System.out.println(arr[i]+" ");
//         }
//     }
// }

//15. Swap First and Last Elements
// import java.util.Arrays;
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30};
//         int temp = arr[0];
//         arr[0] = arr[arr.length - 1];
//         arr[arr.length - 1] = temp;
//         System.out.println(Arrays.toString(arr ));
//         //for (int x : arr) System.out.print(x + " ");
//     }
// }


//16.Print array in reverse order
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {5,8,1,9,2};
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//17.Count frequency of a given number
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 2, 5, 2};
//         int target=2;
//         int count=0;
//         for(int x:arr){
//             if(x==target){
//                 count++;
//             }
//         }
//         System.out.println("Count: "+count);
//     }
// }\


//18.Find the index of a specific element

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 2, 5, 2};
//         int target=5;
//         int index=-1;
    
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 index=i;
//                 break;
//             }
//         }
//         System.out.println("index position: "+index);
//     }
// }


// //19.Replace all even numbers with -1
// import java.util.Arrays;
// public class Main{
//     public static void main(String[]args){
//         int []arr={1,2,6,3,7,4};
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 arr[i]=-1;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }


//20.Multiply all elements of the array

public class Main{
    public static void main(String[]args){
        int []arr={1,2,6,3,7,4};
        int product=1;
        for(int x:arr){
            product *=x;
        }
        System.out.println("product of all elements: "+product);
        }
        
    }




























