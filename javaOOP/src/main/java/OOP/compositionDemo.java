package OOP;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class compositionDemo {
    public  static  void main(String [] args){
        House house = new House();
        System.out.println(house.getFood());

    }
}

class House{
    public   Kitchen kitchen;
    public House(){
       kitchen  = new Kitchen();
       kitchen.setFood("chicken");
    }
    public String getFood(){
      return   kitchen.getFood();
    }

}
class Kitchen{
    public String food;
    public void setFood(String food){
        this.food = food;
    }
   public String getFood(){
        return food;
   }

}
