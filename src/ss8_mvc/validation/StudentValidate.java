package ss8_mvc.validation;

public class StudentValidate {
    public static boolean checkName(String name){
        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)$";
        return  name.matches(regexName);
    }
}
