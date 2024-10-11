package bankaccounting;

/**
 *
 * @author Felix Muinde
 */
public class BankAccounting {
    private final String userID;
    private int accountBalance;
    public String accountName;
    
    //Constructors
    public BankAccounting(String user, String name){
        this.userID = user;
        this.accountBalance = 0;
        this.accountName = name;
    }
    public BankAccounting(String user, int startingAmount, String accountname){
        this.userID = user;
        
        /*Validating the balance made during object construction
            by checking if the value is awhole number
        */
        if(startingAmount % 1 != 0){
            System.out.println("Can't make an account with a balance like that, only whole numbers.");
        } else if (startingAmount > 0){
            this.accountBalance = 1000 + (startingAmount * 1000);
        }
        
        this.accountName = accountname;
    }
    
    
    public int CheckBalance(){
        return(accountBalance);
    };
    public String DisplayAccountDetails(){
        String accountLine0 = "User ID: " + userID + "\n";
        String accountLine1 = "Account Name: " + accountName + "\n";
        String accountLine2 = "Account Balance: " + accountBalance + "\n";
        String message = accountLine0 + accountLine1 + accountLine2;
        
        /*System.out.println(DisplayAccountDetails) 
        will display the concatenated message returned below*/
        return (message);
    }
    
    public int Deposit(int depositAmount){
        //Check if value is an integer
        if(depositAmount % 1 != 0){
            System.out.println("Value must be a whole number.");
        } else if (depositAmount > 0){
            accountBalance = (accountBalance + (depositAmount * 1000));
        }
        return accountBalance;
    }
    
    public int Withdraw(int withdrawAmount){
        if (withdrawAmount % 1 != 0){
            System.out.println("Amount must be a whole number!");
        //Prevent user from withdrawing negative balance, essentially creating an infinite money glitch
        } else if (withdrawAmount > 0){
            accountBalance = (accountBalance - (withdrawAmount * 1000));
        }
        return accountBalance;
    }
    
    public static void main(String[] args) {
    // Create an account with a default balance (0) using the first constructor
        BankAccounting account1 = new BankAccounting("001", "John Doe");
        System.out.println("Initial details for account1:");
        System.out.println(account1.DisplayAccountDetails());

    // Deposit some amount into account1
        account1.Deposit(50);
        System.out.println("After depositing 500 into account1:");
        System.out.println(account1.DisplayAccountDetails());

    // Withdraw some amount from account1
        account1.Withdraw(20);
        System.out.println("After withdrawing 200 from account1:");
        System.out.println(account1.DisplayAccountDetails());

    // Create an account with a starting balance using the second constructor
        BankAccounting account2 = new BankAccounting("002", 1000, "Jane Doe");
        System.out.println("Initial details for account2:");
        System.out.println(account2.DisplayAccountDetails());

    // Depositing into account2
        account2.Deposit(3);
        System.out.println("After depositing 300 into account2:");
        System.out.println(account2.DisplayAccountDetails());

    // Withdrawing from account2
        account2.Withdraw(15);
        System.out.println("After withdrawing 150 from account2:");
        System.out.println(account2.DisplayAccountDetails());

    // Trying to deposit or withdraw invalid amounts (negative or non-whole numbers)
        System.out.println("Testing invalid deposit and withdrawal for account1:");
        account1.Deposit(-50);  // Invalid deposit (negative amount)
        account1.Withdraw(0);   // Invalid withdrawal (zero amount)
    }
    
}
