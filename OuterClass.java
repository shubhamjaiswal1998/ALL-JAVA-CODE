public class OuterClass {
    public int outerData;
    public OuterClass(int data) {
        this.outerData = data;
    }
    // Inner class
    public class InnerClass {
        public int innerData;

        public InnerClass(int data) {
            this.innerData = data;
        }

        public void display() {
            System.out.println("Outer Data: " + outerData);
            System.out.println("Inner Data: " + innerData);
            display2();
            
        }
        public void display2(){
            System.out.println("display2");
        }
        public double display3(){
            return 18;
        }
    }
        public static void main(String[] args) {
       // OuterClass outerObj = new OuterClass(10); m-2
       // OuterClass.InnerClass innerObj = outerObj.new InnerClass(20);
        //innerObj.display();  
        //m-2 for creating object
       new OuterClass(7).new InnerClass(99).display();//display2
       System.out.println(new OuterClass(89).new InnerClass(89).display3());//18.0

    }
}
