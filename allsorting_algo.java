public class allsorting_algo {
    //////////////////////////////////////////////////////////////////// 
    public static void insertionSort(int[] a){
       int n = a.length;
       for(int i = 1; i < n; i++){//  insertion algo stable hota hai (t(c)=n in best case)
           int j = i;                   // t(c)=n^2 in worst case
           while(j > 0 && a[j] < a[j-1]){
               int temp = a[j];
               a[j] = a[j-1];
               a[j-1] = temp;
               j--;
           }
       }
    }
     
   ////////////////////////////////////////////////////////////////////////////////////////
       public static void swap(int arr[],int i, int j){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
       }
      public static int partition(int arr[],int start,int end){

               int pivot=arr[start];  int count=0;
           for (int i = start+1; i <=end; i++) {
             
                if (arr[i]<pivot) {
                      count++;
                }
           }
          int pivotindex=start+count;
          swap(arr,start,pivotindex);// set pivot value at correct location


          // set all lesservalue of pivot at the left side
          // set all greatervalue of pivot at the right side
              int i=start; int j=end;
       while (i<pivotindex && j>pivotindex) {
             while (arr[i]<pivot) {
                    i++;
               } 
               while (arr[j]>pivot) {
                 j--;
            }  
               if (i<pivotindex && j>pivotindex) {// again check bcoz through whileloop may be i & j reached 
                                            // false condition then swap it L TO R each other
                    swap(arr, i, j); i++; j--;
               }
               
             }
             return pivotindex;
      } 

 public static void quick_sort(int arr[],int start ,int end){
            // base case
       if (start >= end)               // not stable algo quick sort
          return;              // T(C)=N*LOGn in best & avg case
                                 // T(C)=N^2 in worst case can be avoid by randomized method 
    // partitioning the array
    int p = partition(arr, start, end);

     // Sorting the left part
      quick_sort(arr, start, p - 1);

     // Sorting the right part
       quick_sort(arr, p + 1, end);
           
              }
 /////////////////////////////////////////////////////////////////////////
   public static void selectoinsort(int arr[]){

       for (int i = 0; i < arr.length-1; i++) {
            int minindex=i;
            for ( int j = i+1; j < arr.length; j++) {
                if (arr[minindex]>arr[j]) {//compare to all ele & store minvalue index
                      minindex=j;               // T(C)=N^2 in all case not stable
                }                             // but insertion algo stable hota hai (t(c)=n in best case)
            }
           // swap(arr[i],arr[minindex])<=>(current ele , minindex elem)
            int temp=arr[i];
             arr[i]=arr[minindex];
                arr[minindex]=temp;
             }
      }
//////////////////////////////////////////////////////////////////////////////////////////
    public static void bubblesort(int arr[]){
         
         int flag=0;
         for (int i = arr.length-1; i>=0; i--) {  // stable & in-place algorthem bcoz
                                            //  2* 3 2 1 after sort 1 2* 2 3, not change  reletive 
                                            //order of 2 & in-place bocz not used extra array
             flag=0;
             for (int j = 0; j <i; j++) {   // T(C)=N^2 in worst case 
                   
                  if (arr[j]>arr[j+1]) {   // T(C)=o(N) in best case
                     flag=1;
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                  }
                  }
                  if (flag==0) { //if f==0 that means no happend swaping, array sorted so,come out loop
                   break;    // it will give T(c)=n in best case but in worst case n^2
                }
           }
}
 ///////////////////////////////////////////////////////////////////////////////
      public static void sort_string(String arr[]){

           for (int i = 0; i < arr.length-1; i++) { // use selection sort T(c)=n^2
               int minindex=i;
               for (int j = i+1; j < arr.length; j++)
                {
                    if (arr[j].compareTo(arr[minindex])<0) {// if 1st ele is less than minindexArray
                           minindex =j;
                    }
                     }
               String temp=arr[i];
              arr[i]=arr[minindex];
              arr[minindex]=temp;

           }
            }

/////////////////////////////////////////////////////////////////////////////////
      public static void sort_0(int arr[]){
          for (int i = 0; i < arr.length-1; i++) {
              for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j]==0 && arr[j+1]!=0) {
                          int temp=arr[j];
                          arr[j]=arr[j+1];
                          arr[j+1]=temp;
                    }
              }
          }
}
//////////////////////////////////////////////////////////////////////////////////
      public static void merge(int arr[],int l,int m,int r){

            int size1=m-l+1; int size2=r-m;

            int arr1[]=new int[size1];
            int arr2[]=new int[size2];
          int i,j,k;
         for ( i = 0; i < size1; i++) {//copy  in first array from main array
               arr1[i]=arr[l+i];
         }
         for ( j = 0; j < size2; j++) {//copy  in second array from main array
               arr2[j]=arr[m+1+j];
         }
         i=0; j=0; k=l;
         while (i<size1 && j<size2) { // after sorting re-copy in main array 
               if (arr1[i]<arr2[j]) {
                   arr[k++]=arr1[i++];
               } else {
                   arr[k++]=arr2[j++];
               }
         }
         while (i<size1 ) {
             arr[k++]=arr1[i++];
         }
          while (j<size2 ) {
             arr[k++]=arr2[j++];
         }


      }
public static void mergesort(int arr[],int l,int r){
       
          if (l>=r) {    // t(c)=n*logn stable sort
             return ;
          }  
            int m=(l+r)/2;// does not sort in place bcoz that need  extra spaces to copy
          mergesort(arr, 0,m );
           mergesort(arr, m+1,r );
           merge(arr, l,m,r );

}
///////////////////////////////////////////////////////////////////////////////////
public static void show(int arr[]){
 for (int i : arr) {
   System.out.print(i+" ");
 }
 System.out.println();
}
////////////////////////////////////////////////////////////////////////////////////////
public static void show2(String arr[]){
 for (String i : arr) {   // set string type to print string
   System.out.print(i+" ");
 }
 System.out.println();
}
   public static void main(String[] args) {
      int arr[]={4,5,3,2,1};
       int arr1[]={4,5,0,0,1};
      String arr2[]={"kiwi","apple","papaya","mango"};
      show(arr);
   mergesort( arr, 0,arr.length-1 );
   show(arr);  sort_0(arr1); show(arr1); sort_string(arr2); show2(arr2);
     bubblesort(arr1);  show(arr1);
     selectoinsort(arr); 
      show(arr); quick_sort(arr, 0, arr.length-1);
      show(arr);
      insertionSort(arr);
      show(arr);

        
   }
   
}
