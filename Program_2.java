package Assignment_17_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program_2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        System.out.println("Original List  : "+list);
        ListIterator<Integer> iterator = list.listIterator();

        while(iterator.hasNext())
        {
            if(iterator.next()>30)
            {
                iterator.remove();
            }

        }

        System.out.println("Modified List  : "+list);
    }
}
