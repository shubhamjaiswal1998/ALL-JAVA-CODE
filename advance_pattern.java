import java.util.*;
public class pattern {

    static int lcm(int a, int b) {

        int i = 1;
        while (i <= b) {
            int f = a * i;// start reading table of a when b also divide that no stop it
            if (f % b == 0) {
                return f;
            }
            i++;
        }

        return -1;
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


    static void product(int arr1[][],int arr2[][]){


        int pre_arr[][]=new int[arr1.length][arr2.length];
        for (int i = 0; i < pre_arr.length; i++) {
          for (int j = 0; j < pre_arr.length; j++) {
              for (int k = 0; k < pre_arr.length; k++) {
                   pre_arr[i][j]+=arr1[i][k]*arr2[k][j];
              }
          }
        }
      
        System.out.println("product  is ");
       for (int i = 0; i < pre_arr.length; i++) {
          for (int j = 0; j < pre_arr[0].length; j++) {
              System.out.print(pre_arr[i][j]+" ");
          }
          System.out.println();
       }
  
      }
      static void sum(int arr1[][],int arr2[][]){
          int sum_arr[][]=new int[3][3];
       for (int i = 0; i < arr2.length; i++) {
          for (int j = 0; j < sum_arr.length; j++) {
              sum_arr[i][j]=arr1[i][j]+arr2[i][j];
          }
       }
     System.out.println("sum is ");
       for (int i = 0; i < sum_arr.length; i++) {
          for (int j = 0; j < sum_arr[0].length; j++) {
              System.out.print(sum_arr[i][j]+" ");
          }
          System.out.println();
       }
      }
     static int[][] f1(){
          Scanner sc=new Scanner(System.in);
          int arr[][]=new int[3][3];
     
          //int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
     for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                System.out.println("enter value for row "+i+" & column "+j);
                 arr[i][j]=sc.nextInt();
             }
          }
           for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
           }
     
       return arr;
  
      }
    static void diomond2(int n){

      for (int i = 0; i <n; i++) {
         for (int j = 0; j < n; j++) {
            if (i+j<=(n-1)/2 || i==0 || j==0 || //only less
              i+j>=(n-1)+(n-1)/2||j==(n-1)||i==(n-1)||
              i-j>=(n-1)/2||
              j-i>=(n-1)/2
            ) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
         }
         System.out.println();
      }



    }
    static void digonal(int n){

     for (int i = 0; i <n; i++) {
        for (int j = 0; j < n; j++) {
            if (i==0 || j==0 ||i==(n-1)|| j==(n-1) ||i==j || i+j==(n-1)||//digonal
            //hollow diomond
               i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)/2 || i+j==(n-1)
                +(n-1)/2) {
                System.out.print("*");
            } else {
               System.out.print(" "); 
            }
        }
        System.out.println();
     }


    }
   /////////////////////////////////////////////////////////////////////////
    static void aTOz(){
        char s='A';
        char e='Z';
        for (int i = 0; i<5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }

          System.out.println("   "+e);
    }
    ////////////////////////////////////////////////////////////s
    static void iso_num(int n){
     for (int i = 0; i <n; i++) {
         for (int j = 0; j < n-i; j++) {
            System.out.print(" ");
         }
         for (int j = 0; j < i; j++) {
            System.out.print(j);
         }
         for (int j = i-2; j >=0; j--) {
            System.out.print(j);
         }
         System.out.println();
     }
}
/////////////////////////////////////////////////////////////////
    static void hollow_diomond(int n){
     for (int i = 0; i <n; i++) {
        for (int j = 0; j < n-i; j++) {
          System.out.print(" "); 
        }
        for (int j = 0; j <=2*i-1; j++) {
          if (j==0||j==2*i-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
     }
     for (int i = n-1; i>=0; i--) {
        for (int j = 0; j < n-i; j++) {
          System.out.print(" "); 
        }
        for (int j = 0; j <=2*i-1; j++) {
            if (j==0 || j==2*i-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
     }

}
////////////////////////////////////////////////////////////////////////////
    static void temple(int n) {
        for (int i = 0; i <n; i++) {
           
            for (int j = 0; j <n; j++) {
                if (i==0||j==0||i==(n-1)||j==(n-1)||i==j||j==(n-1-i)||i==(n/2)||j==(n/2)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
       System.out.println();
        }
    }

    public static void main(String[] args) {
        temple(15);
        hollow_diomond(7);
        System.out.println();
        iso_num(10);
        aTOz();
        digonal(25);
        diomond2(15);
    }
}

