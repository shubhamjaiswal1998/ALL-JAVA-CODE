
class pra321 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int length1(ListNode head ,int count) {
            
               if (head==null) {
                   return count;
               }
                    count=count+1;
               return length1(head.next, count);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////

     public static int length(ListNode head) {
          int count=0;

          ListNode temp=head;
          while (temp!=null) {
               count++;
               temp=temp.next;
          }
          return count;
     }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void display_recursively(ListNode head) {
          
          if (head==null) {
               return;
          }
            System.out.println(head.val+"-> ");
            display_recursively(head.next);
    }
   /////////////////////////////////////////////////////////////////////////////////////////////////////

   public static void display(ListNode head) {
                 
             ListNode temp=head;
             while (temp!=null) {
                  System.out.print(temp.val+"-> ");
                  temp=temp.next;
             }
             System.out.println();
   }
    public static void main(String[] args) {

        ListNode a = new ListNode(1);// head node 
        System.out.println(a);

        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

         a.next=b;
         System.out.println(a.next);// pra321$ListNode@5acf9800  giving same address
                                          
         System.out.println(b);    //   pra321$ListNode@5acf9800

         System.out.println(c);
         System.out.println(d);

            System.out.println(a.val);// 1          a.val==>1  & a.next.val==>2 bcoz a.next=b; done
            System.out.println(a.next.val); // 2

           // try to connect all node
            b.next=c;
            c.next=d;
            System.out.println(c.next.val);// 4
            System.out.println(d.val);      // 4
            System.out.println(a.next.next.next.val); // 4
///////////////////////////////////////////////////////////////////// print all node
           ListNode temp=a;
           System.out.println(temp.val);// 1
           System.out.println(temp.next.val);// 2
             System.out.println("print linked list");
             for (int i = 0; i <4; i++) {
                  System.out.print(temp.val+" -> ");// 1 2 3 4 5 update valu of temp
                  temp=temp.next;
             }

   ////////////////////////////////////////////////////////////////////////////////////
   // method 2
     System.out.println("print node");
        ListNode temp1=a;
        while (temp1!=null) {
            System.out.print(temp1.val+"-> ");
            temp1=temp1.next;
        } 
        System.out.println();
     ///////////////////////////////////////////////////////////////////////////////////////
    // by function        
    
       display(a); // we have to pass a as head node here

       ////////////////////////////////////////////////////////////////////////////////////////

       System.out.println("length of linked list is "+length1(a,0));

    }
}