class RailwayStation{
	
	static String type;
	static String use1;
	static String use2;
	static String trainEngine;
	static String division;
	static String typeOfLift1;
	static String typeOfLift2;
	static int 	  noOfPlatforms;
	static int 	  noOfGates;
	static int 	  noOfTicketCounters;
	static int 	  noOfWalkoverBridges;
	static int 	  noOfTracks;
	static int 	  noOfTrains;
	static long   dailyIncome;
	static long   monthlyIncome;
	static long   helpLineNO;
	static long   passengers;
	// Declaring Arrays
	static String[] typeOfTrainsInStation;
	static String[] typeOfTickets;
	static String[] typeOfStalls;
	static String[] recipesOfFoodStall;
	static String[] typeOfLifts;
	static String[] destinations;
	static String[] vehiclesInParking;	
	static int[]    noOfPlatform;
	static int[]    trainNumbers;
	static char[]   sectionsOfParking;
	static double[] trainArrivalTimings;
	static boolean[]isPlatformWorking;
	
	static void displayDetails()
	{
		System.out.println("type: "+type);
	    System.out.println("use1: "+use1);
	    System.out.println("use2: "+use2);
	    System.out.println("trainEngine: "+trainEngine);
	    System.out.println("division: "+division);
	    System.out.println("typeOfLift1: "+typeOfLift1);
        System.out.println("typeOfLift2: "+typeOfLift2);
        System.out.println("noOfPlatforms: "+noOfPlatforms);
        System.out.println("noOfGates: "+noOfGates);
        System.out.println("noOfTicketCounters: "+noOfTicketCounters);
        System.out.println("noOfWalkoverBridges: "+noOfWalkoverBridges);
        System.out.println("noOfTracks: "+noOfTracks);
        System.out.println("noOfTrains: "+noOfTrains);
        System.out.println("dailyIncome: "+dailyIncome);
        System.out.println("monthlyIncome: "+monthlyIncome);
        System.out.println("helpLineNO: "+helpLineNO);
        System.out.println("passengers: "+passengers);
		
		System.out.println("Accesing typeOfTrainsInStation array");
		if(typeOfTrainsInStation!=null)
		{
		    System.out.println("typeOfTrainsInStation is not directing to null so array is Executed");
			for(int i=0; i<typeOfTrainsInStation.length;i++)  //1
			{
				System.out.println((1+i) +" typeOfTrainsInStation: "+typeOfTrainsInStation[i]);
			}
		}else{
				System.out.println("typeOfTrainsInStation is directing to null .So for loop cannot be performed hence array is skipped");
			 }
		
		
		
		System.out.println("Accesing typeOfTickets array");
		if(typeOfTickets!=null)
		{
		    System.out.println("typeOfTickets is not directing to null so array is Executed");
			for(int i=0; i<typeOfTickets.length;i++)  //2
			{
				System.out.println((1+i) +" typeOfTicket: "+typeOfTickets[i]);
			}
		}else{
				System.out.println("typeOfTickets is directing to null .So for loop cannot be performed hence array is skipped");
			 }
			 
			 
			 
		System.out.println("Accesing typeOfStalls array");
		if(typeOfStalls!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");
			for(int i=0; i<typeOfStalls.length;i++)	//3
			{
				System.out.println((1+i) +" typeOfStall: "+typeOfStalls[i]);
			}
		}else{
				System.out.println("typeOfStalls is directing to null .So for loop cannot be performed hence array is skipped");
			 }	
			 
			 
			 
		System.out.println("Accesing recipesOfFoodStall array");
		if(recipesOfFoodStall!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");
			for(int i=0; i<recipesOfFoodStall.length;i++)		//4
			{
				System.out.println((1+i) +" recipesOfFoodStall: "+recipesOfFoodStall[i]);
			}
		}else{
				System.out.println("recipesOfFoodStall is directing to null .So for loop cannot be performed hence array is skipped");
			 }	
			 
			 
			 
		System.out.println("Accesing typeOfLifts array");
		if(typeOfLifts!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");
			for(int i=0; i<typeOfLifts.length;i++)	//5
			{
				System.out.println((1+i) +" typeOfLifts: "+typeOfLifts[i]);
			}
		}else{
				System.out.println("typeOfLifts is directing to null .So for loop cannot be performed hence array is skipped");
			 }
			 
			 
			 
		System.out.println("Accesing destinations array");
		if(destinations!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");
			for(int i=0; i<destinations.length;i++)	//6
			{
				System.out.println((1+i) +" destinations: "+destinations[i]);
			}
		}else{
				System.out.println("destinations is directing to null .So for loop cannot be performed hence array is skipped");
			 }	
			 
			 
			 
		System.out.println("Accesing vehiclesInParking array");
		if(vehiclesInParking!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");
			for(int i=0; i<vehiclesInParking.length;i++)	//7
			{
				System.out.println((1+i) +" vehiclesInParking: "+vehiclesInParking[i]);
			}
		}else{
				System.out.println("vehiclesInParking is directing to null .So for loop cannot be performed hence array is skipped");
			 }


			 
		System.out.println("Accesing noOfPlatform array");
		if(noOfPlatform!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");
			for(int i=0; i<noOfPlatform.length;i++)	//8
			{
				System.out.println("noOfPlatform: "+noOfPlatform[i]);
			}
		}else{
				System.out.println("noOfPlatform is directing to null .So for loop cannot be performed hence array is skipped");
			 }
			 
			 
			 
		System.out.println("Accesing trainNumbers array");
		if(trainNumbers!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");	
			for(int i=0; i<trainNumbers.length;i++)	//9
			{
				System.out.println((1+i) +" trainNumber: "+trainNumbers[i]);
			}
		}else{
				System.out.println("trainNumbers is directing to null .So for loop cannot be performed hence array is skipped");
			 }	
			 
			 
			 
		System.out.println("Accesing sectionsOfParking array");
		if(sectionsOfParking!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");	
			for(int i=0; i<sectionsOfParking.length;i++)	//10
			{
				System.out.println((1+i) +" sectionsOfParking: "+sectionsOfParking[i]);
			}
		}else{
				System.out.println("sectionsOfParking is directing to null .So for loop cannot be performed hence array is skipped");
			 }	
			 
			 
			 
		System.out.println("Accesing trainArrivalTimings array");
		if(trainArrivalTimings!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");	
			for(int i=0; i<trainArrivalTimings.length;i++)	//11
			{
				System.out.println((1+i) +" trainArrivalTimings: "+trainArrivalTimings[i]);
			}
		}else{
				System.out.println("trainArrivalTimings is directing to null .So for loop cannot be performed hence array is skipped");
			 }	


			 
		System.out.println("Accesing isPlatformWorking array");
		if(isPlatformWorking!=null)
		{
		    System.out.println("typeOfStalls is not directing to null so array is Executed");	
			for(int i=0; i<isPlatformWorking.length;i++)	//12
			{
				System.out.println("is "+ (1+i) + " PlatformWorking: "+isPlatformWorking[i]);
			}
		}else{
				System.out.println("isPlatformWorking is directing to null .So for loop cannot be performed hence array is skipped");
			 }		
	}
}