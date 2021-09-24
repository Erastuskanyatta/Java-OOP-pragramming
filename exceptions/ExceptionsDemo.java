import java.io.FileReader;
import java.io.FileNotFoundException;
public  class ExceptionsDemo extends Main {
    public static void show(){
//        sayHello(null);
        try {
            var reader = new FileReader("file.text") ;
            System.out.println("file Opened"); // this will not be printed. when a line throws an exception the control moves to the catch for the exeption
        } catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
            System.out.println("file Opened");
        }
    }
//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
}