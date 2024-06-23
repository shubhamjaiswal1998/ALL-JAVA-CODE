class complex {
    int a;
    int b;

    public complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int get_real() {
        return a;
    }

    public int get_img() {
        return b;
    }

    public  void show() {
  System.out.println("compplex number is "+get_real()+"+"+get_img()+"i "); 
    }

    public complex  add(complex com2) {
        
        complex complex1=this;
        int p1=complex1.get_real()+com2.get_real();
        int p2=complex1.get_img()+com2.get_img();
        complex res=new complex(p1, p2);
        return res;
    }

    public complex  sub(complex com2) {
        
        complex complex1=this;
        int p1=complex1.get_real()-com2.get_real();
        int p2=complex1.get_img()-com2.get_img();
        complex res=new complex(p1, p2);
        return res;
    }
}

public class complex_num {
    public static void main(String[] args) {
     complex com1=new complex(3, 4);
     com1.show();
     complex com2=new complex(4, 5);
     com2.show();

     complex add=com1.add(com2);
     add.show();

     complex sub=com2.sub(com1);
     sub.show();
    }
}
