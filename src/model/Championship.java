package model;
public class Championship{
	//attributes
	private int year;
	private int races;

	//relations
	private Pilot[] pilots;

	//methods
	public Championship(int pYear, int pRaces){
		year=pYear;
		races=pRaces;
		pilots= new Pilot[15];

	}

	public int getYear(){
		return year;
	}

	public void setYear(int pYear){
		year=pYear;
	}

	public int getRaces(){
		return races;
	}

	public void setRaces(int pRaces){
		races=pRaces;
	}

	public Pilot[] getPilots(){
		return pilots;
	}

	public void setPilots(Pilot[] pPilots){
		pilots=pPilots;
	}


	public void addPilot(String pName, int pAge, String pTeam, int[] pScores){
		boolean exist=findPilot(pName);
		boolean control=false;
		

		if (!exist){
			for(int i=0; i<pilots.length && !control; i++){
				if(pilots[i]==null){
					pilots[i]= new Pilot(pName, pAge, pTeam, pScores);
					control=true;
				}
			}

		}

	}

			

	public boolean findPilot(String pName){
		
		boolean found= false;
		for(int i=0; i<pilots.length && !found; i++){
			if(pilots[i]!=null && pilots[i].getName().equals(pName)){
				found=true;
			}
		}
		return found;
	}

	public String showAverageTimes(){
		String message="";
		double remainder;
		double[]hours= new double[pilots.length];
		double[]min= new double[pilots.length];
		double[]seg= new double[pilots.length];
		boolean control=false;


		for(int i=0; i<pilots.length; i++){
			if(pilots[i]!=null){
				control=true;
				remainder=pilots[i].calculateAverage()%3600;
				hours[i]=(pilots[i].calculateAverage()-remainder)/3600;
				min[i]=(remainder-hours[i])/60;
				seg[i]=remainder%60;
				message+="-El piloto "+pilots[i].getName()+" tiene un promedio del tiempo de las carreras de "+(int)hours[i]+" horas, "+(int)min[i]+" minutos, y "+seg[i]+" segundos \n \n";
			}
		}
		if (!control){
			message="No se han registrado pilotos";
		}
		
		return message;
	}

}