
//import java.util.Collections;
import java.util.*;

public class collection {
  
   ///////////////////////////////////////////////////////////////////////////////////////////////////
   static void hashmapImple() {
      HashMap<Integer, String> ob = new HashMap<>(); // does not allow duplicate key but key can contain multiple valu
      //  value in hashmap, it store unordered format
      ob.put(0, "aman");// for insert we use put fn
      ob.put(1, "shubha");
      System.out.println(ob);
      System.out.println("key value is " + ob.get(1));
      System.out.println("entery set entire " + ob.entrySet());
      System.out.println("values " + ob.values());
      System.out.println("keys are " + ob.keySet());
      System.out.println("after do loop ");

      for (String iterable_element : ob.values()) {

         System.out.println(iterable_element);
      }
      // we can print whole map object with pair
      for (var iterable_element : ob.entrySet()) {
         System.out.printf("key is %d  ", iterable_element.getKey(), "& value is %s ", iterable_element.getValue());
      }
      // another hash map
      HashMap<String, Integer> ob1 = new HashMap<>();
      ob1.put("golu", 1);
      ob1.put("aman", 2);
      ob1.put("ankit", 3);
      ob1.put("shubham", 4);
      System.out.println(ob1);
      System.out.println("removed value is" + ob1.remove("ankit"));
      // we can update value only not keys by put here change 2 to 23 of aman key
      ob1.put("aman", 23);
      System.out.println(ob1);
      ob1.putIfAbsent("shubham", 2);// no will add boz key exits from before
      ob1.putIfAbsent("kaju", 213);
      System.out.println(ob1);
   }

   //////////////////////////////////////////////////////////////////////////////////////////
   static void LinkedHashSetimple() { // order of insertion not change
      LinkedHashSet<Integer> ob = new LinkedHashSet<>();
      ob.add(1);
      ob.add(1);
      ob.add(2);
      System.out.println(ob);
   }

   ///////////////////////////////////////////////////////////////////////////////////////
   static void treeset() {
      TreeSet<Integer> ob = new TreeSet<>(); // data will print assending order
      ob.add(1);
      ob.add(1);
      ob.add(2);
      System.out.println(ob);
   }

   //////////////////////////////////////////////////////////////////////////////////////////////////
   static void hashsetimple() { // comes from set interfcae
      HashSet<Integer> ob = new HashSet<>();
      ob.add(1);
      ob.add(1);
      ob.add(2);
      System.out.println(ob); // will print only 1 bcoz in set not possible dublicate
      System.out.println(ob.contains(1));
      ob.remove(1);
      System.out.println(ob);
   }

   //////////////////////////////////////////////////////////////////////////////////////////////
   static void dequue() {
      Deque<Integer> ob = new ArrayDeque<>();
      ob.addFirst(1);
      ob.addFirst(2); // first add 1 then 2 1 then 2 1 3 then 2 1 3 4
      ob.addLast(3);
      ob.addLast(4);
      System.out.println(ob);
      System.out.println(ob.pollFirst());// 2
      System.out.println(ob.pollLast());// 4
      System.out.println(ob);
   }

   /////////////////////////////////////////////////////////////////////////////////////////////
   static void PriorityQueueIMPlE(PriorityQueue<Integer> ob) {
      ob.add(3);
      ob.add(2);
      ob.add(1);
      System.out.println(ob);
      System.out.println(ob.peek()); // o/p 1 bcoz will give priorty only for min element
      System.out.println("removed element " + ob.poll());
   }

   //////////////////////////////////////////////////////////////////////////////////////////////
   static void linkedlistimple(LinkedList<Integer> ob) {
      ob.add(0, 1);
      ob.add(1, 2);// in linked list order will be maitainted
      ob.push(3);
      ob.add(3, 4);
      ob.push(5);
      System.out.println(ob);
      System.out.println("value of index of 1 is " + ob.get(1));

      System.out.println("poped value is " + ob.pop());
      ob.offer(87);// it will insert value
      System.out.println("size is " + ob.size());
      System.out.println("peak value is " + ob.peek());
      System.out.println("print all element");
      for (int i = 0; i < ob.size(); i++) {// this will not work
         System.out.println(ob.get(i));
      }

   }

   /////////////////////////////////////////////////////////////////////////////////////////////////////
   static void Stackimple(Stack<String> ob) {

      ob.push("shubham");// follow fifo approach
      ob.push("shj");
      System.out.println(ob);
      ob.add(0, "golu");
      System.out.println("after add golu stack is " + ob);
      System.out.println(ob.contains("shj"));// true
      System.out.println("peek value is " + ob.peek());

   }

   ////////////////////////////////////////////////////////////////////////////////////////////////////
   /*
    * Collection
    * 1. In order to represent a group of individual object, then we need to go for
    * "Collection".
    * 2. It is a root interface of (collection framework==STL standard template
    * librebery)
    * 3. All the commonly used method required for all the collection is a part of
    * Collection(I).
    * 
    */
   // reverse of data of arraylist
   // ArrayList can implements List interface , & list can extend collection
   // interface
   static void reverse(ArrayList<Integer> l1) {
      int i = 0;
      int j = l1.size() - 1;
      while (i < j) {

         Integer temp = Integer.valueOf(l1.get(i)); // it will get integer object

         l1.set(i, l1.get(j)); // int temp=a[i]; a[i]=a[j]; a[j]=temp;
         l1.set(j, temp); // public E set(index, element)
         i++;
         j--;
      }

   }

   ////////////////////////////////////////////////////////////////////////////////////////////////////////////
   static void printarraylist(ArrayList<Integer> l1) {
      for (int i = 0; i < l1.size(); i++) {
         System.out.print(l1.get(i) + " "); // ob.get(index) it will give value
      }
   }

   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void main(String[] args) {
      /////////////////////////////////////////////////
      ArrayList<Integer> l1 = new ArrayList<>();
      l1.add(2);
      l1.add(2);
      l1.add(99);
      l1.add(993);
      printarraylist(l1);

      ///////////////////////////////////////////////////////////////
      System.out.println();
      System.out.println("stack is ");

      Stack<String> ob = new Stack<>();
      Stackimple(ob);

      ////////////////////////////////////////////////////////
      System.out.println();
      System.out.println("linkedlist are");
      LinkedList<Integer> o1 = new LinkedList<>();
      linkedlistimple(o1);
      ////////////////////////////////////////////////////////////
      // PriorityQueue<Integer> ob2 = new PriorityQueue<>();
      PriorityQueue<Integer> ob2 = new PriorityQueue<>(Comparator.reverseOrder());
      PriorityQueueIMPlE(ob2);

      ///////////////////////////////////////////////////////////
      // dequue
      System.out.println("sequue ");
      dequue();

      /////////////////////////////////////////////////////////////
      System.out.println("hashset");
      hashsetimple();
      /////////////////////////////////////////////////
      System.out.println("treeset ");
      treeset();
      //////////////////////////////////////////////////
      System.out.println("linkedhashset are");
      LinkedHashSetimple();
      /////////////////////////////////////////////////////////////
      System.out.println("hashmap");
      hashmapImple();

   }

}
