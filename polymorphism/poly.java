class Bird{
    public void sing(){
        System.out.println("Tweek tweek");
    }
}
class Kasuku extends Bird{
    public void sing(){
        System.out.println("kwi kwi kwi");
    }

}
class Pelican extends Kasuku{
    public void sing(){
        System.out.println("truuuuu truuuuu");
    }
}
public class poly {
   public static void main(String[] args){
        Pelican b = new Pelican();
        b.sing();

    }
}