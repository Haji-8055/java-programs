class SportsRunner{
	
	public static void main(String[] cricket)
	{
		System.out.println("Running main method");
		
		String[] names={"Shreyas Iyer","Rishab Pant","K L Rahul","Dhoni","Virat"}; 		  //1st method
		Sports.cricketTeamMembers(names);
		
		int[] nos={8,55,88,98,36};												 	     //2nd method
		Sports.kabbadiTeamMembersJerseyNos(nos);
		
		double[] salaries={120000,155000,158000,190000,200000}; 						 //3rd method
		Sports.footBallTeamMembersSalary(salaries);
		
		long[] numbers={9562538452L,9685324536L,8662416456L,7892567814L,9886521456L}; 	 //4th method
		Sports.ludoTeamMobileNumber(numbers);
		
		int[] matches={8,12,14,16,18};												     //5th method
		Sports.hockeyTeamMembersNumberOfMatches(matches);
		
		long[] code={956255L,965668L,866265L,78924L,98456L}; 	 						//6th method
		Sports.kokoTeamMembersCountryCode(code);
		
		boolean[] status={true,true,true,false,true};								   //7th method
		Sports.lagoriTeamMembersAlive(status);

	}
}