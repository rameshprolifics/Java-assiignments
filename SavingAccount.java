class SavingAccount extends Account{
    private double minimumDepositAmount;
    private int noOfTransactionPerDay;
    
    
    public SavingAccount(int accountNo, String openedDate, double balance,double minimumDepositAmount, int noOfTransactionPerDay){

        super(accountNo,openedDate,balance);

        this.minimumDepositAmount=validateMinimumDepositAmount(minimumDepositAmount);
        this.noOfTransactionPerDay=noOfTransactionPerDay;
    }
    
    public void setMinimumDepositAmount(double minimumDepositAmount){
        this.minimumDepositAmount=minimumDepositAmount;
    }
    
    public double getMinimumDepositAmount(){
        return minimumDepositAmount;
    }
    
    public void setNoOfTransactionPerDay(int noOfTransactionPerDay){
        this.noOfTransactionPerDay=validateNoOfTransactionPerDay(noOfTransactionPerDay);
    }
    
    public int getNoOfTransactionPerDay(){
        return noOfTransactionPerDay;
    }
    
    public double validateMinimumDepositAmount(double minimumDepositAmount){
        if(minimumDepositAmount>1000)
            return minimumDepositAmount;
        throw new RuntimeException("Minimum Deposit Must be greater than 1000");
    }
    
    public int validateNoOfTransactionPerDay(int noOfTransactionPerDay){
        if(noOfTransactionPerDay<10)
            return noOfTransactionPerDay;
        throw new RuntimeException("No of Transaction per Day is 10");
    }
    
    public double UpdatedBalance(){
        return getBalance()+getMinimumDepositAmount();
    }
    
}