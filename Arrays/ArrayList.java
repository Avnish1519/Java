import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("l");//to add anything in the arraylist we use ".add"
        li.remove(0);//to remove the elements
        
        System.out.println(li);//printing the output
        String s = li.get(0);
        System.out.println(s);//printing the output

        List<Integer> l1 = new ArrayList<>();//using list interface
        l1.add(1);
        l1.add(2);//adding thins
        System.out.println(l1);//printing the output
        
    }
}
