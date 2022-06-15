package Labjava;
import java.util.Scanner;
public class Bank {
    double balance;
    double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public static void main(String[] args) {
        double interest;
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời Bạn Nhập Số Tiền Gốc:");
        double balance = sc.nextDouble();
        System.out.println("Mời Bạn Nhập Số Tiền Gốc:");
        double rate = sc.nextDouble();
        System.out.println("Số Tiền Cần Phải Trả Là "+(balance*(rate/1200)));

    }
}
