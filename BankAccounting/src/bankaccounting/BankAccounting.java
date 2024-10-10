/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccounting;

/**
 *
 * @author Edgar Thorne
 */
public class BankAccounting {
    
    public BankAccounting(){
        
    }
    private String userID;
    private int accountBalance;
    public String accountName;
    
    public int CheckBalance(){
        return(accountBalance);
    };
    public String DisplayAccountDetails(){
        String accountLine0 = "User ID: " + userID + "\n";
        String accountLine1 = "Account Name: " + accountName + "\n";
        String accountLine2 = "Account Balance: " + accountBalance + "\n";
        String message = accountLine0 + accountLine1 + accountLine2;
        return (message);
    }
    private void UpdateBalance(int newBalance){
        accountBalance = newBalance;
    }
    
    public int Deposit(int depositAmount){
        accountBalance = (accountBalance + (depositAmount * 1000));
        UpdateBalance(accountBalance);
        return accountBalance;
    }
    
    public int Withdraw(int withdrawAmount){
        accountBalance = (accountBalance + (withdrawAmount * 1000));
        UpdateBalance(accountBalance);
        return accountBalance;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
