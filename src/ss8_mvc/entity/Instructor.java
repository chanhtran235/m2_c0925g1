package ss8_mvc.entity;

import ss5.student_management.ITraining;

public class Instructor extends Employee {
    public void teach(String subject){
        System.out.println(this.getName()+ "dạy môn :"+ subject);
    }

}
