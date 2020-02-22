package junit1;

class Date 
     {
	int Day;
	int Month;
	int Year;
	// Constructor
	Date(int Day, int Month,  int Year)  	{
		this. Day = Day;
		this. Month = Month;
		this. Year = Year;
	}
	// setter and getter methods
	void setDay(int Day)	
	{
		this.Day = Day;
	}
		int getDay( )		
	{
		return  this.Day;
	}
	
	void setMonth(int Month)
	{
		this.Month = Month;
	}

	int getMonth( )
	{
		return  this.Month;
	}

	void setYear(int Year)
	{
		this.Year=Year;
	}



	int getYear( )
	{
		return  this.Year;
	}
 	
 	public String toString() //converts date obj to string.    
 	{
 		return	"Date is" +Day+ "/"+Month+"/"+Year; 
 	}
 	
 	
 	} // Date class

