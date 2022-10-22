class PoliticianDataOperator{
	
	static String[] politicianNames={null,null,null,null,null};
	static int i=0;
	
	static void save(String value)
	{
		politicianNames[i]=value;
		System.out.println("The value saved at index " +i+ " is " +value);
		i++;		
	}
	
	static void displayDetails()
	{
		for(int j=0;j<politicianNames.length;j++)
		{
			System.out.println("The politician "+(j+1)+" is " +politicianNames[j]);
		}
	}
}