package step24.ex5;

public class Account {
    String accountId;
    long balance;
    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    
   synchronized public long withdrow(long money) {
        long b = this.balance;
        for(int i = 0; i < 10000; i++)Math.asin(35.765);
        b -= money;
        for(int i = 0; i < 10000; i++)Math.asin(35.765);
        if (b < 0)
            return 0;
        for(int i = 0; i < 10000; i++)Math.asin(35.765);
        this.balance  = b;
        for(int i = 0; i < 10000; i++)Math.asin(35.765);
        return money;
    }
}
