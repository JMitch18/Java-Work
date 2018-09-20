import java.util.*;

public class Main {


    public static void main(String[] args) {

       String[] stuff = {"apple", "bob", "ham", "bob", "bacon"};

       List<String> list = Arrays.asList(stuff);

       System.out.printf("%s ", list);
       System.out.println();

       Set<String> set = new HashSet<String>(list);
       System.out.printf("%s", set);


    }
}