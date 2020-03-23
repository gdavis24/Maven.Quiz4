package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    private BankAccount bankAccount;
    private Double numberOfHours = 0.0;
    private Double hourlyWage = 35.0;
    private Double val;
    private Double income = 0.0;
    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.numberOfHours = 0.0;
        this.hourlyWage = 35.0;
        this.income = numberOfHours * hourlyWage;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hourlyWage =+ numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return numberOfHours;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return income;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }
}
