class BillionariesData{
	
	static String[] billionaries={null,null,null,null,null,null,null,null,null,null,};
	static int position=0;
	
	static void save(String billionarie)
	{
		if(billionaries.length>10)
		{
			System.out.println("Array elements exceeded");
		}
			if(billionarie!=null && billionarie.length()>4)
			{
				billionaries[position]=billionarie;
				System.out.println("The value saved at index " +position+ " is " +billionarie);
				position++;		
			}
	}
	
	static void displayDetails()
	{
			System.out.println("Running displayDetails method");		
		for(int j=0;j<billionaries.length;j++)
		{
			System.out.println("The billionarie at position "+(j+1)+" in the world is " +billionaries[j]);
		}
	}
	
	static boolean find(String billionarie)
	{	
		System.out.println("Running find method");
		if(billionarie!=null && billionarie.length()>4)
		{
			System.out.println("String is valid ,find operation can be performed");
			for(int find=0; find<billionaries.length; find++)
			{
				if(billionaries[find]==billionarie)
				{
					System.out.println("The billionarie "+billionarie+" exist in the array at index "+find);
					return true;
				}
			}
	    }else{
			   System.out.println("The billionarie does not exist in the array");
			 }
			 return false;
    }
	
	static String update(String oldBillionarie,String newBillionarie)
	{
		System.out.println("Running update method using two string parameteres");
		if(oldBillionarie!=null && newBillionarie!=null)
		{
			if(oldBillionarie.length()>4 && newBillionarie.length()>4)
			{
			for(int index=0; index<billionaries.length; index++)
			{
				if(billionaries[index]==oldBillionarie)
				{
					System.out.println("The billionarie "+oldBillionarie+" is at the position " +(index+1)+" in the world");
					billionaries[index]=newBillionarie;
					System.out.println("The new billionarie at position "+(index+1)+ " in the world is " +newBillionarie);
					return newBillionarie;
				}
			}
			}
		}else{
			   System.out.println("The billionarie does not exist in the array");
			 }
				return oldBillionarie;
	}
	
	 static String update(int index,String newBillionarie)
	 {
		System.out.println("Running update method using one int and a string parameter");		 
		 if(newBillionarie!=null && newBillionarie.length()>4)
		 {
			System.out.println("The billionarie at index "+index+ " is "+billionaries[index] );
			billionaries[index]=newBillionarie;
			System.out.println("The updated billionarie at index "+index+ " is "+billionaries[index] );
			
	     }
		 return newBillionarie;
     }
	 
	 static boolean delete(String billionarie)
	{	
		System.out.println("Running delete method");
		if(billionarie!=null && billionarie.length()>4)
		{
			System.out.println("String is valid ,delete operation can be performed");
			for(int delete=0; delete<billionaries.length; delete++)
			{
				if(billionaries[delete]==billionarie)
				{
					billionaries[delete]=null;
					System.out.println("The billionarie at index " +delete+ " is " +billionaries[delete]);
					return true;
				}
			}
	    }else{
			   System.out.println("The billionarie does not exist in the array");
			 }
			 return false;
    }
}