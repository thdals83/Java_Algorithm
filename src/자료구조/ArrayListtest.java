package 자료구조;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListtest {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("11");
        a1.add("22");
        a1.add("11");
        a1.removeAll(Collections.singleton("11"));
        for (int i = 0; i < a1.size(); i ++){
            System.out.println(a1.get(i));
        }
    }

    //pvsm

}
