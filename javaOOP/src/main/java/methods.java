import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

class  addition{
    public  static  int var= 1;
    public int findSum(int a, int b){
        int sum;
        sum =  a + b;
        return  sum;
    }

    public static int get(){
        return var++;
    }
}



public class methods {
    public static void main(String arg[]){

        addition add = new addition();
        int result = add.findSum(30, 30);
        System.out.println(result);
        System.out.println(addition.get());
        System.out.println(add.get());

        Calendar calendar = Calendar.getInstance(); // imports
        Date date = new Date();
        System.out.println("The time is, " + calendar.getTime());
        System.out.println("The date today is," + date);

    }
}
