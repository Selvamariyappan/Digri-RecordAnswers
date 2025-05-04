class BankAccount {
    private int balance = 0;

    
    public void deposit(int amount, String threadName) {
        synchronized (this) {
            balance += amount;
            System.out.println(threadName + ": Deposited $" + amount);
        }
    }

    
    public void withdraw(int amount, String threadName) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(threadName + ": Withdrawn $" + amount);
            } else {
                System.out.println(threadName + ": Insufficient balance for withdrawal of $" + amount);
            }
        }
    }

 
    public int getBalance() {
        return balance;
    }
}

class DepositTask implements Runnable {
    private BankAccount account;
    private String threadName;
    private int[] deposits;

  
    public DepositTask(BankAccount account, String threadName, int[] deposits) {
        this.account = account;
        this.threadName = threadName;
        this.deposits = deposits;
    }

    @Override
    public void run() {
        for (int depositAmount : deposits) {
            account.deposit(depositAmount, threadName);
            try {
                
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private String threadName;
    private int[] withdrawals;

  
    public WithdrawTask(BankAccount account, String threadName, int[] withdrawals) {
        this.account = account;
        this.threadName = threadName;
        this.withdrawals = withdrawals;
    }

    @Override
    public void run() {
        for (int withdrawalAmount : withdrawals) {
            account.withdraw(withdrawalAmount, threadName);
            try {
               
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
      
        BankAccount account = new BankAccount();
        
      
        int[] depositsThread1 = {100, 200, 300};
        
     
        int[] withdrawalsThread2 = {50, 100, 150};
        
        
        Thread thread1 = new Thread(new DepositTask(account, "Thread Thread 1", depositsThread1));
        Thread thread2 = new Thread(new WithdrawTask(account, "Thread Thread 2", withdrawalsThread2));
    
        thread1.start();
        
    
        try {
            thread1.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        thread2.start();
        
       
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}