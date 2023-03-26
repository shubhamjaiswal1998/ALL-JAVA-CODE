

public class prac8 {
/*Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
   in this  questions adjsent number should be small than peak
You may imagine that nums[-1] = nums[n] = -∞ 
Input: nums = [1,2,3,1] exist multiple peak
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.


*/
    public static int peak_index3(int arr1[]) {
         int s=0; int e=arr1.length-1;
         while (s<=e) {
              int mid=(s+e)/2;
//  mid should be grater mid-1 & mid+1 to find peak element
            if (( mid==0||arr1[mid]>arr1[mid-1] )&& ( mid==e||arr1[mid]>arr1[mid+1] )) {
                return mid;
            }
            if (arr1[mid]<arr1[mid+1]) {
                s=mid+1;  // when next element grater then  increase strat index
                         // bocz we move forword  
            } else {
                e=mid-1;
            }

         }

     return -1;  
    }
     public static int peak_index2(int arr1[]) {
          // 0,2,4,1,0 matrix exits only one peak

          int s=0; int e=arr1.length-1;
          int ans=-100;
         while(s<=e){
 
             int mid=(s+e)/2;
 
             if(arr1[mid]<arr1[mid+1]){ // tc=logn  0,2,4,1,0 matrix  0,2,4, (fail condition) 1,0
                   ans=mid+1;   // fisrt store in ans bcoz when condition fails it will return ans
                           // in peak approach at peak first will be mid & then mid+1 
                   s=mid+1;        

                } 
                else{
 
                 e=mid-1;  // go back then it will reach at peack
             } 
          }
         return ans;
   }
 public static int peak_index(int arr1[]) {
       
        for (int i = 0; i < arr1.length; i++) {
             if (arr1[i+1]<arr1[i]) {  // tc=n  0,2,4,1,0 matrix  0,2,4, (fail condition) 1,0
                  return i;             // bcoz it in incresing order 0 to 4
             }
        }

     return -1;

   }

    /*Integers in each row are sorted in ascending from left to right.
   Integers in each column are sorted in ascending from top to bottom.
    matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5

*/
    public static int search1(int arr[][],int k){
      int row=arr.length; int column=arr[0].length;
          int s=0; // means it starts from upper row
           int e=column-1;  // means it start from right end or last column
                                   //t(c)=o(row+column) 
                                        // no use binary 
     while (s<row && e>=0) {
           
          if (arr[s][e]==k) {
               return 1;
           }
           if (arr[s][e]>k) {
                e--;  // move left
           } else {
               s++;  // for move down
           }
     }

     return -1;
    }



    /* Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
        Output: true 
       Each row is sorted in non-decreasing order.
  The first integer of each row is greater than the last integer of the previous row. 
        
    use binary serarch method 
        
        */
    
    public static int search(int arr[][],int k){
        int row=arr.length; int column=arr[0].length;
          int s=0; int e=row*column-1;  //t(c)=log(row*column) 
                                        // log for binary & length=row*column
     while (s<=e) {
           int mid=(s+e)/2;
           int midelem=arr[mid/row][mid%row];// it will give location

           if (midelem==k) {
               return 1;
           }
           if (midelem>k) {
                e=mid-1;
           } else {
               s=mid+1;
           }
     }

     return -1;
    }

     public static void show(int arr[][]){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
     }


    public static void main(String[] args) {
          int arr1[]={0,2,4,1,0}; 
          int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
          System.out.println(search1(arr,30));
          show(arr); 
          System.out.println("index is "+peak_index2(arr1));
          System.out.println("element is "+peak_index3(arr1));
          

    }
    
}
