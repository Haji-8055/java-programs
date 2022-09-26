class FoodItemsDataOperator{
	
	static String[] foodNames={null,null,null,null,null};
	static int i=0;
	
	static void save(String value)
	{
		foodNames[i]=value;
		System.out.println("The value saved at index " +i+ " is " +value);
		i++;		
	}
	
	static void displayDetails()
	{
		for(int j=0;j<foodNames.length;j++)
		{
			System.out.println("The food "+(j+1)+" is " +foodNames[j]);
		}
	}
}