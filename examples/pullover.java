public class pullover {
    // properties of the pullover
    public  int size;
    public  String color;

    public pullover(String color, int size){
        this.color = color;
        this.size = size;
    }

    // creating some objects of the pullover
    public static void pulloverOn(){
        System.out.println("The shirt is on");
    }
    public static void pulloverOff(){
        System.out.println("The pulover is on");
    }

}