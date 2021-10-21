package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // 543
        
        int Firstdigit = number % 10; // 3
        number = number / 10; // 54   
        int secondDigit = number % 10;  // 4
        number = number /  10; // 5
         
        int ThirdDigit = number % 10; // 5 

        int sum = Firstdigit + secondDigit + ThirdDigit; // 12

        System.out.println("Sum of digits: " + sum);
    }

}