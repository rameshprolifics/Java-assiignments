class Bank{
    private String bankName;
    private String branchName;
    Account[] accounts;
    private int index = 0;
    
    
    public Bank(String bankName, String branchName){
        this.bankName=bankName;
        this.branchName = branchName;
    }
    
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    
    public String getBankName(){
        return bankName;
    }
    
    public void setBranchName(String branchName){
        this.branchName=branchName;
    }
    
    public String getBranchName(){
        return branchName;
    }
    
    
    public boolean addAccount(Account account) {
        if (index < 10) {
            if (accounts == null) {
                accounts = new Account[10];
            }
            accounts[index] = account;
            index++;
            return true;
        }
        throw new RuntimeException("Cannot add more than 10 accounts");
    }
    
    public void showAccounts(){
        
        for(int i=0;i<index;i++){
            System.out.println("Bank Name                "+getBankName());
            System.out.println("Branch Name              "+getBranchName());
            System.out.println("Account Number           "+accounts[i].getAccountNo());
            System.out.println("Account Opened Date      "+accounts[i].getOpenedDate());
            
            if (accounts[i] instanceof SavingAccount) {
            	
            SavingAccount sa = (SavingAccount) accounts[i];
            
            System.out.println("Account Balance          " + sa.UpdatedBalance());
            } 
            else {
            	
            CurrentSaving cs = (CurrentSaving) accounts[i];	
            System.out.println("Account Balance          " + cs.UpdatedBalance());
            
            }
            
            System.out.println("-------------------------------------");
            System.out.println();
            
        }
    }
    
public boolean Transaction(char type, int accountNo, double amount) {
    if (type == 'W') {
        for (int i = 0; i < index; i++) {
            if (accounts[i] instanceof SavingAccount || accounts[i] instanceof CurrentSaving) {
                if (accountNo == accounts[i].getAccountNo()) {
                    if (accounts[i] instanceof SavingAccount) {
                        SavingAccount sa = (SavingAccount) accounts[i];
                        
                        if (sa.UpdatedBalance() > sa.getMinimumDepositAmount()) {
                        	
                            sa.setBalance(sa.UpdatedBalance() - amount);
                            return true;
                        } 
                        else {
                        	
                            throw new RuntimeException("The balance must be greater than the minimum deposit amount for withdrawal.");
                        }
                    } 
                    else if (accounts[i] instanceof CurrentSaving) {
                    	
                        CurrentSaving cs = (CurrentSaving) accounts[i];
                        
                        if (cs.UpdatedBalance() > amount) {
                            cs.setBalance(cs.UpdatedBalance() - amount);
                            return true;
                        } 
                        else {
                        	
                            throw new RuntimeException("Insufficient balance for withdrawal.");
                        }
                    }
                }
            }
        }
        throw new RuntimeException("The account number is not matched.");
    } else {
        for (int i = 0; i < index; i++) {
            if (accounts[i] instanceof SavingAccount || accounts[i] instanceof CurrentSaving) {
                if (accountNo == accounts[i].getAccountNo()) {
                    if (accounts[i] instanceof SavingAccount) {
                        SavingAccount sa = (SavingAccount) accounts[i];
                        sa.setBalance(sa.UpdatedBalance() + amount);
                        return true;
                    } else if (accounts[i] instanceof CurrentSaving) {
                        CurrentSaving cs = (CurrentSaving) accounts[i];
                        cs.setBalance(cs.UpdatedBalance() + amount);
                        return true;
                    }
                }
            }
        }
        throw new RuntimeException("The account number is not matched.");
    }
}





    
}





