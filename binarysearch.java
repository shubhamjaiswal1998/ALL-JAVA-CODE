package randomq.com;

public class binarysearch {
	 //for duplicate elements 
	// this code for roteted sorted array
   public static int search_key(int[] a, int target){
        int st = 0, end = a.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[st] == a[mid] && a[end] == mid){
                st++;
                end--;
            }
            else if (a[mid] <= a[end]){ // mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            } else { // st to mid is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
   ///////////////////////////////////////////////////////////////////////////////
	public static int searchbinary(int arr[], int x) {
		// this code for sorted array  t(c)=logn
	 int l = 0, r = arr.length - 1;
     while (l <= r) {
         int m = l + (r - l) / 2;

         
         if (arr[m] == x) {
             return m;  
         }

         // If target greater, ignore left half
         if (arr[m] < x) {
             l = m + 1;
         }
         // If target is smaller, ignore right half
         
         else {
             r = m - 1;  }
         
     } // for close while loop

     // if we reach here, that means element was
     // not present
     return -1;
	}
 

	 //////////////////////////////////////////////////////////////////////
	 public static int search(int arr[], int key) {
		 // this code for roteted sorted array
		         int s=0; int e=arr.length-1;
		   while(s<=e) {
			   int mid=(s+e)/2;
			     if(arr[mid]==key) { 
			    	 return mid;
			     }
			     else if(arr[mid]<arr[e]) { //if mid to end is sorted
			     
			      if(key>arr[mid] && key <=arr[e]){  //if search on key lies between mid to end
			         s=mid+1;     //index shift right side 
			         }
			      else {
			    	  e=mid-1;
			      }
			   }
			     else {    // start to mid sorted
			    	 if(key>=arr[s] && key <arr[mid]) {//if search on key lies between start to mid
			    		   e=mid-1;   // shift to left side
			    	 }
			    	 else {
			    		 s=s+1;  //otherwise shift  right side
			    	 }
			     }
		   }
		 
		 return -1;
		 
	 }
	 /////////////////////////////////////////////////////////////////////////////
	 public static int getminindex_binary(int arr[]) {
		      // this code for roteted sorted array
		       int start=0; int end=arr.length; int ans=-1;
		       while(start<=end) { 
		    	/*                                // t(c)=nlogn
		    	   int mid=(start+end)/2;     // given array 3,4,5,1,2
		    	   if(arr[mid]>arr[end-1]) {   //1,2,3,4,5 sorted array
		    		                          // after first rotation
		    		                          // 2,3,4,5,1
	Or	    		   start=mid+1;         // after second rotation
	                                           
		    	   }                         // 3,4,5,1,2 roteted sorted array
		    	   else {            // case:1  mid=2
		    		  ans=mid;           //   arr[mid]=4>arr[end-1]=2 go 
		    		              // then discard left side go right side
		    	   
		           }*/
		    	   
		    	   int mid = start + (end-start)/2;  
		            if(arr[mid] <= arr[end-1]){
		                ans = mid;
		                end = mid-1;
		            } else {
		                start = mid+1;
		            }
		       }
		     return ans;
		 
	                }
	////////////////////////////////////////////////////////////////////////////////
      public static int getminindex_m2(int arr[]) {
    	            int index=-1;
    	  for(int i=0;i<arr.length;i++) { // t(c)=N
			  
			   if(arr[i]>arr[i+1]) { // 3,4,5,1,2
				     index=i+1;    // this method used  only for roteted sorted array
				     break;
			   }  
    	  }
		return index;
    	  
      }
      ////////////////////////////////////////////////////////////////////////////
	  public static int getminindex(int arr[]) {
		  int minelement=100;
		            int minindex=-1; 
		  for(int i=0;i<arr.length;i++) { // t(c)=N
			  
			   if(arr[i]<minelement) {
				   minelement=arr[i];
				    minindex=i;
			   }
			  
			 }
		  return minindex;
		 }
	
  public static void main(String[] args) {
		int arr[]= {3,4,5,1,2};
		int arr1[]= {1,2,3,4,5};
		   int target=2;
		   System.out.println(getminindex(arr));
		   System.out.println(getminindex_m2(arr));
		   System.out.println(getminindex_binary(arr));
		   System.out.println(search(arr,target));
		   System.out.println(searchbinary(arr1,target));
		
		
	      }
		}
