class InternetUsage{
	public static void main(String[] args){
		
		double Insta = 550.50d;
		double Whatsapp= 350.6d;
		double Youtube = 420.5d;
		double Snap  = 150d;
		double  Google =45d;
		
		double[] Apps={Insta,Whatsapp,Youtube,Snap,Google};
		int count=Apps.length;
		System.out.println("The total elements in array are " +count);
		
		double ref0 = Apps[0];		
		double ref1 = Apps[1];
		double ref2 = Apps[2];
		double ref3 = Apps[3];
		double ref4 = Apps[4];
		
		System.out.println("The data used by  Insta is " +ref0+"mb");
		System.out.println("The data used by Whatsapp is " +ref1+"mb");
		System.out.println("The data used by Youtube is " +ref2+"mb");
		System.out.println("The data used by Snap is " +ref3+"mb");
		System.out.println("The data used by Google is " +ref4+"mb");
		
	}
}