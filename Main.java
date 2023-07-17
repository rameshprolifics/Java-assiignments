public class Main
{
	public static void main(String[] args) {
		
		
		Account sa1 = new SavingAccount(123,"1-1-2001",5000,2000,2);
		Account sa2 = new SavingAccount(123,"1-1-2001",5000,2000,2);
		Account sa3 = new SavingAccount(123,"1-1-2001",5000,2000,2);
		Account sa4 = new SavingAccount(123,"1-1-2001",5000,2000,2);
		Account sa5 = new SavingAccount(123,"1-1-2001",5000,2000,2);
		Account ca1 = new CurrentSaving(321,"2-2-2001",3000,1000);
		Account ca2 = new CurrentSaving(322,"2-2-2001",3000,1000);
		Account ca3 = new CurrentSaving(323,"2-2-2001",3000,1000);
		Account ca4 = new CurrentSaving(324,"2-2-2001",3000,1000);
		Account ca5 = new CurrentSaving(325,"2-2-2001",3000,1000);
		
		
		
		Bank ba = new Bank("SBI","Rusthapur");
		
	    
        
        ba.addAccount(sa1);
        ba.addAccount(sa2);
        ba.addAccount(sa3);
        ba.addAccount(sa4);
        ba.addAccount(sa5);
        
        ba.addAccount(ca1);
        ba.addAccount(ca2);
        ba.addAccount(ca3);
        ba.addAccount(ca4);
        ba.addAccount(ca5);
        
        
        
        System.out.println(ba.Transaction('D',123,2000));
        
        System.out.println();
        
        System.out.println(ba.Transaction('W',321,100));
        
        System.out.println();
        
        
        
		
		
		System.out.println("   Accounts details in a Bank");
		System.out.println("****************************************");
		System.out.println();
		ba.showAccounts();
		
		
		
		
		
		

		
		
		
		
		
	}
}
