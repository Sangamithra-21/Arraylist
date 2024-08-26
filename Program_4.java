package Assignment_17_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("List : "+list);

        String[] arr = new String[list.size()];
        list.toArray(arr);

        System.out.println("Array : "+Arrays.toString(arr));

        List<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("List : "+list1);


    }
}
