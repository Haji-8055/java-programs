class Vehicle{
	static double transport(String source,String destination)
	{	
		System.out.println("Executing method with two string parameters");
		System.out.println("The source is " +source+ " and destination is "+destination);
		return 180d;
	}
	static double transport(String source,String destination,double onTime)
	{
		System.out.println("Executing method with two string parameters and a double");
		System.out.println("The source is " +source+ " and destination is " +destination+ " Reaching time is " +onTime);
		return 160d;
	}
	static boolean transport(String destination)
	{
		System.out.println("Executing method with a single string parameter");
		System.out.println("The destination is " +destination );
		return true;
	}	
	static boolean transport(String destination,double onTime)
	{
		System.out.println("Executing method with a string and double parameter");
		System.out.println("The destination is " +destination+ " and Reaching time is " +onTime);
		return false;
	}
	static boolean transport(double onTime)
	{
		System.out.println("Executing method with a single double parameter");
		System.out.println("The Reaching time is " +onTime);
		return false;
	}				
}