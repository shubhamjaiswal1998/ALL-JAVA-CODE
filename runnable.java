/*
 * A thread is an independent sequence of instructions that can be scheduled and executed by the operating
 *  system. It represents a single flow of control within a program.

Threads allow concurrent execution of multiple tasks within a program, enabling it
 to perform multiple operations simultaneously or in a seemingly parallel manner
 * 
 * Threads have several advantages, including improved performance and responsiveness.
 * threads within the same process share the same memory space, allowing them to directly access and modify
 *  shared data.
 */
class A1 extends Thread{
    public void run() {
      for (int i = 0; i <=100; i++) {
        System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
      }
    }
}
class B1 extends Thread{
public void run() {
     for (int i = 0; i <=100; i++) {
        System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
     }
}
}

////////////////////////////////////////////////////////////////////////////////////////////////
/* MyRunnable class implements the Runnable interface and provides an implementation for the run() method. 
   Inside the run() method,
 *  you can define the code that 
 * will be executed concurrently when the thread starts.
 * 
 */
class A11 implements Runnable{
    public void run() {
      for (int i = 0; i <=100; i++) {
        System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
      }
    }
}
class B11 implements Runnable{
public void run() {
     for (int i = 0; i <=100; i++) {
        System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
     }
}
}
public class runnable {
     public static void main(String[] args) {
        
        Runnable o1=new A11();  // here runnable is interface directy can not acess
        Runnable o2=new B11();  // but A11 is class it will assign then aceess through diff class
         
            Thread t1=new Thread(o1);  // through thread class we can access bocz in thread  class 
                                        // there is constroucter which take argu as o1 and o2
            Thread t2=new Thread(o2);
        
         t1.start(); t2.start();
///////////////////////////////////////////////////////////////////////////////////////////////////////////
         // here is another method to run this code are called lamda expression 2
         Runnable o3=()->{
            for (int i = 0; i <=100; i++) {    // do not need to write run method in lamda fn
                System.out.println("hi");     // directly start writing code
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
         }
        };

         Runnable o4=()->{
            for (int i = 0; i <=100; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
         }
        };

         Thread t3=new Thread(o3);  // through thread class we can access bocz in thread  class 
                                        // there is constroucter which take argu as o1 and o2
            Thread t4=new Thread(o4);
        
         t3.start(); t4.start();

/////////////////////////////////////////////////////////////////////////////////////////////
  // excute thread class A and B
  A1 oo1=new A1();
   B1 oo2=new B1();
  oo2.setPriority(Thread.MAX_PRIORITY);// here we can set PRIORITY to excute timing
   oo1.start(); oo2.start();

        
    }
}
