package ss3;

public class DemoMethod {
    public static void main(String[] args) {
         showMessage("hello");
    }

     static void showMessage( String mess){
         System.out.println(mess);
     }
     static double sum(int a, int b){
        return a+b;
     }

     static double sum(int c, double d){
        return c+d;
     }
    static double sum( double d){
        return 10+d;
    }

     // trong 1 class có thể tạo nhiều method cùng tên?
}
