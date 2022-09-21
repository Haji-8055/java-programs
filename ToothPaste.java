class ToothPaste{
	
	static String brandName;
	static String flavour; 
	static String colour; 
	static String content;
	static String quality;
	static String use;
	static int    quantityInGrams;
	static int    quatityInNumbers;
	static double height;
	static double width;
	static double weight;
	static double price;
	static double tubeMouthRadius; 
	static boolean pasteEmptyInTube;
	static boolean expired;

	static void setBrandName(String value)		//1
	{
		brandName=value;
		System.out.println("The brandName using **set** method: "+brandName);
	}
	static String getBrandName()
	{
		return brandName;
	}
	
	
	static void setFlavour(String value)	//2
	{
		flavour=value;
		System.out.println("The flavour using **set** method: "+flavour);
	}
	static String getFlavour()
	{
		return flavour;
	}
	
	static void setColour(String value)//3
	{
		colour=value;
		System.out.println("The colour using **set** method: "+colour);
	}
	static String getColour()
	{
		return colour;
	}
	
	static void setContent(String value)//4
	{
		content=value;
		System.out.println("The content using **set** method: "+content);
	}
	static String getContent()
	{
		return content;
	}
	
	static void setQuality(String value)//5
	{
		quality=value;
		System.out.println("The quality using **set** method: "+quality);
	}
	static String getQuality()
	{
		return quality;
	}
	
	static void setUse(String value)//6
	{
		use=value;
		System.out.println("The use using **set** method: "+use);
	}
	static String getUse()
	{
		return use;
	}
	
	
	static void setQuantityInGrams(int value)//7
	{
		quantityInGrams=value;
		System.out.println("The quantityInGrams using **set** method: "+quantityInGrams);
	}
	static int getQuantityInGrams()
	{
		return quantityInGrams;
	}
	

	static void setQuatityInNumbers(int value)//8
	{
		quatityInNumbers=value;
		System.out.println("The quatityInNumbers using **set** method: "+quatityInNumbers);
	}
	static int getQuatityInNumbers()
	{
		return quatityInNumbers;
	}
	
	static void setHeight(double value)//9
	{
		height=value;
		System.out.println("The height using **set** method: "+height);
	}
	static double getHeight()
	{
		return height;
	}
	
	static void setWidth(double value)//10
	{
		width=value;
		System.out.println("The width using **set** method: "+width);
	}
	static double getWidth()
	{
		return width;
	}
	
	static void setWeight(double value)//11
	{
		weight=value;
		System.out.println("The weight using **set** method: "+weight);
	}
	static double getWeight()
	{
		return weight;
	}
	
	static void setPrice(double value)//12
	{
		price=value;
		System.out.println("The price using **set** method: "+price);
	}
	static double getPrice()
	{
		return price;
	}
	
	static void setTubeMouthRadius(double value)//13
	{
		tubeMouthRadius=value;
		System.out.println("The tubeMouthRadius using **set** method: "+tubeMouthRadius);
	}
	static double getTubeMouthRadius()
	{
		return tubeMouthRadius;
	}
	
	static void setPasteEmptyInTube(boolean value)//14
	{
		pasteEmptyInTube=value;
		System.out.println("The pasteEmptyInTube using **set** method: "+pasteEmptyInTube);
	}
	static boolean isPasteEmptyInTube()
	{
		return pasteEmptyInTube;
	}
	
	static void setExpired(boolean value)//15
	{
		expired=value;
		System.out.println("The expired using **set** method: "+expired);
	}
	static boolean isExpired()
	{
		return expired;
	}
}