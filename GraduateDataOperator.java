class GraduateDataOperator{
	
	static String[] graduates={null,null,null,null,null};
	static int i=0;
	
	static void save(String value)
	{
		graduates[i]=value;
		System.out.println("The value saved at index " +i+ " is " +value);
		i++;		
	}
	
	static void displayDetails()
	{
		for(int j=0;j<graduates.length;j++)
		{
			System.out.println("The graduate "+(j+1)+" is " +graduates[j]);
		}
	}
}