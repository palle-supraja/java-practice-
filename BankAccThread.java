package Anudip;

class BankMethods {
	 
    int total = 5000;

    void withdraw(String name, int withdrawal)
   {
       if (total >= withdrawal) {
           System.out.println(name + " withdrawn "
                              + withdrawal);

           total = total - withdrawal;
           System.out.println("Balance after withdrawal: "
                              + total);
                       try {

                           Thread.sleep(1000);
           }

            catch (InterruptedException e) {  }
       }
       else {

                System.out.println(name
                              + " you can not withdraw "
                              + withdrawal);

           System.out.println("your balance is: " + total);
           try {
               Thread.sleep(1000);
           }

           catch (InterruptedException e) { }
       }
   }
   void deposit(String name, int deposit)
   {
       System.out.println(name + " deposited " + deposit);
       total = total + deposit;
       System.out.println("Balance after deposit: "
                          + total);
       
       try {
           Thread.sleep(1000);
       }
       catch (InterruptedException e) { }    }
}

public class BankAccThread {

	public static void main(String[] args) {
	
		 BankMethods b = new BankMethods();

	       b.withdraw("MR. X", 120);
	       b.withdraw("MRS. Y", 20);
	       b.deposit("MR. Q", 15);
	       b.withdraw("ABC", 210);
	}

}
