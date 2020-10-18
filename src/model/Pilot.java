package model;
enum Team{
	SCUDERIA_FERRARI,
	MCLAREN_F1_TEAM,
	RED_BULL_RACING, 
	MERCEDES_AMG,
	RACING_POINT,
	ALFA_ROMEO,
	RENAULT,
	WILLIAMS;
}

public class Pilot{
	//attributes
	private String name;
	private int age;
	private Team team;
	private int[] scores;

	//methods
	public Pilot(String pName, int pAge, String pTeam, int[] pScores){
		name=pName;
		age=pAge;
		scores= pScores;

		if(pTeam.equals("SCUDERIA FERRARI")){
			team=Team.SCUDERIA_FERRARI;
		}

		if(pTeam.equals("MCLAREN F1 TEAM")){
			team=Team.MCLAREN_F1_TEAM;
		}

		if(pTeam.equals("RED BULL RACING")){
			team=Team.RED_BULL_RACING;
		}

		if(pTeam.equals("MERCEDES AMG")){
			team=Team.MERCEDES_AMG;
		}

		if(pTeam.equals("RACING POINT")){
			team=Team.RACING_POINT;
		}

		if(pTeam.equals("ALFA ROMEO")){
			team=Team.ALFA_ROMEO;
		}

		if(pTeam.equals("RENAULT")){
			team=Team.RENAULT;
		}

		if(pTeam.equals("WILLIAMS")){
			team=Team.WILLIAMS;
		}


	}

	public String getName(){
		return name;
	}

	public void setName(String pName){
		name=pName;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int pAge){
		age=pAge;
	}

	public Team getTeam(){
		return team;
	}

	public void setTeam(Team pTeam){
		team=pTeam;
	}

	public int[] getScores(){
		return scores;
	}

	public void setScores(int[] pScores){
		scores=pScores;
	}

	public double calculateAverage(){
		double sumScores=0;
		double average;
		int quantityRaces=scores.length;
		for(int i=0; i<scores.length;i++){
			
				sumScores+=scores[i];
			
		}
		average=sumScores/quantityRaces;

		return average;
	}
}