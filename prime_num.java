public class prime_num {
    public static void print_prime(int n) {

      for (int i = 0; i <=n; i++) {
       boolean flag=true; //for every i it will check prime
        for (int j=i-1;j>1;j--) { //divide starts from n-1 to 2
            if (i%j==0) {       //between 
                flag=false; break;
            }
        }
        if (flag) {
            System.out.print(i+" ");
        }
      }  

    }
    public static void main(String[] args) {
       print_prime(21); 
    }
}
