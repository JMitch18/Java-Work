import java.util.*;

public class Main {


    public static void main(String[] args) {

       Integer[] nums = {1, 2, 3, 4, 5};
       Character[] chars = {'a', 'b', 'c', 'd', 'e'};

       printMe(nums);
       printMe(chars);

    }

    //generic method
    public static <T> void printMe(T[] x){
        for(T b: x){
            System.out.printf("%s ", b);
        }
        System.out.println();
    }
}