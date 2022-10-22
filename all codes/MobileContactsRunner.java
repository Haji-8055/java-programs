class MobileContactsRunner{
	
	public static void main(String[] contacts)
	{
		System.out.println("Entered getNameByMobileNumber Method");
		
		String ref=MobileContacts.getNameByMobileNumber(9876543210l);
		System.out.println("THE Contact Name is "+ref);
		
		String ref1=MobileContacts.getNameByMobileNumber(8095807786L);
		System.out.println("THE Contact Name is "+ref1);
		
		String ref2=MobileContacts.getNameByMobileNumber(9060909585L);
		System.out.println("THE Contact Name is "+ref2);
		
		String ref3=MobileContacts.getNameByMobileNumber(8550888955L);
		System.out.println("THE Contact Name is "+ref3);
		
		String ref4=MobileContacts.getNameByMobileNumber(8861404906L);
		System.out.println("THE Contact Name is "+ref4);
		
		String ref5=MobileContacts.getNameByMobileNumber(8550882281L);
		System.out.println("THE Contact Name is "+ref5);
		
		String ref6=MobileContacts.getNameByMobileNumber(7019449008L);
		System.out.println("THE Contact Name is "+ref6);
		
		String ref7=MobileContacts.getNameByMobileNumber(95385536004L);
		System.out.println("THE Contact Name is "+ref7);
		
		String ref8=MobileContacts.getNameByMobileNumber(6364657990L);
		System.out.println("THE Contact Name is "+ref8);
		
		String ref9=MobileContacts.getNameByMobileNumber(6364723855L);
		System.out.println("THE Contact Name is "+ref9);
		
		String ref10=MobileContacts.getNameByMobileNumber(63623855L); // check for the null return
		System.out.println("THE Contact Name is "+ref10);


	}
}