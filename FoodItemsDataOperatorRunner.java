class FoodItemsDataOperatorRunner{
	
	public static void main(String[] tindi)
	{
		System.out.println("Running save method");
		String food= "Chicken";
		FoodItemsDataOperator.save(food);
		FoodItemsDataOperator.save("Biryani");
		FoodItemsDataOperator.save("Icecream");
		FoodItemsDataOperator.save("Idli");
		FoodItemsDataOperator.save("Vada");
	
		System.out.println("Running displayDetails method");
		FoodItemsDataOperator.displayDetails();
	}
}