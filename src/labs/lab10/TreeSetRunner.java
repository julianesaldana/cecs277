package labs.lab10;

import java.util.*;

public class TreeSetRunner {
    public static void main(String[]arg){
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("iii");
        tree.add("hhh");
        tree.add("ggg");
        tree.add("fff");
        tree.add("eee");
        tree.add("ddd");
        tree.add("ccc");
        tree.add("bbb");
        tree.add("aaa");

        tree.add("iii");
        tree.add("hhh");
        tree.add("ggg");
        tree.add("fff");
        tree.add("eee");
        tree.add("ddd");
        tree.add("ccc");
        tree.add("bbb");
        tree.add("aaa");

        for (String letters : tree)
            System.out.println(letters);
    }
}
