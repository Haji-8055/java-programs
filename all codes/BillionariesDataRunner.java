class BillionariesDataRunner{
	
	public static void main(String[] ballers)
	{
	System.out.println("Running save method");
	BillionariesData.save("Elon Musk");
	BillionariesData.save("Bernard Arnault");
	BillionariesData.save("Jeff Bezos");            //Steve Ballmer
	BillionariesData.save("Gautam Adani");
	BillionariesData.save("Bill Gates");
	BillionariesData.save("Warren Buffet");
	BillionariesData.save("Larry Ellison");
	BillionariesData.save("Larry Page");
	BillionariesData.save("Mukesh Ambani");
	BillionariesData.save("Sergey Brin");
	
	BillionariesData.displayDetails();

	
	System.out.println("does billionarie exist in the array? : "+BillionariesData.find("Jeff Bezos"));
	
	System.out.println("The updated oldBillionarie  to newBillionarie is :" +BillionariesData.update("Sergey Brin","Steve Ballmer"));
	

	
	BillionariesData.update(6,"Ambani");
	
	BillionariesData.delete("Larry Page");
	
	}
}