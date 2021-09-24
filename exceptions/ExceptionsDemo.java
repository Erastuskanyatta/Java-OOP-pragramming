import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public  class ExceptionsDemo extends Main {
    public static void show(){
//        sayHello(null);
        try (
                var reader = new FileReader("file.text");
                var writer = new FileWriter("writting some staff");
        ){   // try with resources statement
            var value = reader.read();
        }catch (IOException exeption){
            System.out.println("opps! that error"); // this catch will be ignored coz it has already been caugt above(poly)
        }
    }
}