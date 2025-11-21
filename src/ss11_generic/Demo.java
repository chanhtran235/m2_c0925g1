package ss11_generic;

import ss8_mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
     Box<Student> studentBox = new Box<>();
     Box<String>  stringBox = new Box<>();

     stringBox.setData("Hello");
     studentBox.setData(new Student());
     metthod("String");
     metthod(1);
     metthod(new Student());
    }
    public static <T> void metthod(T t){
        System.out.println(t);
    }
}
