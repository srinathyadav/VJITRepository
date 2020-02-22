package vjit;



public class Account1 
{
protected long accnum =101;
 protected double balance=500;
 protected String name;
 protected int age;

 public String getName() {
 	return name;
 }
 public void setName(String name) {
 	this.name = name;
 }
 public int getAge() {
 	return age;
 }
 public void setAge(int age) {
 	this.age = age;
 }
	
	public long getAccnum() {
		return accnum;
	}

	public void setAccnum(long accnum) {
		accnum+=1;
		this.accnum = accnum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance =balance;
	}
	
	public void deposit(double damount)
	{
		balance=damount+balance;
		setBalance(balance);
	}
	protected void withdraw(double wamount)
	{
		if(getBalance()>=wamount)
		{
		balance=balance-wamount;
		setBalance(balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public String toString()
	{
		return getName()+" "+getAccnum()+"  "+getBalance()+" "+getAge();
	}
}
	
	
