package encapsulation;

 /*Encapsulation is a fundamental principle of object-oriented programming (OOP) in Java. 
 It is the process of hiding the internal implementation details of an 
 object and exposing only the necessary methods and properties to interact with it. 
 It helps in achieving data abstraction and provides a way to protect the data from 
 unauthorized access and modification.

 In Java, encapsulation is typically implemented using classes and access modifiers. 
 access modifiers (public, private, protected, and default) determine the visibility and accessibility 
 of the members (fields and methods) of a class. Here's how encapsulation */

public class Encapsulation {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Encapsulation(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

/*In this example, we have a BankAccount class that represents a bank account. 
The class has private fields accountNumber, accountHolderName, and balance. 
These fields are encapsulated and can only be accessed within the class itself.

The class provides public getter methods getAccountNumber(), getAccountHolderName(), and getBalance() 
to retrieve the values of these private fields. 
This allows controlled access to the account details without exposing the internal implementation.

The class also provides public methods deposit() and withdraw() to perform deposit and 
withdrawal operations, respectively. These methods update the balance field accordingly and provide 
appropriate messages.

The displayAccountInfo() method is another public method that displays the account information.

By encapsulating the account details and providing public methods to interact with the account, 
we ensure that the internal state of the BankAccount object is protected. 
Other parts of the code can create BankAccount objects and use its public methods to 
deposit, withdraw, and retrieve information, without directly accessing or modifying the private fields. 
This encapsulation helps maintain data integrity and provides a clear interface for interacting 
with the BankAccount object. */