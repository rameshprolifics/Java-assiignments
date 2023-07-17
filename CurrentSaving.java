class CurrentSaving extends Account{
    private double overDraftLimit;
    
    public CurrentSaving(int accountNo,String openedDate,double balance,double overDraftLimit){
        
        super(accountNo,openedDate,balance);
        
        this.overDraftLimit = overDraftLimit;
    }
    
    public void setOverDraftLimit(double overDraftLimit){
        this.overDraftLimit=overDraftLimit;
    }
    
    public double getOverDraftLimit(){
        return overDraftLimit;
    }
    
    public double UpdatedBalance(){
        return (getBalance()+getOverDraftLimit());
    }
    
}