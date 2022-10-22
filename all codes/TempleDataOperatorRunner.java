class TempleDataOperatorRunner{
	
	public static void main(String[] mandir)
	{
		System.out.println("Running save method");
		String temple1= "ISKCON TEMPLE";
		TempleDataOperator.save(temple1);
		TempleDataOperator.save("Ram mandir");
		TempleDataOperator.save("Laxmi temple");
		TempleDataOperator.save("Hanuman ");
		TempleDataOperator.save("Tirupati");
	
		System.out.println("Running displayDetails method");
		TempleDataOperator.displayDetails();
	}
}