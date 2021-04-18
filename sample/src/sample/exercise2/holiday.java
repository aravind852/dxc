package sample.exercise2;

public class holiday {
		
		private String name;
		private int day; 
		private String month;

	public String setname()
	{       this.name="Gandhi Jayanthi";
			return name;
	}
		public int setday()
		{       this.day=02;
				return day;
		}
		public String setmonth()
		{       this.month = "October";
				return month;
		}
	 public static void main(String args[])
	 {
		 holiday h = new holiday();
		 System.out.println(h.setday()+"-"+h.setmonth()+"="+h.setname());
	 }
			
		
	}


