import java.util.ArrayList;

public class recursionQ {
     public static ArrayList<Integer> lisearch_getindex_m2(int arr[],int target,int size,int idx){
                           
          if (idx>=size) {
               return new ArrayList<Integer>() ;// for null arraylist value
          }
              ArrayList<Integer> ans=new ArrayList<>();   
          if (arr[idx]==target) {   // 0 add hoga in 4 99 3 7 4
               ans.add(idx);                     //  0 1  2  3 4  index
               
          }                     //  
             ArrayList<Integer> subprob=lisearch_getindex_m2(arr, target, size, idx+1);
             ans.addAll(subprob);  // 4 add hoga dobara remain index
             return ans;
     } 
///////////////////////////////////////////////////////////////////////////////////////////
          public static boolean lisearch(int arr[],int target,int size,int idx){
                           
              if (idx>=size) {
                   return false;
              }

              if (arr[idx]==target) {
                   return true;
              }
            return lisearch(arr, target, size, idx+1);
}
//////////////////////////////////////////////////////////////////////////////////////////////
public static void lisearch_getindex(int arr[],int target,int size,int idx){
                           
     if (idx>=size) {
          return ;
     }

     if (arr[idx]==target) {
         System.out.print(idx+" ");// here can use return bocz baki index bhi print krna hai
     }
        lisearch_getindex(arr, target, size, idx+1);
}
//////////////////////////////////////////////////////////////////////////////////////////
public static int max(int arr[],int idx) {
              int size=arr.length-1;
           if (idx==size) {
               return arr[idx];
           }

             int subprob=max(arr, idx+1);
                 return Math.max(arr[idx], subprob);

       }

      public static void print_array(int[] arr, int idx){
                      int size=arr.length;
                 if (idx==size) {
                      return;
                 }
                 System.out.println(arr[idx]);
                 print_array(arr, idx+1);
      }            

public static void main(String[] args) {
    
     int arr[]={4,99,3,7,4}; 
        print_array(arr, 0);  int target=4; int size=arr.length;
       int c= max(arr, 0); System.out.println(c);
        boolean c2=lisearch(arr, target, size, 0);
          System.out.println(c2);  lisearch_getindex(arr, target, size, 0);
           System.out.println("after using arraylist");
          //ArrayList<Integer> ans=new ArrayList<>();  use Arraylist as datatype
          ArrayList<Integer> ans=lisearch_getindex_m2(arr, target, size, 0);
          for (Integer i : ans) {
              System.out.print(i+" "); 
          }
}    
}
