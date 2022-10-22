class CardRunner{
	
	public static void main(String[] visa)
	{   
		Card.displayDetails();
		
		Card.type="Debit Card";
		Card.height=60d;
		Card.width= 90d;
		Card.price= 150;
		String[] ref={"Red","Blue","Black","Grey"};
		Card.colours=ref;
		Card.displayDetails();
		
	}
}