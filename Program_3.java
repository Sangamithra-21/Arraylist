package Assignment_17_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Character> list=new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        list.add('G');
        list.add('H');
        list.add('I');
        list.add('J');

        System.out.println("Enter Character to Search : ");
        char search=sc.next().charAt(0);

        int result=findCharacter(search,list);
        if(result!=-1) {
            System.out.println("Index of Character " + search + " : " + result);
        }
        else {
            System.out.println("Element Not Found : " + result);
        }

    }

    private static int findCharacter(char search, List<Character> list) {

        return list.indexOf(search);
    }
}
