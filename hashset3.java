import java.util.*;
class hashset3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashSet<String> a = new HashSet<>();
        //accepting values into Hashset
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s= sc.nextLine();
            a.add(s);
        }
        System.out.println(a);
    }
    
}
