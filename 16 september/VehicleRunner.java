class VehicleRunner{
	public static void main(String[] City)
	{
		double ref= Vehicle.transport("Bus","Tumkur");  		//explicit reference
		System.out.println("The price to travel is "+ ref);
		
		System.out.println("The price to travel is "+ Vehicle.transport("Bus","Tumkur",8.15)); 	//implicit reference
		
		System.out.println("The bus reached destination ? : "+Vehicle.transport("Tumkur")); 

		System.out.println("The bus reached destination onTime ? : "+Vehicle.transport("Tumkur",8.15)); 
		
		System.out.println("The bus reached onTime ? : "+Vehicle.transport(8.15)); 
	}
}