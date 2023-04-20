
import java.util.*;

public class prac9 {
    /////////////////////////////////////////////////////////////////////////////
     public static int[][] pascalprint(int n) {
        int[][] ans = new int[n][];
        for(int i = 0; i < n; i++){
            //ith row has i+1 columns
            ans[i] = new int[i+1];
            //1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for(int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
     }

//////////////////////////////////////////////////////////////////////////
      public static void reverse(int arr[]) {
           int s=0; int e=arr.length-1;
             while (s<e) {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp; s++;e--;
             }
           
      }
/////////////////////////////////////////////////////////////////////////////////////
    // this will valid only for square matrix
    public static void rotateBY90(int arr[][],int row) {// in squre row & col same hai 
         
           // step1 tranpose matrix 
           // step2 reverse every individual row in matrix
         tranposeinPLASE(arr, row, row);
         
         for (int i = 0; i < row; i++) {  // this will do single-single array 
            reverse(arr[i]);
         }
        
        
    }
    /////////////////////////////////////////////////////////////////////////////////////
    // this will valid only for square matrix
    public static int[][] tranposeinPLASE(int arr[][],int row,int col) {
        for (int i = 0; i < col; i++) {
              for (int j = i; j < row; j++) {// valu of j will start from i for tranpose
                                      // swap only above of digonal element
               // swap(arr[i][j],arr[j][i])
                 int temp=arr[i][j];
                  arr[i][j]=arr[j][i];
                  arr[j][i]=temp;
              }
         }
    return arr;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public static int [][] transpose(int arr[][],int row,int col) {
          
         int ans[][]=new int[col][row]; // size will be reverse after tranpose 

         for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j]=arr[j][i];// observe lacation only after tranpose
            }
         }
         return ans;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public static int[][] product_matrix(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2) {
        if (c1!=r2) {   // in product outer should be same means in r1 c1 & r2 c2=> r1 c2 are outer
            return new int[r1][c2];
        }
        int ans[][]=new int[r1][c2]; // we have do loop according to this size r1 & c2
        for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c2; j++) {
                // here we have to use 3rd loop bcoz doing addition no of c1 or r2 times
                 for (int k = 0; k < c1; k++) {

                    ans[i][j]=ans[i][j]+arr1[i][k]*arr2[k][j];// here k increse from 0 to r1 or c2
                           // or ans[i][j]+=arr1[i][k]*arr2[k][j];
                           // sum 0,0 =>[0][0]= a00 * b00 + a01 * b10 in 2d matrix
                 }
             }
        }

        return ans;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int [][] sumof2d_matrix(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2) {
        if (r1!=r2 || c1!=c2) {
            return new int[r1][c1];
        }
       int ans[][]=new int[r1][c1];

       for (int i = 0; i < r1; i++) {
          for (int j = 0; j < c1; j++) {
             ans[i][j]=arr1[i][j]+arr2[i][j];// here all i & j same boz we hava to add on same location
          }
       }

    return ans;

    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public static int[][] input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of matrix");
         int num_row=sc.nextInt(); int num_col=sc.nextInt();
        
      int arr2[][]=new int[num_row][num_col];  // take input according to size
       
              System.out.println("enter "+num_row*num_col+  " element");
          for (int i = 0; i < num_row; i++) {
               for (int j = 0; j < num_row; j++) {
                  
                   arr2[i][j]=sc.nextInt();
               }
          }
          sc.close();
        return arr2;
    }
    ////////////////////////////////////////////////////////////////////////////////
    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
              }
              System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
           int arr[][]={{1,2,3},{3,4,5},{6,7,8}};

          display(arr);   int arr3[][]=input();
          display(arr3);///////////////////////////////////////////////////////   
          int arr4[][]=sumof2d_matrix(arr, 3, 3, arr3, 3, 3);
          display(arr4);//////////////////////////////////////////////////////
          int arr5[][]=product_matrix(arr3, 3, 3, arr4, 3, 3);
          display(arr5);/////////////////////////////////////////////////////
          int arr6[][]=tranposeinPLASE(arr5, 3, 3);
          System.out.println("after tranpose");
          display(arr6);
             rotateBY90(arr5, 3);// here we not array create bcoz it will not return array
                                           // only modyfy in array
           display(arr5); 

           int arr7[][]=pascalprint(5);
           display(arr7);

        
          }
}
