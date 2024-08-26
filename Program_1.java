package Assignment_17_ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Program_1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

       list.add("Apple");
       list.add("Orange");
       list.add("Mango");
       list.add("Pine Apple");
       list.add("Guava");

        System.out.println("List         : "+list);
        System.out.println("Third Fruit  : "+list.get(2));

    }
}
