package vjit;

abstract class AbstractAccount1 {
	protected static  long accnum =101;
	 protected double balance;
	 private String name;
	 private int age;

	
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
		public void deposit(double damount)
		{
			balance=damount+balance;
			setBalance(balance);
		}
		abstract void withdraw(double wamount);
		
		
		public String toString()
		{
			return getName()+"  "+getAge()+"  "+getAccnum()+"  "+getBalance();
		}
}
