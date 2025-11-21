package ss15_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("----------begin----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập  tuối ");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            boolean check = checkAge(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }


//        int[] array = {10, 23, 45, 67};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập  index cần lấy ra");
//        int index = -1;
//        try {
//            index = Integer.parseInt(scanner.nextLine());
//            System.out.println(array[index]);
//        } catch (NumberFormatException e) {
//            System.out.println("lỗi nhập index nên lấy ra pt đầu mảng");
//            index = 0;
//            System.out.println(array[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("lỗi truy ngoài pt mảng nên lấy phần cuối mảng");
//            index = array.length - 1;
//            System.out.println(array[index]);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            readFile("src/ss15_exception/student1.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("yêu cầu nhập lại");
//        }


        System.out.println("----------finish----------------");
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
    }

    public static boolean checkAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("age <0");
        } else if (age > 200) {
            throw new AgeException("age>200");
        } else {
            return true;
        }
    }


}
