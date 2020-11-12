import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class something {

 public static void main(String a[])
 {
     ArrayList<Integer> al = new ArrayList<Integer>();

     Scanner sc = new Scanner(System.in);
     al.add(sc.nextInt());
     //Addition of elements in ArrayList
     al.add(1);
     al.add(2);
     al.add(3);
     al.add(4);
     al.add(5);
     al.add(6);

     System.out.println("Original ArrayList Content: "+al);

     //Sublist to ArrayList
     ArrayList<Integer> al2 = new ArrayList<Integer>(al.subList(0, 4));
     System.out.println("SubList stored in ArrayList: "+al2);

 }
}