package accounts;

public class CurrentAccount extends Account{

    private double overdrawLimit = 100.0;

    public CurrentAccount(int number, int overdrawLimit) {
        super(number);
        this.overdrawLimit=overdrawLimit;
    }
    public void overDrawLimitR(){
        final double currentBalance= super.getBalance();
        if(currentBalance <=0 && -currentBalance>=overdrawLimit)
            System.err.println("CurrenAccount.overDrawLimitR():send notification");
    }
    public String toString() {
        return "CurrentAccount{ "+ "overdrawLimit = " + overdrawLimit + ", " + super.toString() + "} ";
    }



}