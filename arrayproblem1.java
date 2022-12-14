public class arrayproblem1 {
    static int [] prefixsum(int arr[]){
                int size=arr.length;
         // int ans[]=new int[size]; 
           // ans[0]=arr[0];
          for (int i = 1; i < size; i++) {
              arr[i]=arr[i-1]+arr[i];
              // with using new array ans[i]=ans[i-1]+arr[i];
          }

          print(arr);
      return arr;
    }
   static int[] sqrtarray(int arr[]) {
      int size=arr.length; int left=0; int right=size-1;
    int ans[]=new int[size];
        int k=size-1;
       while (left<=right) {
        if (Math.abs(arr[left])>Math.abs(arr[right])) {
             ans[k--]=arr[left]*arr[left]; left++;
        } else {
          ans[k--]=arr[right]*arr[right];  right--;
        }
        
       }
    return ans;
  }
/*  static void swap(int arr[],int s,int e){
int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        
}*/
static void reverse(int arr[],int s,int e){// m-2 by reverse for rotate

      while (s<e) {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++; e--;
      }
  }

static int[] rotate(int arr[], int k,int size){
            k=k%size;
   int j=0; int ans[]=new int[size];

  for (int i = size-k; i < size; i++) {
        ans[j++]=arr[i];
  }
  for (int i = 0; i < size-k; i++) {
    ans[j++]=arr[i];
}    

  return ans;
}
static void print(int arr[]){
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i]+" ");
}System.out.println();
}


public static void main(String[] args) {
int arr[]={1,2,3,4,5}; //int k=3; int size=arr.length;
        
       print(arr);
   // int [] arr1= rotate(arr,k,size);
    // print(arr1);
     //reverse(arr, 0, size-k-1);  reverse(arr, size-k, size-1);  reverse(arr, 0, size-1);
     print(arr); System.out.println(); int c[]=sqrtarray( arr);
     print(c);  reverse(c, 0, c.length-1);  System.out.println(); print(c);
     System.out.println(); prefixsum(arr);

}

}