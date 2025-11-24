package ss8_mvc.util;

import ss8_mvc.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // pt ghi file
    public static void write(String filePath, List<String> stringList,boolean append) {
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file,append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (int i = 0; i < stringList.size(); i++) {
                bufferedWriter.write(stringList.get(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
    }
    public static List<String> readFileCSVToStringList(String filePath){
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = null;
            while ((line =bufferedReader.readLine())!=null){
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return stringList;
    }

    public static void writeStudentListToBinaryFile(String filePath, List<Student> studentList){
        File file = new File(filePath);
        try( FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ){
            objectOutputStream.writeObject(studentList);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<Student> readBinaryFile(String filePath){
        List<Student> studentList = new ArrayList<>();
        File file = new File(filePath);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {

             studentList = (List<Student>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("danh sách đang trống");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}
