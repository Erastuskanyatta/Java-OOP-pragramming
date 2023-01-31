package OOP;

public class inheritance extends vehicle {

    public static void main(String args []){
        vehicle vec =  new vehicle();
        vec.hoot();
        System.out.println("specs of my car are: " + vec.brand + ", and the price is " + vec.price);
        
    }
}

interface BMW{
    public  int speed = 450;

    default void likes(){
        System.out.println("BMW has a speed of " + speed );
    }
}

  class  car{
    public String brand = "V8";
    public  void hoot(){
    }
}
interface  nissan{
   default   void method(){
        System.out.println("This is a nissa");
    }

}

class vehicle extends car implements nissan, BMW {
    public int price = 12000000;
}



class bus extends  car{

}




