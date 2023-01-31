package OOP;

import java.util.ArrayList;

interface mobile{
    public void calling(String number);
    public void message(String message);

}

class Tecno implements mobile{
    private ArrayList<String>contacts =  new ArrayList<String>();
    public void addContacts(String number){
        contacts.add(number);

    }

    @Override
    public void calling(String number) {
        System.out.println("calling..." + number);

    }

    @Override
    public void message(String message) {
        System.out.println("sending message..." + message);

    }
}

public class AbstractionDemo {
    public  static  void main(String args []){
        Tecno tecno = new Tecno();
        tecno.calling("0729096005");
        tecno.message("I wil go home at 8 pm");
        tecno.addContacts("0791186969");

        Samsung samsung = new Samsung();
        samsung.calling("+254791186969");
        samsung.sendMessage("I will buy my own car some days. Amen");
        samsung.addContact("+25409876656");

    }
}
// abstraction implementation using abstract class
abstract class mobilee{
  private ArrayList<String> list = new ArrayList<String>();

    abstract void calling(String number);
    abstract void sendMessage(String message);
    public void addContact(String contact){
        list.add(contact);
      }
}

class Samsung extends  mobilee{

    @Override
    void calling(String number) {
        System.out.println("call number : " + number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("message is " + message);
    }
}
