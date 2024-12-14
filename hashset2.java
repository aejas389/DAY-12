import java.util.*;
class hashset2{
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("HI");
        a.add("IAm");
        a.add("Student");
        
        for(String s : a)
        {
            System.out.println(s+" ");
        }
    }
}
