
public class  AccountDanger implements Runnable {
	private Account acct =new Account();
	public static void main(String [] args){
		AccountDanger r=new AccountDanger();
		Thread one=new Thread(r);
		Thread two=new Thread(r);
		one.setName("one");
		two.setName("two");
		one.start();
		two.start();
	}
	public void run(){
		for(int x=0;x<5;x++){
			makeWithdrawal(10);
			if(acct.getBalance()< 0){
				System.out.println("Account is overdrawan");
				
			}
		}
			
	}
	
	private  void makeWithdrawal(int amt){
		if(acct.getBalance()>=amt){
			System.out.println(Thread.currentThread().getName()+ "is going to withdrawn");
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+ "has completed  withdrawn");
		}else{
			System.out.println("Not enough in account for " +Thread.currentThread().getName()+ "to withdraw"+acct.getBalance());
		}
	}
}

class Account{
	private int balance=57;
	public int getBalance(){
		return balance;
		
	}
	public void withdraw(int amount){
		balance =balance-amount;
	}
}
