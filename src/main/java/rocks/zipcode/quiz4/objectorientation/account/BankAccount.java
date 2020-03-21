package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{
    private Double val;
    private Object IllegalArgumentException;


    public void setBalance(Double val) {
        this.val = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy > 0){
            val += amountToIncreaseBy;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy > 0) {
            val -= amountToDecreaseBy;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Double getBalance() {
        return val;
    }
}
