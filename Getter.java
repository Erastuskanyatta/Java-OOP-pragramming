public class Getter{
    int age ;
    String name;
    public static void main(String[] args) {
        Getter student= new Getter();
        student.setName("James");
        student.setAge(20);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.printDetails();
    }
    public void  setName(String name){
       this. name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void printDetails(){
        System.out.println(getAge() + ", " + getName());
    }
}