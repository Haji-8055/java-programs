class TrimmerRunner{
	public static void main(String [] scissor){
		System.out.println("colour : "+Trimmer.colour);
		System.out.println("Brand : "+Trimmer.brand);
		System.out.println("Price : "+Trimmer.price);
		System.out.println("Warranty : "+Trimmer.warranty);
		System.out.println("Working Condition : "+Trimmer.working);
		
		for(int i=0; i<Trimmer.totalSettings.length;i++)
		{
			
			System.out.println("The setting at "+i+" index is : "+Trimmer.totalSettings[i]);
		}
		
		System.out.println("Re-initialized variables");

		Trimmer.colour="Golden";
		Trimmer.brand="Nova";
		Trimmer.price= 900;
		Trimmer.warranty=2;
		Trimmer.working= true;
		Trimmer.totalSettings[0]=6;
		Trimmer.totalSettings[1]=12;
		Trimmer.totalSettings[3]=3;
		System.out.println("colour : "+Trimmer.colour);
		System.out.println("Brand : "+Trimmer.brand);
		System.out.println("Price : "+Trimmer.price);
		System.out.println("Warranty : "+Trimmer.warranty);
		System.out.println("Working Condition : "+Trimmer.working);
		
		
		for(int i=0; i<Trimmer.totalSettings.length;i++)
		{
			
			System.out.println("The setting at "+i+" index is : "+Trimmer.totalSettings[i]);
		}

		
	}
	
	
	
}