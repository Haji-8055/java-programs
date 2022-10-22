class FoodRunner{
	
	public static void main(String[] food){
		
		String food1 = "Chicken65";
	    String food2 = "Birayni";
		String food3 = "Dosa";
		String food4 = "Idli";
		String food5 = "Palav";
		String food6 = "Vada";
		String food7 = "Chapati";
		String food8 = "Gobi";
		String food9 = "Icecream";
		String food10= "Mango";
		String food11= "Roti";
		String food12= "Salad";
		String food13= "Noodles";
		String food14= "Egg Rice";
		String food15= "Pakoda";
		String food16= "Momos";
		String food17= "Shawarma";
		String food18= "Soan Paapdi";
		String food19= "Gulab Jamun";
		String food20= "Apple";
		
		String Fooditems[] = { food1, food2, food3, food4, food5, food6, food7, food8,
             		    food9, food10, food11 ,food12 ,food13 ,food14, food15, food16, 
		                food17, food18, food19, food20};
						
						System.out.println(" The Number of food Items are "+Fooditems.length);
						
						for(int i=0; i<Fooditems.length;i++)
						{
							System.out.println(" The " +i+ " index number food is "+Fooditems[i]);
							
						}
						
						Fooditems[3]= "Pasta";
						Fooditems[7]= "Juice";
						System.out.println("\n The list updated with 4th and 8th item ");
						for(int i=0; i<Fooditems.length;i++)
						{
							System.out.println(" The " +i+ " index number food is "+Fooditems[i]);
							
						}
						 
			
		}
		
		
	}
