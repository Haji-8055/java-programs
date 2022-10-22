class IdentityRunner{
	
	public static void main(String[] info)
	{	
		System.out.println("Executing PrintName Method");
		String a1="Furqan";   				//Explicit reference
		Identity.printName(a1);
		String a2="Ayaz";					// Expilicit reference
		Identity.printName("Salman");  	                                   		
		Identity.printName("Rahul");
		Identity.printName("Maruti");	 // Implicit reference
		Identity.printName("Ganesh");
		Identity.printName("Pavan");
		Identity.printName("Vinod");
		Identity.printName("Manju");
		Identity.printName("Ravi");
		
		System.out.println("Executing nameAndEmail Method");
		String name= "Haji";
		String email="haji123@gmail.com";
		Identity.nameAndEmail(name,email);
				name="Ganesh";
				email="Ganesh123@gmail.com";
				Identity.nameAndEmail(name,email);
	}
}