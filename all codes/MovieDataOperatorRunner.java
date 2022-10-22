class MovieDataOperatorRunner{
	
	public static void main(String[] film)
	{
		System.out.println("Running save method");
		String movie1= "KGF";
		MovieDataOperator.save(movie1);
		MovieDataOperator.save("Sanam teri kasam");
		MovieDataOperator.save("Bahubali");
		MovieDataOperator.save("RRR");
		MovieDataOperator.save("Force");
	
		System.out.println("Running displayDetails method");
		MovieDataOperator.displayDetails();
	}
}