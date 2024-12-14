import java.util.*;
class Iterator{
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("HI");
        a.add("IAm");
        a.add("Student");
        a.add("waseem");
        a.add("ashu");
        Iterator itr = a.iterator();
        while(itr.hashNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}