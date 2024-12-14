import java.util.*;
class hashset{
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("HI");
        a.add("IAm");
        a.add("Student");
        a.add("waseem");
        a.add("ashu");
        System.out.println(a);
        a.remove("waseem");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}