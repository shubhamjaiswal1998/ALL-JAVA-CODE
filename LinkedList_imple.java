
public class LinkedList_imple {

    public static class NodeList {
        int val;
        NodeList next;

        NodeList(int val) {
            this.val = val;

        }
    }
    //////////////////////////////////////////////////////////////////////////////////

    public static class LinkedList { // no need to do static mathod bcoz already in static class

        NodeList head = null;
        NodeList tail = null;
        int size = 0;

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        void deleteat_index(int n) {
            NodeList  temp =head;
            if (n==0) {
                head=head.next; size--; return;
            }
            for (int i = 1; i <=n-1; i++) {
                  
                  temp=temp.next;
            }

              
           temp.next=temp.next.next;

           if (n==size-1) {
               tail=temp; 
           }
           size--;
        }  

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        void insert_at_tail(int val) {
            NodeList new_ele = new NodeList(val); // new element
            if (head == null) {

                head = new_ele; // if there is no tail means empty LL then head & tail both will point to new
                                // ele temp
                tail = new_ele;

            } else {
                tail.next = new_ele; // if no empty then directly point tail to new ele temp first then move tail
                tail = new_ele; // now that tell point temp 3 , 4 ,5 will connect 7

            }

            size++;
        }

        /////////////////////////////////////////////////////////////////////////////////////////

        void display() {
            NodeList temp = head;
            while (temp != null) {
                System.out.print(temp.val + "-> ");
                temp = temp.next;
            }

            System.out.println();
        }
        //////////////////////////////////////////////////////////////////////////////////////////

        int sizeofLL() {
            NodeList temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        ////////////////////////////////////////////////////////////////////////////////////////////

        void insert_at_head(int val) {
            NodeList temp = new NodeList(val);

            if (head == null) {
                // head=temp; OR bcoz head & tail point same ele temp if at starting LL is empty
                // tail=temp;
                head = tail = temp;

                // Or only do call directly insert_at_tail(val);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        /////////////////////////////////////////////////////////////////////////////////////

        void insert_at_index(int n, int val) {

            NodeList new_ele = new NodeList(val);

            NodeList temp = head;// this will take for iteration

            if (n == sizeofLL()) {
                insert_at_tail(val);
                return;
            } else if (n == 0) {
                insert_at_head(val); // bocz below we start for loop with 1 not index from 0
                // so handle that case
            }

            else if (n < 0 || n > sizeofLL()) {
                System.out.println("y entered wrong index  ");
            }
            // before inserting try to reach that index then connect it
            for (int i = 1; i <= n - 1; i++) {

                temp = temp.next;
            }

            new_ele.next = temp.next; // first store forword ele address otherwise it will disconnect
            temp.next = new_ele;
            size++;
        }
        /////////////////////////////////////////////////////////////////////////////////

        int get_atindex(int index) {
            NodeList temp = head;

            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }

            return temp.val;
        }
        ///////////////////////////////////////////////////////////////////////////
    }

    public static void main(String[] args) {

        LinkedList ob = new LinkedList();

        ob.insert_at_tail(4);
        ob.insert_at_tail(5);

        ob.display();
        System.out.println("size of LL is " + ob.sizeofLL());
        System.out.println("size of ll by instance var " + ob.size);

        ob.insert_at_head(77);
        ob.display();

        ob.insert_at_index(0, 99);
        ob.display();

        System.out.println(ob.get_atindex(2));
           ob.display();
         ob.deleteat_index(0);
         ob.display();
        System.out.println("size of ll is "+ob.size);
    }
}
