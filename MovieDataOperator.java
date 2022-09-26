class MovieDataOperator{
	
	static String[] movieNames={null,null,null,null,null};
	static int i=0;
	
	static void save(String value)
	{
		movieNames[i]=value;
		System.out.println("The value saved at index " +i+ " is " +value);
		i++;		
	}
	
	static void displayDetails()
	{
		for(int j=0;j<movieNames.length;j++)
		{
			System.out.println("The movie "+(j+1)+" is " +movieNames[j]);
		}
	}
}