
public class recursionproblem {
    //////////////////////////////////////////////////////
    public static int gcd_hcfm2(int divident,int divisor){
  
            while (divident%divisor!=0) {
                 int rem=divident%divisor;
                    divident=divisor;
                    divisor=rem;
            }
            return divisor;
      }
      public static int gcd_hcf(int a,int b){
  
             if (b==0) {
                   return a;
             }
  
               return gcd_hcf(b, a%b);
             }
  //////////////////////////////////////////////////////////////
    //  S=1-2+3-4+5-,,,,,,,,,till n
    public static int sumof_no_withsign(int n){
  
      if (n==0) {
          
          return 0;
      }
           int subprob= sumof_no_withsign(n-1); 
         if (n%2==0) {
               return subprob-n;  // every even pe -Ve sign hai
         } else {    
          return  subprob+n;
         }    
          
        }
        ///////////////////////////////////////////////////
    public static int sumof_naturalno(int n){
  
      if (n==0) {
          
          return 0;
      }
           int subprob= sumof_naturalno(n-1);  
          return n+subprob;}
        /////////////////////////////////////////////////////////////////
       public static void print_multiple(int n,int k){
  
                if (k==1) {
                     System.out.print(n+" ");  // (3,4)=>3 6 9 12
                    return;
                }
                print_multiple(n, k-1);  // subprob 3 6 9 get
                 
                 System.out.print(n*k+" ");//self work  3*4=>n*k =12
  
        }
    ///////////////////////////////////////////////////////////
        public static int power(int p,int q){
                      
                if (q==0) {
                     return 1;
                      }   
                    int subprob=power(p, q/2);
                 if (q%2==0) {
                       return subprob*subprob;
                 } else {
                  return p*subprob*subprob;
                 }
  }
  
        ///////////////////////////////////////////////
      public static int countof_digit(int n){
                      
                if (n>=1 && n<=9) {
                     return 1;
                      
                }   
  
                int k1=countof_digit(n/10);   
               return 1+k1;  
              }
       /////////////////////////////////////////////////////////////////    
           public static int sumof_digit(int n){
  
            if (n>=0 && n<=9) {
                      return n;  
                  }
                int k1=sumof_digit(n/10);  int self_workprob=n%10;
                             
                  return k1+self_workprob; 
  
           }     
           public static void main(String[] args) {
                  int number=328185;
                  System.out.println(sumof_digit(number));
                  System.out.println(countof_digit(number));
                  System.out.println(power(5, 3));  print_multiple(3, 4);
                  System.out.println();
                  System.out.println(sumof_naturalno(5));
                  System.out.println(sumof_no_withsign(4));
                  System.out.println(gcd_hcf(3, 9));System.out.println(gcd_hcfm2(3, 9));
  
      }
      
  }
  