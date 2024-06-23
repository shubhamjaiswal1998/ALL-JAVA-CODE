import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class linked_list {


public static void product2d_matrix() {
    Vector<Vector<Integer>> vec1_2d=new Vector<>();
    Vector<Integer> vec2=new Vector<>();
    vec2.add(1); vec2.add(2);vec2.add(3);
    vec1_2d.add(0,vec2);
    vec1_2d.add(1,vec2);
    vec1_2d.add(2,vec2);
    System.out.println(vec1_2d);//[[1, 2, 3], [1, 2, 3], [1, 2, 3]]
    
    Vector<Vector<Integer>> vec2_2d=new Vector<>();
    Vector<Integer> vec3=new Vector<>();
    vec3.add(1); vec3.add(2);vec3.add(3);
    
    vec2_2d.add(0,vec2);
    vec2_2d.add(1,vec2);
    vec2_2d.add(2,vec2);
    
    System.out.println(vec2_2d);//[[1, 2, 3], [1, 2, 3], [1, 2, 3]]

    Vector<Vector<Integer>> res1=new Vector<>();
    for (int i = 0; i < vec1_2d.size(); i++) {
        Vector<Integer> row=new Vector<>();
        for (int j = 0; j < vec2_2d.get(0).size(); j++) {
            int product=0;
            for (int k = 0; k < vec1_2d.size(); k++) {
            product=product+vec1_2d.get(i).get(k)*vec2_2d.get(k).get(j);  
            }
            row.add(product);
        }
        res1.add(row);
        System.out.println(res1);//[[6, 12, 18], [6, 12, 18], [6, 12, 18]]
    }
}    
///////////////////////////////////////////////////////////////////////////

public static void add_2_vector() {
Vector<Vector<Integer>> vec1_2d=new Vector<>();
Vector<Integer> vec2=new Vector<>();
vec2.add(1); vec2.add(2);vec2.add(3);
vec1_2d.add(0,vec2);
vec1_2d.add(1,vec2);
vec1_2d.add(2,vec2);
System.out.println(vec1_2d);//[[1, 2, 3], [1, 2, 3], [1, 2, 3]]

Vector<Vector<Integer>> vec2_2d=new Vector<>();
Vector<Integer> vec3=new Vector<>();
vec3.add(1); vec3.add(2);vec3.add(3);

vec2_2d.add(0,vec2);
vec2_2d.add(1,vec2);
vec2_2d.add(2,vec2);

System.out.println(vec2_2d);//[[1, 2, 3], [1, 2, 3], [1, 2, 3]]

System.out.println(vec1_2d.get(0).get(0));//1
System.out.println(vec1_2d.get(0).get(1));//2
System.out.println(vec1_2d.get(0).get(2));//3

Vector<Vector<Integer>> res1=new Vector<>();

for (int i = 0; i <vec1_2d.size(); i++) {
    Vector<Integer> row=new Vector<>();
    int sum=0;
    for (int j = 0; j <vec1_2d.get(0).size(); j++) {
        sum=vec1_2d.get(i).get(j)+vec2_2d.get(i).get(j);
        row.add(sum);
    }
    res1.add(i,row);
}
System.out.println(res1);//[[2, 4, 6], [2, 4, 6], [2, 4, 6]]
}    
/////////////////////////////////////////////////////////////////////////////////////////    
public static void majority_ele() {
  int arr1[]={2,2,1,1,1,2,2}; //2
  int arr2[]={3,2,3};  //3
Arrays.sort(arr1);
System.out.println(arr1[arr1.length/2]);//2
Arrays.sort(arr2);
System.out.println(arr2[arr2.length/2]);//3
}
////////////////////////////////////////////////////////////////////////////////////////////    
public static void vector() {

Vector ob1=new Vector();
ob1.add(45); ob1.add(89); ob1.add(78); ob1.add(36);
System.out.println("size is "+ob1.size()+" capacity "+ob1.capacity()+" "+ob1+" ");//size is 4 capacity 10 [45, 89, 78, 36] 

ob1.add(45); ob1.add(45);ob1.add(45);ob1.add(45);
ob1.add(45); ob1.add(45);ob1.add(45);//at 11th data vector will double size
System.out.println("size is "+ob1.size()+" capacity "+ob1.capacity()+" "+ob1+" ");//size is 11 capacity 20 [45, 89, 78, 36, 45, 45, 45, 45, 45, 45, 45] 

//2d vector
Vector<Vector> vec1=new Vector<>();
Vector vec2=new Vector<>();
vec2.add(1); vec2.add(2);vec2.add(3);
vec1.add(0,vec2);
vec1.add(1,vec2);
vec1.add(2,vec2);
       
System.out.println(vec1);//[[1, 2, 3], [1, 2, 3], [1, 2, 3]]

        
    }

////////////////////////////////////////////////////////////////////////////    
    @SuppressWarnings("unchecked")
    public static void linkedlist() {
        @SuppressWarnings("rawtypes")
        List ob = new LinkedList();
        ob.add(12);
        ob.add(13);
        ob.add(14);
        ob.add(15);
        ob.add(0, 99);
        ob.remove(2);
        System.out.println(ob);// [99, 12, 14, 15]

        ob.forEach((n) -> System.out.print(n + " "));

        ob.set(0, 880);

        System.out.println();
        for (var i : ob) {
            System.out.print(i + " ");
        }

        System.out.println(ob.contains(880));
        List ob2 = new LinkedList<>();
        ob2.add(49);
        ob2.add(23);
        ob.addAll(2, ob2);
        System.out.println(ob);// [880, 12, 49, 23, 14, 15]

        ob.addFirst(2);
        ob.addLast(2);
        System.out.println(ob);// [2, 880, 12, 49, 23, 14, 15, 2]
        System.out.println(ob.indexOf(2));// 0
    System.out.println(ob.lastIndexOf(2));// 7
    System.out.println(ob.subList(1, 5));// [880, 12, 49, 23]
             
    Iterator itr=ob.iterator();

    System.out.println(itr);//java.util.LinkedList$ListItr@33c7353a
    while (itr.hasNext()) {
        System.out.print(itr.next()+" ");
    }
    System.out.println();
    System.out.println(ob.equals(ob2));//false


    }

    public static void main(String[] args) {
       // linkedlist();
       // vector();
        //majority_ele();
     // add_2_vector();
     product2d_matrix();
    }

}

