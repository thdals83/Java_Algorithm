package 자료구조;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsettest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        for(Integer i: set){
            System.out.println(i);
        }


    }
}
