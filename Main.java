//With recursion factorial Number
// public class Main{
//     public static int factorial(int n){
//         if (n==0 || n==1){
//             return 1;
//         }else{
//             return n*factorial(n-1);
//         }
        
//     }
//     public static void main(String[]args){
//         int num=5;
//         int result=factorial(num);
//         System.out.println(" Factorial of: "+ num+"is "+result);
//     }
// }

// Fibonacci Recursion using
// public class Main{
//     public static int fibonacci(int n){
//         if(n==0){
//             return 0;
//         }else if(n==1){
//             return 1;
//         }else{
//             return fibonacci(n-1)+fibonacci(n-2);
//         }
//     }
//     public static void main(String[]args){
//         int num=6;
//         int result=fibonacci(num);
//         System.out.println("the number is: "+num+ " its fibonacci sum is: "+result);
//     }
// }




//Sum of first n natural number
// public class NaturalSumCalculator {
//     public static int sum(int n) {
        
//         if (n == 1) {
//             return 1;
//         } else {
            
//             return n + sum(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10; 
//         int result = sum(n);
//         System.out.println("The sum of the first " + n + " natural numbers is: " + result);
//     }
// }



//print even number 2 to n using resursion 

// public class Main {

//     public static void printEvenNumbers(int current, int n) {
//         // Base case: Stop recursion when current number exceeds n
//         if (current > n) {
//             return;
//         }

//         // Check if the current number is even and print it
//         if (current % 2 == 0) {
//             System.out.print(current + " ");
//         }

//         // Recursive call: Increment current number and call the method again
//         printEvenNumbers(current + 1, n);
//     }

//     public static void main(String[] args) {
//         int n = 20; // Example upper limit
//         System.out.println("Even numbers from 2 to " + n + ":");
//         printEvenNumbers(2, n); // Start from 2
//     }
// }




//Product n natural numbers
// public class Main {
//     public static int Product(int n) {
        
//         if (n == 1) {
//             return 1;
//         } else {
            
//             return n* Product(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10; 
//         int result = Product(n);
//         System.out.println("The Product of the first " + n + " natural numbers is: " + result);
//     }
// }


//7. Sum of digits of a number using recursion
public class Main {
    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits = " + sumOfDigits(num));
    }
}


//8. Count the number of digits using recursion
public class Main {
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 98765;
        System.out.println("Number of digits = " + countDigits(num));
    }
}


//9.Print even numbers from 2 to N using recursion
public class Main {
    public static void printEven(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        printEven(i + 2, n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Even numbers from 2 to " + n + ":");
        printEven(2, n);
    }
}


//10. Print a number in reverse using recursion
public class Main {
    public static void printReverse(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        printReverse(n / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.print("Reversed number: ");
        printReverse(num);
    }
}


//




