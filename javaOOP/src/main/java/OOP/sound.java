package OOP;

public interface sound {
    void noisy();
    void soft();
}

class cat implements sound{

    public static void main(String[] args) {
        cat cat = new cat();
        cat.soft();
        cat.noisy();

    }

    @Override
    public void noisy() {
        System.out.println("noisy voice is : " + " woof");
    }

    @Override
    public void soft() {
        System.out.println("soft voice is :" + " meow");
    }


}