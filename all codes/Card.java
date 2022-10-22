class Card{
	
	static String type;
	static double height;
	static double width;
	static int price;
	static String[] colours;
	
	static void displayDetails()
	{
		System.out.println("Card type: "+type);
		System.out.println("Card height: "+height+"mm");
		System.out.println("Card width: "+width+"mm");
		System.out.println("Card price: "+price);
		
		if(colours!=null)
		{
		  System.out.println("colours is not directing to null so array is Executed");
		  for(int i=0; i<colours.length;i++)
		  {
			System.out.println(colours[i]);
		  }
		}
		
		else{
				System.out.println("colours is directing to null .So for loop cannot be performed hence array is skipped");
			}
	}
}