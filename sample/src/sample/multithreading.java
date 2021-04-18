package exercise3;

public class multithreading {
	public static void main (String [] args)
	   {
	      Transaction t = new Transaction ();
	      Threadbank t1 = new Threadbank (t, "Deposit Thread");
	      Threadbank t2 = new Threadbank (t, "Withdrawal Thread");
	      t1.start ();
	      t2.start ();
	   }
	}
	class Transaction 
	{
	   public static String transName;
	   public static double amount;
	}
	class Threadbank extends Thread
	{
	   private Transaction t;
	   Threadbank (Transaction t, String name)
	   {
	      super (name); 
	      this.t = t; 
	   }
	   public void run ()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	           if (getName ().equals ("Deposit Thread"))
	           {
	              
	               t.transName = "Deposit";
	               try
	               {
	                  Thread.sleep (1000);
	               }
	               catch (InterruptedException e)
	               {
	               }
	               t.amount = 4500.0;
	               System.out.println (t.transName + " " + t.amount);
	               
	           }
	           else
	           {
	               t.transName = "Withdrawal";
	               
	               try
	               {
	                  Thread.sleep (1000);
	               }
	               catch (InterruptedException e)
	               {
	               }
	               t.amount = 3600.0;
	               System.out.println (t.transName + " " + t.amount);
	           }
	      }
	   }
}
