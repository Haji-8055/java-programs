class Sports{
	
	static void cricketTeamMembers(String[] names)								// 1st method
	{
		System.out.println("Running cricketTeamMembers");
		for(int i=0; i<names.length; i++)
		{
		  System.out.println("Player Name : "+names[i]);
		}
	}
	
	static void kabbadiTeamMembersJerseyNos(int[] nos)						// 2nd method
	{
		System.out.println("Running kabbadiTeamMembersJerseyNos");  
		for(int i=0; i<nos.length; i++)
		{
		  System.out.println("Jersey No: "+nos[i]);
		}
	}
	
	static void footBallTeamMembersSalary(double[] salaries)				//3rd method
	{
		System.out.println("Running footBallTeamMembersSalary");
		for(int i=0; i<salaries.length; i++)
		{
		  System.out.println("salary: "+salaries[i]);
		}
	}
	
	static void ludoTeamMobileNumber(long[] numbers)						//4th method
	{
		System.out.println("Running ludoTeamMobileNumber");
		for(int i=0; i<numbers.length; i++)
		{
		  System.out.println("Mobile Numbers: "+numbers[i]);
		}
	}
	
	static void hockeyTeamMembersNumberOfMatches(int[] matches)				//5th method
	{
		System.out.println("Running hockeyTeamMembersNumberOfMatches");  
		for(int i=0; i<matches.length; i++)
		{
		  System.out.println("No of matches: "+matches[i]);
		}
	}
	
	static void kokoTeamMembersCountryCode(long[] code)					//6th method
	{
		System.out.println("Running kokoTeamMembersCountryCode");
		for(int i=0; i<code.length; i++)
		{
		  System.out.println("Country code: "+code[i]);
		}
	}
	
	static void lagoriTeamMembersAlive(boolean[] status)				//7th method
	{
		System.out.println("Running lagoriTeamMembersAlive");
		for(int i=0; i<status.length; i++)
		{
		  System.out.println(i+1+ " player alive: " +status[i]);
		}
	}
}