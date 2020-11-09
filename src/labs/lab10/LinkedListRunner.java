package labs.lab10;

import java.util.*;

public class LinkedListRunner {
    public static void main(String[]arg){
        LinkedList<String> link = new LinkedList<String>();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        link.add("ddd");
        link.add("eee");
        link.add("fff");
        link.add("ggg");
        link.add("hhh");
        link.add("iii");

        ListIterator<String> iter = null;
        iter = link.listIterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println();

        while (iter.hasPrevious()){
            String temp = iter.previous();
            System.out.println(temp);
            if (temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u'){
                iter.remove();
            }
        }

        System.out.println();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
