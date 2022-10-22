class ForestRunner{
	public static void main(String[] Ferrari){
		
		
	System.out.println("Name of the Forest : "+ Forest.name);
	System.out.println("Total Area :"+ Forest.totalArea+" squarekms");
	System.out.println("Forest type :"+ Forest.type);
	System.out.println("Region :"+ Forest.region);
     for(int i=0; i<Forest.primaryAnimals.length; i++)
	  {
	  System.out.println("The "+i+" index animal is "+Forest.primaryAnimals[i]);
	  }
	  
	  System.out.println("Re-initialized variables");
	  
	  Forest.name		="Nalmangalam Forest";
	  Forest.totalArea	=24d;
	  Forest.type		="Reserve Forest";
	  Forest.region     ="Tamilnadu";
	  Forest.primaryAnimals[2]="Elephant";
	  Forest.primaryAnimals[0]="Tiger";
	  
	  System.out.println("Name of the Forest : "+Forest.name);
	  System.out.println("Total Area :"+ Forest.totalArea+" squarekms");
	  System.out.println("Forest type :"+ Forest.type);
	  System.out.println("Region :"+ Forest.region);
     for(int i=0; i<Forest.primaryAnimals.length; i++)
	  {
	  System.out.println("The "+i+" index animal is "+Forest.primaryAnimals[i]);
	  }
	  
	  
	}
}
	