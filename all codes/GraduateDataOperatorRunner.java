class GraduateDataOperatorRunner{
	
	public static void main(String[] news)
	{
		System.out.println("Running save method");
		String graduate1= "Haji";
		GraduateDataOperator.save(graduate1);
		GraduateDataOperator.save("Suhel");
		GraduateDataOperator.save("Furqan");
		GraduateDataOperator.save("Ganesh");
		GraduateDataOperator.save("Mahesh");
	
		System.out.println("Running displayDetails method");
		GraduateDataOperator.displayDetails();
	}
}