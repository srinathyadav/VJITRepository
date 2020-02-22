package vjit;
import java.util.*;
import java.util.Scanner;

public class Account extends PersonId
{
protected static  long accnum =101;
 protected double balance;
	
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
		return getName()+"  "+getAge()+"  "+getAccnum()+"  "+getBalance();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the details of the account holder");
String name=sc.nextLine();
double amount=sc.nextDouble();
int age=sc.nextInt();
Account a1=new Account();
  a1.setName(name);
  a1.setBalance(amount);
 a1.setAge(age);
  a1.setAccnum(accnum);
  System.out.println("next person name,age,amount");
 String name1=sc.next();
  double amount1=sc.nextDouble();
 int age1=sc.nextInt();
 Account a2=new Account();
 a2.setAccnum(a1.accnum);
 a2.setName(name1);
  a2.setBalance(amount1);
  a2.setAge(age1);
// a2.getBalance();
// System.out.println("balance "+a2.getBalance());
  System.out.println("deposit 2000 in acc1");
double amount2=sc.nextDouble();
a1.deposit(amount2);
System.out.println("withdraw 3000 from acc2");

double amount3=sc.nextDouble();
a2.withdraw(amount3);


sc.close();
System.out.println("Balance in"+a1.getName()+" account is "+a1.getBalance());
System.out.println("Balance in "+a2.getName()+" account is "+a2.getBalance());
System.out.println(a1.toString());
System.out.println(a2.toString());
	}


	}

