import java.util.ArrayList;

public class stringrecursionprob {
   /////////////////////////////////////////////////////////////////////////////////
  public static void subsetOFsum(int arr[],int size,int idx,int anssum){
    if (idx>=size) {
     System.out.print(anssum+" ");
      return;
    }
    
    // include
    subsetOFsum( arr,size,idx+1,anssum+arr[idx]);
     //not include
     subsetOFsum( arr,size,idx+1,anssum);
    
}
  /////////////////////////////////////////////////////////////////////////////////////
   public static void printsubset_m2(String str,String currans){
        if (str.length()==0) {
          System.out.print(currans+" ");
          return;
        }
        char currchar=str.charAt(0);
         String remString=str.substring(1);
        // include
        printsubset_m2( remString, currans+currchar);
         //not include
         printsubset_m2( remString, currans);
        
}
  /////////////////////////////////////////////////////////////////////////////////////////
          public static ArrayList<String> subset(String str){

                ArrayList ans=new ArrayList<>();
              if (str.length()==0) {
                    ans.add("");
                    return ans;
              }
              char curr=str.charAt(0); 
            ArrayList<String> small=subset(str.substring(1));
            for (String ss : small) {
                   ans.add(ss);  ////////////////// add first small string & then add with currvalue in all string
                   ans.add(curr+ss);
            }
            return ans;

        }
////////////////////////////////////////////////////////////////////////////////////////
        public static boolean palindrome_by_recusion(String str,int l,int r){
            if (l>=r) {
              return true;
            }
            return str.charAt(l)==str.charAt(r) && palindrome_by_recusion( str, l+1, r-1);

            }
     
        /////////////////////////////////////////////////////////////////////////////
        public static void palindrome(String str){
             String rev=reverse_by_recursion(str, 0);
             if (rev.equals(str)) {
               System.out.printf("%s is palindrome ",str);
             }else{
              System.out.printf("%s is not palindrome ",str);
             }
        }
        ///////////////////////////////////////////////////////////////////////////
        public static char[] swap(String s,int i, int j){
                      char arr[]=s.toCharArray();
               char temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                                      
              return arr;
    }
    ////////////////////////////////////////////////////////////////////////////
    public static String reverse_by_recursion(String str,int idx){
                 //String ans="";
           if (str.length()==idx) {
               return "";
           }
               String smallprob= reverse_by_recursion( str,idx+1);  //T(c)=O(n^2) bcoz 
               return  smallprob+str.charAt(idx);        // to concatinate 2 String take also O(n)
           } 
////////////////////////////////////////////////////////////////////////////
        public static void reverse_m2_bywhile(String str){
                 
          int size=str.length();
         while(size>0)
          {
               System.out.print(str.charAt(size-1)); 
                 size--;
                }
                     
               } 
  ////////////////////////////////////////////////////////////////////////////  
    public static String reverse_byforloop(String s){
                        String ans=""; 
                  int n=s.length()-1;
                  for (int i = n; i >=0 ; i--) {
                       ans=ans+s.charAt(i);
                  }

                   return ans;

    }
/////////////////////////////////////////////////////////////////////////////////         
        public static String remove_all_a_m2(String s){
                   
               if (s.length()==0) {//T(c)=O(n^2) bcoz n call
                     return "";
               }
                String subprob= remove_all_a_m2( s.substring(1));
                char currelement=s.charAt(0);  // means s[0]
              if (currelement!='a') {           
                   return currelement+ subprob; // for gaajka  s[0]=g  include curr
              } else {
                return subprob;     // for agggaka  s[0]=a not include  curr           
              }

    }   
/////////////////////////////////////////////////////////////////////////////////////
    public static String remove_all_a(String s, int idx){
                   
               if (idx==s.length()) {
                     return "";
               }
                String subprob= remove_all_a( s,  idx+1);
                char currelement=s.charAt(idx);  // means s[0]
              if (currelement!='a') {           
                   return currelement+ subprob; // for gaajka  s[0]=g  include curr
              } else {
                return subprob;     // for agggaka  s[0]=a not include  curr           
              }

    }
    //////////////////////////////////////////////////////////////////////////////  
    public static String remove_a(String s){
          String ans="";
            for (int i = 0; i < s.length(); i++) {
                  if (s.charAt(i)!='a') {
                    ans=ans+s.charAt(i);
                  }
            }
            return ans;
    }
    public static void main(String[] args) {
            String s="gaajka";
            String s1="level";
            System.out.println("actual string "+s);
            /*  System.out.println(remove_a(s));
             System.out.println(remove_all_a(s, 0));
            System.out.println(remove_all_a_m2(s));
           System.out.println(reverse_byforloop(s));*/

         String str=(reverse_by_recursion(s,0));
         System.out.println(str);
           palindrome("baab");
           System.out.println();
           System.out.println(palindrome_by_recusion(s1, 0, s1.length()-1));
           
           reverse_m2_bywhile(s);System.out.println();
            /*    ArrayList<String> ansforsubset=new ArrayList<>();
                  ansforsubset=subset("abc");
                  for (String ss1 : ansforsubset) {
                       System.out.println(ss1);
                  }*/
                printsubset_m2("abc", ""); System.out.println();   
                int arr[]={1,2,3};
                subsetOFsum(arr, arr.length, 0, 0);

    }
    
}
