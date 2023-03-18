package lamdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueAndCommon {

//    public void getUnique(List<Integer> list1, List<Integer> list2 ){
//        List<Integer> unique = new ArrayList<>(list1);
//        unique.addAll(list2);
//        unique.removeIf(common::contains);
//        System.out.println("Unique elements: " + unique);
//    }

    public  void getCommon(List<Integer> list1, List<Integer> list2){
        boolean sts = list1.removeIf( n -> n ==);
//        List<Integer> common = list1.stream()
//            .filter(list2::contains)
//            .toList();
        System.out.println("Common elements: " + sts);
    }
}
