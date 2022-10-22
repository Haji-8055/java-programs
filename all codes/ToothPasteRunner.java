class ToothPasteRunner{
	
	public static void main(String[] paste)
	{
		ToothPaste.setBrandName("colgate");
		System.out.println("The brandName using **get** method: "+ToothPaste.getBrandName());
		
		ToothPaste.setFlavour("Miswak");
		System.out.println("The flavour using **get** method: "+ToothPaste.getFlavour());
		
		ToothPaste.setColour("Cream");
		System.out.println("The Colour using **get** method: "+ToothPaste.getColour());
		
		ToothPaste.setContent("Chemicals");
		System.out.println("The Content using **get** method: "+ToothPaste.getContent());
		
		ToothPaste.setQuality("Good");
		System.out.println("The Quality using **get** method: "+ToothPaste.getQuality());
		
		ToothPaste.setUse("Adults");
		System.out.println("The use using **get** method: "+ToothPaste.getUse());
		
		ToothPaste.setQuantityInGrams(500);
		System.out.println("The QuantityInGrams using **get** method: "+ToothPaste.getQuantityInGrams());
		
		ToothPaste.setQuatityInNumbers(2);
		System.out.println("The QuatityInNumbers using **get** method: "+ToothPaste.getQuatityInNumbers());
		
		ToothPaste.setHeight(80D);
		System.out.println("The Height using **get** method: "+ToothPaste.getHeight());
		
		ToothPaste.setWidth(20D);
		System.out.println("The Width using **get** method: "+ToothPaste.getWidth());
		
		ToothPaste.setWeight(440D);
		System.out.println("The Weight using **get** method: "+ToothPaste.getWeight());
		
		ToothPaste.setPrice(210D);
		System.out.println("The Price using **get** method: "+ToothPaste.getPrice());
		
		ToothPaste.setTubeMouthRadius(5D);
		System.out.println("The TubeMouthRadius using **get** method: "+ToothPaste.getTubeMouthRadius());
		
		ToothPaste.setPasteEmptyInTube(true);
		System.out.println("The PasteEmptyInTube using **get** method: "+ToothPaste.isPasteEmptyInTube());
		
		ToothPaste.setExpired(false);
		System.out.println("The Expired using **get** method: "+ToothPaste.isExpired());
	}
}