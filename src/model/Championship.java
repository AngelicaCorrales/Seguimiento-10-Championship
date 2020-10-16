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

	/*
	public String registerPilot(String pName, int pAge, Team pTeam, int pAmountRaces){
		String message="El piloto ha sido registrado";
		addPilot(pName, pAge, pTeam, pAmountRaces);
		
		return message;
	}
	*/

	public void addPilot(String pName, int pAge, Team pTeam, int[] pScores){
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
		String message;
		double remainder;


		for(int i=0; i<pilots.length; i++){
			if(pilots[i]!=null){
				remainder=average[i]%3600;
				hours[i]=(average[i]-remainder)/3600;
				min[i]=(remainder-hours[i])/60;
				seg[i]=remainder%60;
			}
		}
		message="";

	}

}