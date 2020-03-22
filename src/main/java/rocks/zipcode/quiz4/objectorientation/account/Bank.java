package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private ArrayList<Integer> bankAccounts;
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        bankAccounts.remove(indexNumber);
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.contains(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (bankAccounts.contains(bankAccount)){
            return true;
        }
        else{
            throw new UnsupportedOperationException("Method not yet implemented");
        }

    }
}
