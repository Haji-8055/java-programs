class ParseRunner{
	
	public static void main(String[] value)
	{
		String productName= value[0];
		String productType= value[1];
		String productPrice=value[2];
		String productQuantity=value[3];
		String productQuality= value[4];
		
		System.out.println("productName: "+productName);
		System.out.println("productType: "+productType);
		System.out.println("productPrice: "+productPrice);
		System.out.println("productQuantity: "+productQuantity);
		System.out.println("productQuality: "+productQuality);
		
		int covertedPrice=Integer.parseInt(productPrice);
		int covertedQuantity=Integer.parseInt(productQuantity);		
		
		int totalPrice= covertedPrice*covertedQuantity;
		System.out.println("Total price: "+totalPrice);
	}
}