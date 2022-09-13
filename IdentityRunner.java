class IdentityRunner{
	
	public static void main(String[] info)
	{	
		System.out.println("Executing PrintName Method");
		String a1="Furqan";   				//Explicit Reference
		Identity.printName(a1);
		String a2="Ayaz";					// Expilicit Reference
		Identity.printName("Salman");  	                                   		
		Identity.printName("Rahul");
		Identity.printName("Maruti");		 // Implicit Reference
		Identity.printName("Ganesh");
		Identity.printName("Pavan");
		Identity.printName("Vinod");
		Identity.printName("Manju");
		Identity.printName("Ravi");
		
		System.out.println("Executing nameAndEmail Method");
		String name= "Haji";          		  //Declared and initialized
		String email="haji123@gmail.com";
		Identity.nameAndEmail(name,email);   
		
				name="Ganesh";              // re-initializing
				email="Ganesh123@gmail.com";
				Identity.nameAndEmail(name,email);		// Explicit Reference
				
				name ="Maruti";
				email="Maruti123@gmail.com";
				Identity.nameAndEmail(name,email);
				Identity.nameAndEmail("Mahesh","mahesh123@gmail.com");    // Implicit Reference
				Identity.nameAndEmail("Pavan","pavan123@gmail.com");
				Identity.nameAndEmail("Mahesh","mahesh123@gmail.com");
				
				
	}
}