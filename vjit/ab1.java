package vjit;
import java.util.Scanner;

class ab1 extends AbstractAccount1{
		public void withdraw(double wamount)
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
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details of the account holder");
		String name=sc.nextLine();
		double amount=sc.nextDouble();
		int age=sc.nextInt();
		ab1 a1=new ab1();
		  a1.setName(name);
		  a1.setBalance(amount);
		 a1.setAge(age);
		  a1.setAccnum(accnum);
		  System.out.println("next person name,age,amount");
		 String name1=sc.next();
		  double amount1=sc.nextDouble();
		 int age1=sc.nextInt();
		ab1 a2=new ab1();
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
