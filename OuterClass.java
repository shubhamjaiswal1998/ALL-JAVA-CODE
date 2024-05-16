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
            
        }
        public double display2(){
            return 15;
        }
    }
        public static void main(String[] args) {
       // OuterClass outerObj = new OuterClass(10); m-2
       // OuterClass.InnerClass innerObj = outerObj.new InnerClass(20);
        //innerObj.display();  
        //m-2 for creating object
       System.out.println(new OuterClass(7).new InnerClass(99).display2());//15
    }
}
