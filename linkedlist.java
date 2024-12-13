import java.util.*;
class linkedlist{
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("HI");
        a.add("IAm");
        a.add("Student");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}