import java.util.*;
public class gcd {
    static void void_user_input(){

      Scanner sc=new Scanner(System.in);
      char ch= sc.next().charAt(0);
                

              

    }
    static void switch1() {
       
        int d = 0;
        switch (d) {
            case 0:
                System.out.println("0");
                
            case 1:
                System.out.println("1");
           
            case 2:
                System.out.println("2");

            default:System.out.println("defalt");     
            
        }

    }

    static int lcm(int a, int b) {

        int i = 1;
        while (i <= b) {
            int f = a * i;// start reading table of a when b also divide that no stop it
            if (f % b == 0) {
                return f;
            }
            i++;
        }

        return 0;
    }

    static int gcd(int a, int b) {
        int gcd = 1;
        int min = (a < b) ? a : b;
        int i = 2;
        while (i < min) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static void main(String[] args) {
       // System.err.println(gcd(24, 15));
       // System.err.println(lcm(15, 20));
       switch1();
    }
}
