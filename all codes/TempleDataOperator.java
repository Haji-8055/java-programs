class TempleDataOperator{
	
	static String[] names={null,null,null,null,null};
	static int i=0;
	
	static void save(String value)
	{
		names[i]=value;
		System.out.println("The value saved at index " +i+ " is " +value);
		i++;		
	}
	
	static void displayDetails()
	{
		for(int j=0;j<names.length;j++)
		{
			System.out.println("The Temple "+(j+1)+" is " +names[j]);
		}
	}
}