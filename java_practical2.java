//Java practical-2
/*Q. Write a java program that uses nested if statements to check if x is greater than 5 and if y is greater than 2. If both conditions are met, print 'x is greater than 5, and y is also greater than 2.' If x is not greater than 5, print 'x is not greater than 5.?*/
public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
    if (x > 5) {
            if (y > 2) {
                System.out.println ("x is greater than 5, and y is also greater than 2.");
            } else {
                System.out.println("x is greater than 5, but y is not greater than 2.");
            }
        } else {
            System.out.println("x is not greater than 5.");
        }
    }
}
//output
//x is greater than 5, and y is also greater than 2.
/*Q.2 write a java program , countSquares(n), that returns  the count of perfect squares less than or equal to n (n>1) .?*/
public class Main
{   
      public static int countSquares(int n) {
        if (n <= 1) {
            return 0;
        }
       int count = 0;
        int i = 1;
        while (i * i <= n) {
            count++;
            i++;
        }
        
        return count;
    }
    
	public static void main(String[] args) {
		System.out.println(countSquares(49))//7;
	}
}
/*Q.W.A.P  to check perfect square in java  ?*/
public class Main {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; 
        }
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 16; // Change num to any integer
        System.out.println(isPerfectSquare(4));//true
    }
}
/*Q. W.A.P to print pattern given below in java ?
a.
****
****
****
****                                                                  */
public class Main
{
   static void squre_pattern(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		squre_pattern(5);
	}
}
/*b.
*
**
***
****
*****
*/
public class Main
{
   static void squre_pattern(int n)
{
    for (int i = 0; i <=n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		squre_pattern(5);
	}
}
/* c.
   *
  ***
 *****
*******                                        */
public class Main
{
  static void isocelus_traingle_pattern(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j <= n - i; j++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i - 1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		isocelus_traingle_pattern(5);
	}
}


 /* d . diamond
 
 */
class Main{
static void f1(int n){

   for (int i = 0; i < n; i++)
   {
    for (int j = 0; j < n - i; j++)
        {
            System.out.print(" ");
        }
      for (int j = 0; j < 2*i-1; j++)
        {
            System.out.print("*");
        }   
      System.out.println(); 
   }

   for (int i = n - 1; i > 0; i--) {
        for (int j = 0; j < n - i ; j++) {
           System.out.print(" ");
        }
        for (int j = 0; j < 2 * i -1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
   public static void main (String[] args) {
      f1(6);
  }

}

/* e. hollow diamond 
 
*/
     class pattern {
    static void f1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {
                if (j == 0 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {
                if (j == 0 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        f1(6);
    }

}


 /* f.
    *****
       *****
          *****
             *****
                *****                                          */

static void isocelus_traingle_pattern_with_num1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
        

            System.out.println();
        }
    }

/* g.
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y                       */
public class Main {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Y';
        int size = 5; // Size of the square

        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
            if ((ch - start + 1) % size == 0) {
                System.out.println();
            }
        }
    }
}

/* h.
      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 
 1 5 10 10 5 1                                 */
public class pattern {

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static int n_c_r(int n, int r) {
        int res1 = fact(n);
        int res2 = fact(r) * fact(n - r);
        int res3 = res1 / res2;
        return res3;
    }

    static void print_pascal(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(n_c_r(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print_pascal(5);
    }
}



/* i.
* * * * * 
*       *
*       *
*       *
* * * * *
*/
/* j.
      0
    010
   01210
  0123210
 012343210              */
public class pattern {

    static void isocelus_traingle_pattern_with_num1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        isocelus_traingle_pattern_with_num1(5);
    }
}





