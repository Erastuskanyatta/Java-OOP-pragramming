

class Cat{
    private String color;
//     public Cat(){ //non- parameterized constructor
//        color = "red";
//    }
    public  Cat(String color){  // parameterized constructor
         this.color = color;
    }
    public void get(){
        System.out.println("The color of the Cat is " + color);
    }
}


public class constructor {

    public  static void main(String args[]){
//        Cat cat = new Cat();
        Cat cat1 = new Cat("black");

       cat1.get();

    }
}
