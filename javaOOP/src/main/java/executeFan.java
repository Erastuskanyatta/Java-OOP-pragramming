
class  Fan{
    public boolean isOn;
    public  static  int test = 1; // static variable
    public  void  get(){
        test++;
    }
    // behaviours of the fan
    public void turnOn(){
        int var = 0; // local variable
        isOn = true;
    }
    public  void turnOff(){
        isOn = false;
    }

    public void checkStatus(){
        if(isOn){
            System.out.println("The fan is on.");
        }else {
            System.out.println("The fan is off.");
        }
    }
}

public class executeFan {

    public  static  void main(String[] args){
        // creating an object of fan

        Fan fan = new Fan();
        Fan fan1 = new Fan();

        fan.turnOn();
        fan.checkStatus();
        fan1.turnOff();
        fan1.checkStatus();

        System.out.println(fan.isOn);
//        System.out.println(Fan.test);
        fan.get();
        System.out.println(fan1.test);

    }
}
