public class Account {
    String accountNumber;
    double balance;
    double[] transactions;
    int nextElement;
    User owner;

    Account(String accountNumber, User owner){
        this.accountNumber = accountNumber;
        this.balance = 0;
        transactions = new double[100];
        nextElement = 0;
        this.owner = owner;
    }

    void addMoney(double amount) {
        balance += amount;
        addTransaction(amount);
        if (amount > 10000) {
            System.out.println("Transaction needs to be reviewed for account " + accountNumber);
        }
    }

    void withdrawMoney(double amount) {
        if(balance - amount < 0) {
            System.out.println("There is not enough money!");
        } else {
            balance -= amount;
            addTransaction(-amount);
        }
    }

    void addTransaction(double amount) {
        if(nextElement < transactions.length) {
            transactions[nextElement] = amount;
            nextElement++;
        }
    }

    void printData() {
        System.out.println(("Email: " + owner.email + " Account number: " + accountNumber + " Balance: " + balance));
        for(int i = nextElement - 1; i >= 0; i--) {
            System.out.println("\t" + transactions[i]);
        }
    }

}
