public class mainElevator {
    public  static void  main(String[] args){
        elevator1 e1 = new elevator1();
        elevator2 e2 = new elevator2();
        elevator3 e3= new elevator3();
        e1.moveUp();
        e1.moveDown();
        e1.start();
        e1.stop();
        e2.moveUp();
        e3.start();
        e2.generator();
    }
}