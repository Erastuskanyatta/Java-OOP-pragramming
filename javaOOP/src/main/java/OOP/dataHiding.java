package OOP;


import java.util.Scanner;

class balanceAccount{
    private double balance= 500;
    private String username= "peterson";
    private String password= "password";


    public double getBalance(String password, String username) {
        if(this.password.equals(password)&& this.username.equals(username)){
            return balance;
        }else
        return 10.00;
    }
}

public class dataHiding {
    public static  void main(String args[]){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your Username");
//        String username = scanner.nextLine();
//        System.out.println("Enter your password");
//        String password = scanner.nextLine();
        balanceAccount bac = new balanceAccount();
       double balance =  bac.getBalance("password", "peterson" );
        System.out.println(balance);

    }

}
