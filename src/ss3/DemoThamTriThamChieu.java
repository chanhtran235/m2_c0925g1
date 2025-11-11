package ss3;

import java.util.Arrays;

public class DemoThamTriThamChieu {
    public static void main(String[] args) {
//        int b =10;
//        changeValue(b);
//        System.out.println(" ngoài hàm "+ b);

        int[] array = {1,2};
        changeArray(array);
        System.out.println("ngoà hàm: "+Arrays.toString(array));

    }
    public static void changeValue(int a){
        a++;
        System.out.println("trong hàm "+ a);
    }
    public static void changeArray(int[]arr){
        arr[0] = 100;
        System.out.println("trong hàm: "+Arrays.toString(arr));
    }

}
