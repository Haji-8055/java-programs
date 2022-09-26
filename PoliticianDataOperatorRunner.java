class PoliticianDataOperatorRunner{
	
	public static void main(String[] news)
	{
		System.out.println("Running save method");
		String politician1= "Kejriwal";
		PoliticianDataOperator.save(politician1);
		PoliticianDataOperator.save("Bommai");
		PoliticianDataOperator.save("Modi");
		PoliticianDataOperator.save("Kumarswami");
		PoliticianDataOperator.save("Charantimath");
	
		System.out.println("Running displayDetails method");
		PoliticianDataOperator.displayDetails();
	}
}