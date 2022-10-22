class RailwayStationRunner{
	
	public static void main(String[] rail)
	{
		System.out.println("Calling the method before Initailizing all the properties");	
		RailwayStation.displayDetails();
		
		RailwayStation.type="Junction";
	    RailwayStation.use1 ="Public";
        RailwayStation.use2 ="Goods";
        RailwayStation.trainEngine ="Diesel Engine";
        RailwayStation.division ="SWR";
        RailwayStation.typeOfLift1 ="Elevator";
        RailwayStation.typeOfLift2 ="Escalator";
        RailwayStation.noOfPlatforms=8;
        RailwayStation.noOfGates=4;
        RailwayStation.noOfTicketCounters=12;
        RailwayStation.noOfWalkoverBridges=4;
        RailwayStation.noOfTracks=14;
        RailwayStation.noOfTrains=40;
        RailwayStation.dailyIncome=655555L;
        RailwayStation.monthlyIncome=18655555L;
        RailwayStation.helpLineNO=8866552476L;
        RailwayStation.passengers=55555L;
		
		String[] ref1={"Ac train","Passenger train","Goods train","Double Decker","SuperFast"};
		RailwayStation.typeOfTrainsInStation=ref1;
		
		String[] ref2={"first class","2nd class","2s","platform"};
	    RailwayStation.typeOfTickets=ref2;
		
		String[] ref3={"Tea stall","BookStall","WaterStall","FoodStall"};
        RailwayStation.typeOfStalls=ref3;
		
		String[] ref4={"Dosa","Idli","Wada","Chips","Palav"};
        RailwayStation.recipesOfFoodStall=ref4;
		
		String[] ref5={"Elevator","Escalator","Stairs","wheelChair"};
        RailwayStation.typeOfLifts=ref5;
		
		String[] ref6={"Mysore","Mandya","Tumkur","Maddur","Arsikere"};
        RailwayStation.destinations=ref6;
		
		String[] ref7={"Car","Bike","Cycle","AutoRickshaw"};
        RailwayStation.vehiclesInParking=ref7;	
		
		int[] ref8={1,2,3,4,5,6,7,8};
        RailwayStation.noOfPlatform=ref8;
		
		int[] ref9={16536,17823,78965,96542};
        RailwayStation.trainNumbers=ref9;
		
		char[] ref10={'a','b','c','d','e'};
        RailwayStation.sectionsOfParking=ref10;
		
		double[] ref11={9.25,6.45,8.30,4.10};
        RailwayStation.trainArrivalTimings=ref11;
		
		boolean[] ref12={true,true,false,true,true};
        RailwayStation.isPlatformWorking=ref12;
		
		System.out.println("\nRunning After Initailizing all the properties");	
		RailwayStation.displayDetails();
	}
}