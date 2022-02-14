package HW1;

import java.util.*;

public class Homework1 {


    public static void main(String[] args) {
        NewArray<String> arr = new NewArray<String>("HW1.Apple", "HW1.Orange", "Kiwi", "Banana", "Grapefruit");
        NewArray<String> array = new NewArray<String>("123", "12", "15");
        //String [] arr2 = new String[] {"123", "12", "15"};
        arr.changeElementArray(1, 4);
        transformationArray(array);


    }

    public static void transformationArray(NewArray<String> array) {
        List<NewArray<String>> arrayList = new ArrayList<NewArray<String>>();
        arrayList = Arrays.asList(array);

        System.out.println(arrayList);
    }


}


