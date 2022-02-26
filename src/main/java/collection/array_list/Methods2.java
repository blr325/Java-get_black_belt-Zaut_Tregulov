package collection.array_list;

import java.util.Arrays;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] sbArr = {sb1, sb2, sb3, sb4};
        List<StringBuilder> listSB = Arrays.asList(sbArr);
        System.out.println("listSB = " + listSB);
        sbArr[0].append("bcd");
        System.out.println("listSB = " + listSB);


    }
}
