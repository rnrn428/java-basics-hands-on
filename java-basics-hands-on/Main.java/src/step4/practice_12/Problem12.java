package step4.practice_12;

class Account {
    public int balance;
}

public class Problem12 {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.balance = -10000; // 잔액이 음수가 됨

        System.out.println("Account balance: " + acc.balance);
    }
}