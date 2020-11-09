package labs.lab11;

import java.util.*;

public class lab11_main {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        HashMap <String, ArrayList<String>> friendsMap= new HashMap<String,ArrayList<String>>();
        ArrayList<String> friendsS=new ArrayList<>();
        ArrayList<String> friendsC=new ArrayList<>();
        ArrayList<String> friendsB=new ArrayList<>();
        friendsS.add("Bob");
        friendsS.add("Jose");
        friendsS.add("Alex");
        friendsS.add("Cathy");


        friendsMap.put("Sue", friendsS);
        friendsC.add("Bob");
        friendsC.add("Alex");
        friendsMap.put("Cathy", friendsC);
        friendsB.add("Alex");
        friendsB.add("Jose");
        friendsB.add("Jerry");
        friendsMap.put("Bob", friendsB);

        System.out.print("Enter a name: ");
        String name = in.next();
        System.out.print(friendsMap.get(name));
    }
}
