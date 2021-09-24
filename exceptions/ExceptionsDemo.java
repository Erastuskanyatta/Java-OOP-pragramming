import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public  class ExceptionsDemo extends Main {
    public static void show(){
//        sayHello(null);
        try {
            var reader = new FileReader("file.text") ;
            var value = reader.read();
            System.out.println("file Opened");
        } catch (FileNotFoundException exception){ // only this catch will be executed
            System.out.println("no such file");
        }
        catch (IOException exeption){
            System.out.println("cannot read data"); // this catch will be ignored coz it has already been caugt above(poly)
        }
    }
//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
}