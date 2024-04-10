//Java practical solution-1
//Q.1 Create a simple authentication system in JAVA where the user is asked to enter a username and password. If the username is "admin" and the password is "password123", print "Access granted." Otherwise, print "Access denied. ?
static void check_validity2() {

        String user_name = "abc";
        String password = "123";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user id");
        String user_name1 = sc.nextLine();
        System.out.println("enter password");
        String password1 = sc.nextLine();
        if (user_name.equals(user_name1) && password.equals(password1)) {
            System.out.println("y are valid user");
        } else {
            System.out.println("y are not valid user");
        }
      sc.close();
    }

/*Q.2 Write a Python function that checks the strength of a password. It should return "Weak" for passwords with fewer than 8 characters, "Medium" for passwords between 8 and 12 characters, and "Strong" for passwords with 12 or more ?*/
 static void check_validity() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter password");
        String st = sc.nextLine();
        int length = st.length();
        if (length < 8) {
            System.out.println("weak password");
        } else if (length > 8 && length < 12) {
            System.out.println("medium password");
        } else {
            System.out.println("strong password");
        }

        sc.close();
    }
/*Q.3 Build a basic calculator program that allows the user to choose an operation (addition, subtraction, multiplication, or division) and then enter two numbers. Perform the selected operation and display the result in java ?*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.print("Enter your choice (1/2/3/4/5): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = 0;
        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            result = num1 / num2;

        } else if (choice == 5) {
            result = num1 % num2;
        } else {
            System.out.println("Invalid choice!");

        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}


/*Q.4 Create a java function that takes a string as input and counts the number of vowels (a, e, i, o, u) in the string. Use logical operators to check if each character is a vowel and increment the count accordingly. Return the total count of vowels ?*/
public class Main {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = countVowels(input);
        System.out.println("Total number of vowels: " + vowelCount);
    }
public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; 
            }
        }
return count;
    }
}

/*Q. 5 W.A.P  to count the number of vowels and consonants also number of digit in a given string. ?*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
            else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            else {
                symbolCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of other symbols: " + symbolCount);
scanner.close();
    }
}


/*Q. 6 W.A.P that finds whether a given character is present in a string or not. If present it prints the index at which it is present ?*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char target = 'j';
        int index = findCharacter(input, target);
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(" not found in the string.");
        }
        scanner.close();
    }

    public static int findCharacter(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}


/*Q. 7 Create a program that asks the user to enter the price of an item and the user's age. If the user is 65 or older, they get a 10% discount. Calculate and display the final price ?*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the item: Rs");
        float price = scanner.nextFloat();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        float d=0;
        if (age>=65) {
            d=0.1f;
        } 
        double finalPrice = price - (price * d);
        System.out.println("Final price after discount: Rs" + finalPrice);
    }
}

/*Q. 8 Write a java program to calculate the Greatest Common Divisor (GCD) of two positive integers.?*/
import java.util.Scanner;
public class Main {
    public static void calculateGCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second positive integer: ");
        int b = scanner.nextInt();

        while (b != 0) {
            a = a % b;
            int temp = a;
            a = b;
            b = temp;

        }

        System.out.println("GCD is " + a);

    }

    public static void main(String[] args) {
        calculateGCD();

    }
}


/*Q. 9 W.A.P that counts the occurrences of a character in a string in java ?*/

import java.util.Scanner;

public class Main {
    public static void countOccurrences() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        char ch = 'c';

        scanner.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        countOccurrences();

    }
}




/*Q. 10 W.A.P to remove all duplicates from a string in java ?*/
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        // Create a set to store unique characters
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string using a for loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If character is not in the set, add it to the result and the set
            if (!set.contains(ch)) {
                result.append(ch);
                set.add(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
    }
}
/*Q.11 W.A.P to Print Fibonacci series in java ?*/
    static void fibo(int n) {
        int a = 0;
        int b = 1;
        if (n <= 0) {
            System.out.println("wrong i/p");
        } else if (n == 1) {
            System.out.println(a);
        } else {
            System.out.print(a + " ");
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }

	
/*Q.12 W.A.P to print odd number up to given by user “n” using do while loop in java ?*/
    static void print_odd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < n);
        sc.close();
    }
	

