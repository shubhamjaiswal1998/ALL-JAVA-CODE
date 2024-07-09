import java.util.*;
public class bubble {
  public static void main(String[] args) {
    List<Integer> arr1=new ArrayList<>();
    arr1.add(4); arr1.add(5); arr1.add(1);
    arr1.add(3); arr1.add(6);
    for (int i = 0; i <arr1.size()-1; i++) {
      for (int j = 0; j <arr1.size()-1-i; j++) {
        if (arr1.get(j)>arr1.get(j+1)) {
          int temp=arr1.get(j);
          arr1.set(j, arr1.get(j+1));
          arr1.set(j+1, temp);
        }}}
   for (int i = 0; i <arr1.size(); i++) {
      System.out.println(arr1.get(i)); }   }}
